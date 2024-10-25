package main.java.anotacao;

import java.lang.annotation.*;

/**
 * @author lucas
 */

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ITipoChave {

    String value();
}
