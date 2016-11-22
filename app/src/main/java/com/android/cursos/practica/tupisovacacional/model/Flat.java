package com.android.cursos.practica.tupisovacacional.model;

import com.android.cursos.practica.tupisovacacional.model.util.BeachStatus;
import com.android.cursos.practica.tupisovacacional.model.util.FlatQuality;
import com.android.cursos.practica.tupisovacacional.model.util.FlatType;

/**
 * Created by admina on 21/11/16.
 */

public class Flat {

    long mId;

    boolean mLift;

    boolean mPool;

    boolean mParking;

    BeachStatus mBeachStatus;

    int mRooms;

    int mFloor;

    FlatQuality mFlatQuality;

    FlatType mFlatType;

    public Flat() {
    }

}


