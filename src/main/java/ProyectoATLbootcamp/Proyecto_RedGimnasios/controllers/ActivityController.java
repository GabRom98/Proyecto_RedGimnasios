package ProyectoATLbootcamp.Proyecto_RedGimnasios.controllers;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.services.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {
    @Autowired
    ActivityService activityService;
}
