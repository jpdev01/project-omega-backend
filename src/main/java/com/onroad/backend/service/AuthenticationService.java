package com.onroad.backend.service;

import com.onroad.backend.entity.User;
import com.onroad.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class AuthenticationService {

    @Autowired
    private UserRepository userRepository;
    public Optional<User> validadeLogin(String paramLogin, String paramPassword)
    {
        Integer id = userRepository.validate(paramLogin, paramPassword);
        if (id != null)
        {
            Optional<User> user = userRepository.findById(id);
            return user;
        }
        return null;
        // FIXME retornar para a tela de acesso negado!
    }
}
