package com.amorenew.daggertutorial.di.component;

import android.app.Application;
import android.content.Context;

import com.amorenew.daggertutorial.DemoApplication;
import com.amorenew.daggertutorial.data.DataManager;
import com.amorenew.daggertutorial.data.DbHelper;
import com.amorenew.daggertutorial.data.SharedPrefsHelper;
import com.amorenew.daggertutorial.di.ApplicationContext;
import com.amorenew.daggertutorial.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication demoApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();

    DbHelper getDbHelper();

}
