package ProyectoATLbootcamp.Proyecto_RedGimnasios.controllers;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.User;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.services.AuthService;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class AuthController {
    @Autowired
    private AuthService authService;
    @Autowired
    private JWTUtil jwtUtil;
    @PostMapping("/api/login")
    public String login(@RequestBody User user) {
        User userlogin = authService.loginUser(user);

        if (userlogin != null) {
            String tokenJwt = jwtUtil.create(String.valueOf(userlogin.getId()), userlogin.getEmail());
            return tokenJwt;
        }

        return "FAIL";
    }
}