Docs and drafts and pieces

.shap - copy this directory to HOME folder,

Open ~/.shap/shap-dev.env - it is environment variables for database connection parameters.
Set the correct value for SHAP_DB_PASSWORD - it is incorrect - find correct value in mh. Other variables are correct.

Then open ~/.bash_profile

Add the following line to it:

```
source "$HOME/.shap/shap-dev.env"
```

What it does is: when you launch a new terminal it executes ~/.bash_profile in order to set up the environment.
.bash_profile executes commands from $HOME/.shap/shap-dev.env and these commands set environment variables required for db connection.

The app reads db connection parameters from application.properties file which is compiled into the application jar.
And application.properties references only env vars, not real values.

Thus, the only place where unencrypted password is stored is $HOME/.shap/shap-dev.env

