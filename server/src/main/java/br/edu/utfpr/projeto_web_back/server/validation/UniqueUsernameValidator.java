package br.edu.utfpr.projeto_web_back.server.validation;


import br.edu.utfpr.projeto_web_back.server.annotation.UniqueUsername;
import br.edu.utfpr.projeto_web_back.server.repository.UsuarioRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String> {
    @Autowired
    private UsuarioRepository userRepository;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext) {
        return userRepository.findUserByusername(username) == null;
    }
}
