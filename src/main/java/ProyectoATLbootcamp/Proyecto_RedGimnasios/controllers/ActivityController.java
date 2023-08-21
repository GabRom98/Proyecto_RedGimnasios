package ProyectoATLbootcamp.Proyecto_RedGimnasios.controllers;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.Activity;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.services.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ActivityController {
    @Autowired
    ActivityService activityService;

    @GetMapping("/api/gimnasio/activity/{id}")
    public Activity getAcvity(@PathVariable Long id) {
        return activityService.getActivity(id);
    }

    @GetMapping("/api/gimnasio/activities")
    public List<Activity> getAllActivities() {
        return activityService.getAllActivities();
    }

    @PostMapping("/api/gimnasio/activity")
    public void addActivity (@RequestBody Activity activity) {
        activityService.addActivity(activity);
    }

    @DeleteMapping("/api/gimnasio/activity/{id}")
    public void deleteActivity (@PathVariable Long id) {
        activityService.deleteActivity(id);
    }

}
