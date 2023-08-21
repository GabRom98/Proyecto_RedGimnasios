package ProyectoATLbootcamp.Proyecto_RedGimnasios.services;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.Activity;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {
    @Autowired
    ActivityRepository activityRepository;

    public List<Activity> getAllActivities () {
        return (List<Activity>) activityRepository.findAll();
    }

    public Activity getActivity (Long id) {
        return activityRepository.findById(id).orElse(null);
    }

    public Activity addActivity (Activity activity) {
        return activityRepository.save(activity);
    }

    public void deleteActivity(Long id) {
        activityRepository.deleteById(id);
    }
}
