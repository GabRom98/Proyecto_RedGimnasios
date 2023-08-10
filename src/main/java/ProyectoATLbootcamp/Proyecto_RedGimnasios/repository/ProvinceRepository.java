package ProyectoATLbootcamp.Proyecto_RedGimnasios.repository;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.Activity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends CrudRepository<Activity, Long> {
}
