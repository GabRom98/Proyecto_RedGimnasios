package ProyectoATLbootcamp.Proyecto_RedGimnasios.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.Province;
@Repository
public interface ProvinceRepository extends CrudRepository<Province, Long> {
}
