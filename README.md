# RadioA - Main Module

This is the Main Java9+ Module of the RadioA sample application written as a demostration of the modular architecture for the book [An Introduction to Software Architecture](https://leanpub.com/introsoftwarearchitecture). See also the others three modules [Notifications Module](https://github.com/enriquemolinari/radioa-notifications), [UserProfile Module](https://github.com/enriquemolinari/radioa-userprofile) and [Competitions Module](https://github.com/enriquemolinari/radioa-competition). 

You can clone each module project and open them in an IDE. Notifications Module must have in ther modulepath the Competitions and the UserProfile module. While this Main module must have the three module projects in their modulepath.

To run the Main.main, you will need to specify the following VM arguments:
-Dconn-string-comp=YOUR_COMPETITIONS_MODULE_CONN_STR
-Duser-comp=YOUR_USERNAME
-Dpwd-comp=YOUR_PWD

-Dconn-string=YOUR_USERPROFILE_MODULE_CONN_STR
-Duser=YOUR_USERNAME
-Dpwd=YOUR_PWD

-p modules path folder and jar file dependencies
-m radioa.main/ar.radioa.main.Main
