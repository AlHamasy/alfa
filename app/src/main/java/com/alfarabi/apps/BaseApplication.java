package com.alfarabi.apps;

import com.alfarabi.alfalibs.AlfaLibsApplication;
import com.alfarabi.alfalibs.http.HttpInstance;

/**
 * Created by Alfarabi on 6/30/17.
 */

public class BaseApplication extends AlfaLibsApplication {

    @Override
    protected boolean getBuildConfigDebug() {
        return false;
    }

    @Override
    protected String getBuildConfigVersionName() {
        return null;
    }

    @Override
    public String emailReportApps() {
        return null;
    }

    @Override
    public String subjectLineReportApps() {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        //HttpInstance.init("https://api.github.com/", 10, 30, 10);
    }
}
