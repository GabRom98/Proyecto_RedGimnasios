package ProyectoATLbootcamp.Proyecto_RedGimnasios.services;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.User;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void registerUser(User user) {
        userRepository.save(user);
    }


    public List<User> getAllUsers() {
        return (List) userRepository.findAll();
    }

    public User getUser(Long id) {
        return userRepository.findById(id).get();
    }

    public ResponseEntity<String> updateUser(Long id, User updatedUser) {
        User existingUser = userRepository.findById(id).orElse(null);
        if (existingUser != null) {
            existingUser.setFirst_name(updatedUser.getFirst_name());
            existingUser.setLast_name(updatedUser.getLast_name());
            existingUser.setPhone(updatedUser.getPhone());
            existingUser.setEmail(updatedUser.getEmail());

            userRepository.save(existingUser);
            return ResponseEntity.ok("Usuario actualizado exitosamente");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontró el usuario");
        }
    }

    public User updateUserStatus(Long id) {
        User user = userRepository.findById(id).orElse(null);

        if (user != null) {
            user.set_active(false);
            return userRepository.save(user);
        } else {
            return null;
        }
    }
}
