package com.android.cursos.practica.tupisovacacional.injector.scope;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by admina on 17/11/16.
 */
@Scope
@Retention(RUNTIME)
public @interface PerApplication {
}
