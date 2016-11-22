package com.android.cursos.practica.tupisovacacional.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.android.cursos.practica.tupisovacacional.HolidayFlatApplication;
import com.android.cursos.practica.tupisovacacional.R;
import com.google.firebase.database.FirebaseDatabase;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    FirebaseDatabase mFirebaseDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((HolidayFlatApplication)getApplication()).getApplicationComponent().inject(this);

        if (mFirebaseDatabase== null) {
            Log.i(TAG, "onCreate: Firebase is null");
        } else {
            Log.i(TAG, "onCreate: Firebase is not null");
        }


    }
}
