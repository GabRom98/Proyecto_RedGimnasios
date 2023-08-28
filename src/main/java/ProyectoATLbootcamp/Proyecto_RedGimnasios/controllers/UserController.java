package ProyectoATLbootcamp.Proyecto_RedGimnasios.controllers;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.DTO.UserDTO;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.User;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.services.UserService;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.utils.JWTUtil;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    private JWTUtil jwtUtil;

    private boolean validarToken(String token){
        String usuarioId = jwtUtil.getKey(token);
        return usuarioId != null;
    }


    @PostMapping("/api/users")
    public void registerU(@RequestBody User user) {
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hash = argon2.hash(2, 1024, 1, user.getPassword());

        user.setPassword(hash);

        userService.registerUser(user);
    }

    @GetMapping("/api/users")
    public List<UserDTO> getAllU(/*@RequestHeader(value = "Authorization") String token*/){
/*        if (!validarToken(token)){
            return null;
        }*/
       return userService.getAllUsersWithRoles();
    }

    @GetMapping("/api/users/{id}")
    public User getU(@PathVariable("id") Long id) {
        return userService.getUser(id);
    }

    @PutMapping("/api/users/{id}")
    public ResponseEntity<String> updateU(@PathVariable("id") Long id, @RequestBody User updatedUser) {
        return userService.updateUser(id, updatedUser);
    }

    @PutMapping("/api/user-active/{id}")
    public ResponseEntity<String> updateUserStatus(@PathVariable("id") Long id) {
        User updatedUser = userService.updateUserStatus(id);

        if (updatedUser != null) {
            return ResponseEntity.ok("Estado de usuario actualizado exitosamente");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
