package br.edu.utfpr.projeto_web_back.server.validation;


import br.edu.utfpr.projeto_web_back.server.annotation.UsernameUnico;
import br.edu.utfpr.projeto_web_back.server.repository.UsuarioRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class UsernameUnicoValidator implements ConstraintValidator<UsernameUnico, String> {
    @Autowired
    private UsuarioRepository userRepository;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext) {
        return userRepository.findUserByUsername(username) == null;
    }
}
