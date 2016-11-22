package com.android.cursos.practica.tupisovacacional.injector.module;

import android.app.Application;

import com.android.cursos.practica.tupisovacacional.HolidayFlatApplication;
import com.android.cursos.practica.tupisovacacional.injector.scope.PerApplication;
import com.google.firebase.database.FirebaseDatabase;

import dagger.Module;
import dagger.Provides;

/**
 * Created by admina on 17/11/16.
 */

@Module
public class ApplicationModule {

    private final HolidayFlatApplication mHolidayFlatApplication;

    public ApplicationModule(HolidayFlatApplication holidayFlatApplication) {
        mHolidayFlatApplication = holidayFlatApplication;
    }

    @Provides
    @PerApplication
    public HolidayFlatApplication provideHolidayFlatApplication() {
        return mHolidayFlatApplication;
    }

    @Provides
    @PerApplication
    public Application provideApplication() {
        return mHolidayFlatApplication;
    }

    @Provides
    @PerApplication
    public FirebaseDatabase provideFireBaseDatabase() {
        return FirebaseDatabase.getInstance();
    }

}
