package com.android.cursos.practica.tupisovacacional.injector.component;

import android.app.Application;

import com.android.cursos.practica.tupisovacacional.HolidayFlatApplication;
import com.android.cursos.practica.tupisovacacional.activity.MainActivity;
import com.android.cursos.practica.tupisovacacional.injector.module.ApplicationModule;
import com.android.cursos.practica.tupisovacacional.injector.scope.PerApplication;
import com.google.firebase.database.FirebaseDatabase;

import dagger.Component;

/**
 * Created by admina on 17/11/16.o
 *
 */
@PerApplication
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    Application application();
    HolidayFlatApplication holidayFlatApplication();
    FirebaseDatabase firebaseDataBase();
    void inject(MainActivity mainActivity);

}
