package ProyectoATLbootcamp.Proyecto_RedGimnasios.services;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {
    @Autowired
    ActivityRepository activityRepository;
}
