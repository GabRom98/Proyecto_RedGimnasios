package ProyectoATLbootcamp.Proyecto_RedGimnasios.services;


import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.GymActivity;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.repository.GymActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GymActivityService {

    @Autowired
    GymActivityRepository gymActivityRepository;

    public List<GymActivity> listAllGymActivities(){
        return (List<GymActivity>) gymActivityRepository.findAll();
    }

    public GymActivity findOneGymActivity(Long id){
        return gymActivityRepository.findById(id).orElse(null);
    }

    public GymActivity createGymActivity(GymActivity gymActivity){
        return gymActivityRepository.save(gymActivity);
    }

    public GymActivity updateGymActivity(Long id, GymActivity gymActivity){
        if (gymActivityRepository.existsById(id)){
            gymActivity.setId(id);
            return gymActivityRepository.save(gymActivity);
        }
        return null;
    }

    public void deleteGymActivity(Long id){
        gymActivityRepository.deleteById(id);
    }

}
