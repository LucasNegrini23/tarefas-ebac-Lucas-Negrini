package br.com.lnegrini.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.LOCAL_VARIABLE})
public @interface TabelaAnnotation {

    String nome();
    String idade();
    String sexo();
}
