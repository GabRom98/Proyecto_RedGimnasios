package ProyectoATLbootcamp.Proyecto_RedGimnasios.repository;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
}
