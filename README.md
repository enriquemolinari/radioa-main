# RadioA - Main Module

This is the Main Java9+ Module of the RadioA sample application written as a demostration of the modular architecture for the book [Coding an Architecture Style](https://leanpub.com/codinganarchitecturestyle). See also the others three modules [Notifications Module](https://github.com/enriquemolinari/radioa-notifications), [UserProfile Module](https://github.com/enriquemolinari/radioa-userprofile) and [Competitions Module](https://github.com/enriquemolinari/radioa-competition). 

You can clone each module project and open them in an IDE. Notifications Module must have in ther modulepath the Competitions and the UserProfile module. While this Main module must have the three module projects in their modulepath.

To run the main.Main class, you will need to specify the following VM arguments:<br>
<p><b>-D</b>conn-string-comp = YOUR_COMPETITIONS_MODULE_CONN_STR</p>
<p><b>-D</b>user-comp = YOUR_USERNAME</p>
<p><b>-D</b>pwd-comp = YOUR_PWD</p>
<p><b>-D</b>conn-string = YOUR_USERPROFILE_MODULE_CONN_STR</p>
<p><b>-D</b>user = YOUR_USERNAME</p>
<p><b>-D</b>pwd = YOUR_PWD</p>
<p><b>-p</b> modules path folder and jar file dependencies</p>
<p><b>-m</b> radioa.main/ar.radioa.main.Main</p>
