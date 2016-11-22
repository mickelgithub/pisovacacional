package com.android.cursos.practica.tupisovacacional;

import android.app.Application;

import com.android.cursos.practica.tupisovacacional.injector.component.ApplicationComponent;
import com.android.cursos.practica.tupisovacacional.injector.component.DaggerApplicationComponent;
import com.android.cursos.practica.tupisovacacional.injector.module.ApplicationModule;

/**
 * Created by admina on 17/11/16.
 */

public class HolidayFlatApplication extends Application {

    private ApplicationComponent mApplicationComponent;



    @Override
    public void onCreate() {
        super.onCreate();
        setupInjector();
    }

    private void setupInjector() {
        mApplicationComponent= DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }
}
