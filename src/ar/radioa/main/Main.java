package ar.radioa.main;

import java.util.ServiceLoader;

import userprofile.model.api.RadioListeners;
import userprofile.model.api.UserAuth;

public class Main {

 public static void main(String[] args) {

     var listeners = ServiceLoader.load(RadioListeners.class).findFirst().get();
//     listeners.listener(1);
//     listeners.newListener(personId, name, surname, phone, email, userName, pwd);
  
     var users = ServiceLoader.load(UserAuth.class).findFirst().get();
//     users.authenticate(user, password)
//     users.validate(token);
 }
}
