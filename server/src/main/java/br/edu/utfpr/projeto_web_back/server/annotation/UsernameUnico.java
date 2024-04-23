package br.edu.utfpr.projeto_web_back.server.annotation;


import br.edu.utfpr.projeto_web_back.server.validation.UsernameUnicoValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = UsernameUnicoValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UsernameUnico {
    String message() default "{br.edu.utfpr.projeto_web_back.server.server.usuario.username.constraints.UniqueUsername.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
