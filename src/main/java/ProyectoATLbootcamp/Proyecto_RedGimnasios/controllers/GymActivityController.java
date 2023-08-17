package ProyectoATLbootcamp.Proyecto_RedGimnasios.controllers;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.GymActivity;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.services.GymActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class GymActivityController {

    @Autowired
    GymActivityService gymActivityService;

    @GetMapping("gymActivities")
    public List<GymActivity> getAllGymActivities(){
        return gymActivityService.listAllGymActivities();
    }

    @GetMapping("gymActivities/{id}")
    public GymActivity getGymActivityById(@PathVariable Long id){
        return gymActivityService.findOneGymActivity(id);
    }

    @PostMapping("gymActivities")
    public GymActivity createGymActivity(@RequestBody GymActivity gymActivity){
        return gymActivityService.createGymActivity(gymActivity);
    }

    @PutMapping("gymActivities/{id}")
    public GymActivity updateGymActivity(@PathVariable Long id, @RequestBody GymActivity gymActivity){
        return gymActivityService.updateGymActivity(id,gymActivity);
    }

    @DeleteMapping("gymActivities/{id}")
    public void deleteGymActivity(@PathVariable Long id){
        gymActivityService.deleteGymActivity(id);
    }

}
