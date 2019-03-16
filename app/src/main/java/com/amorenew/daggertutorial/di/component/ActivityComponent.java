package com.amorenew.daggertutorial.di.component;

import com.amorenew.daggertutorial.activities.MainActivity;
import com.amorenew.daggertutorial.di.module.ActivityModule;
import com.amorenew.daggertutorial.di.PerActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
