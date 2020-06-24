module radioa.main {
 requires radioa.userprofile;
 requires radioa.competition;
 requires radioa.notifications;
 
 uses userprofile.model.api.RadioListeners;
 uses userprofile.model.api.UserAuth;
}