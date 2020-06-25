package ar.radioa.main;

import java.util.ServiceLoader;

import competition.model.DefaultRadioProgram;
import competition.persistence.JdbcCompetitionRepository;
import notifications.infrastructure.BigQueueNotification;
import notifications.model.EmailNotification;
import userprofile.model.api.RadioListeners;
import userprofile.model.api.UserAuth;

public class Main {

 public static void main(String[] args) {

  String connString = System.getProperty("conn-string");
  String user = System.getProperty("user");
  String pass = System.getProperty("pwd");

  var listeners = ServiceLoader.load(RadioListeners.class).findFirst()
    .get();
//     listeners.listener(1);
//     listeners.newListener(personId, name, surname, phone, email, userName, pwd);

  var users = ServiceLoader.load(UserAuth.class).findFirst().get();
//     users.authenticate(user, password)
//     users.validate(token);

  var radioProgram = new DefaultRadioProgram(
    new JdbcCompetitionRepository(user, pass, connString),
    new EmailNotification(
      new BigQueueNotification("/home/enrique", "queue"), listeners));

  radioProgram.addInscription(1, 1);
 }
}
