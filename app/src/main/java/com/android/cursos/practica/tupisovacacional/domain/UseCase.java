package com.android.cursos.practica.tupisovacacional.domain;

import rx.Observable;

/**
 * Created by admina on 22/11/16.
 */

public interface UseCase<T> {

    Observable<T> execute();
}
