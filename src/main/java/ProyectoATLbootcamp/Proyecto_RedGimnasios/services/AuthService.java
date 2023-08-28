package ProyectoATLbootcamp.Proyecto_RedGimnasios.services;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.User;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.repository.AuthRepository;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    AuthRepository authRepository;


    public User loginUser(User user) {
         User userDb = authRepository.findByEmail(user.getEmail());

        if (user != null) {
            Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
            if (argon2.verify(userDb.getPassword(), user.getPassword())) {
                return user;
            }
        }

        return  null;
    }

}
