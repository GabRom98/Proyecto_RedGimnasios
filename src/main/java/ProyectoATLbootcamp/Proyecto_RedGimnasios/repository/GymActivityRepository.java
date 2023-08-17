package ProyectoATLbootcamp.Proyecto_RedGimnasios.repository;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.GymActivity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymActivityRepository extends CrudRepository<GymActivity,Long> {
    @Query(value = "SELECT a.id, a.name, a.description FROM gym_activity as ga INNER JOIN gyms as g ON ga.id_gym = g.id INNER JOIN activity as a ON ga.id_activity = a.id WHERE ga.id_gym = 1;", nativeQuery = true)
    public Iterable<GymActivity> findAllActivitiesByGym(Long idGym);
}
