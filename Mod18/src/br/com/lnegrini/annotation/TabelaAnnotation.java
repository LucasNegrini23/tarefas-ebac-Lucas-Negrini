package br.com.lnegrini.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface TabelaAnnotation {

    String nome();
    String idade();
    String sexo();
}
