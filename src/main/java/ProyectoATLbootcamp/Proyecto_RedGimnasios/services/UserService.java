package ProyectoATLbootcamp.Proyecto_RedGimnasios.services;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.DTO.UserDTO;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.Role;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.User;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.repository.RoleRepository;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.repository.UserRepository;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    public void registerUser(User user) {

        userRepository.save(user);
    }


    public List<User> getAllUsers() {
        return (List) userRepository.findAll();
    }

    public List<UserDTO> getAllUsersWithRoles() {
        List<User> users = (List<User>) userRepository.findAll();
        List<UserDTO> userDTOs = new ArrayList<>();

        for (User user : users) {
            UserDTO userDTO = new UserDTO();
            userDTO.setId(user.getId());
            userDTO.setFirst_name(user.getFirst_name());
            userDTO.setLast_name(user.getLast_name());
            userDTO.setPhone(user.getPhone());
            userDTO.setEmail(user.getEmail());
            userDTO.setDni(user.getDni());
            userDTO.setBirthdate(user.getBirthdate());
            userDTO.set_active(user.is_active());

            List<String> roleNames = user.getRoles().stream()
                    .map(Role::getName)
                    .collect(Collectors.toList());
            userDTO.setRoles(roleNames);

            userDTOs.add(userDTO);
        }

        return userDTOs;
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
