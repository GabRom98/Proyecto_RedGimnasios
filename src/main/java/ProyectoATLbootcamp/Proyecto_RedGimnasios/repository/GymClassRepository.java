package ProyectoATLbootcamp.Proyecto_RedGimnasios.repository;


import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.GymClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymClassRepository extends CrudRepository<GymClass, Long> {
}
