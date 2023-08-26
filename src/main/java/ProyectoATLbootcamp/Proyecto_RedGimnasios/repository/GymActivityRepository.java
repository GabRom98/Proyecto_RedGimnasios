package ProyectoATLbootcamp.Proyecto_RedGimnasios.repository;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.Activity;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.GymActivity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GymActivityRepository extends CrudRepository<GymActivity,Long> {
    @Query("SELECT new Activity(a.id, a.name, a.description)  FROM GymActivity AS ga INNER JOIN ga.idActivity AS a INNER JOIN ga.idGym AS g WHERE g.id = :idGym")
    public Iterable<Activity> findAllActivitiesByGym(@Param("idGym") Long idGym);
}
