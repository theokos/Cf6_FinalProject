package cf6.finalproject.controller;

import cf6.finalproject.config.JwtProvider;
import cf6.finalproject.model.User;
import cf6.finalproject.repository.CartRepository;
import cf6.finalproject.repository.UserRepository;
import cf6.finalproject.service.CostumerUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")

public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtProvider jwtProvider;

    @Autowired
    private CostumerUserDetailsService costumerUserDetailsService;

    @Autowired
    private CartRepository cartRepository;

    public ResponseEntity<AuthResponse>createUserHandler(@RequestBody User user){

    }
}
