package ProyectoATLbootcamp.Proyecto_RedGimnasios.repository;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}

