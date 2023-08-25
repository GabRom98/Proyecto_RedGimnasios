package ProyectoATLbootcamp.Proyecto_RedGimnasios.services;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.Activity;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.GymActivity;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.repository.GymActivityRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class GymActivityServiceTest {

    @Mock
    private GymActivityRepository gymActivityRepository;

    @InjectMocks
    private GymActivityService gymActivityService;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testListAllGymActivities(){
        when(gymActivityService.listAllGymActivities()).thenReturn(List.of(new GymActivity()));
        List<GymActivity> gymActivities = gymActivityService.listAllGymActivities();
        assertEquals(1, gymActivities.size());
    }

    @Test
    void testGetGymActivityById(){
        Long gymActivityId = 1L;
        GymActivity mockGymActivity = new GymActivity();
        when(gymActivityRepository.findById(gymActivityId)).thenReturn(Optional.of(mockGymActivity));
        GymActivity gymActivity = gymActivityService.findOneGymActivity(gymActivityId);
        assertNotNull(gymActivity);
        assertEquals(mockGymActivity, gymActivity);
    }

    @Test
    void testFindActivitiesByGym(){
        Long gymId = 1L;
        when(gymActivityRepository.findAllActivitiesByGym(gymId)).thenReturn(List.of(new Activity()));
        List<Activity> activity = gymActivityService.findActivitiesByGym(gymId);
        assertEquals(1, activity.size());
    }

    @Test
    void testCreateGymActivity(){
        GymActivity gymActivity = new GymActivity();
        when(gymActivityRepository.save(gymActivity)).thenReturn(gymActivity);
        GymActivity createdGymActivity = gymActivityService.createGymActivity(gymActivity);
        assertNotNull(createdGymActivity);
    }

    @Test
    void testUpdateGymActivity(){
        Long gymActivityId = 1L;
        GymActivity existingGymActivity = new GymActivity();
        existingGymActivity.setId(gymActivityId);
        GymActivity updatedGymActivity = new GymActivity();
        updatedGymActivity.setId(gymActivityId);
        when(gymActivityRepository.existsById(gymActivityId)).thenReturn(true);
        when(gymActivityRepository.save(any(GymActivity.class))).thenReturn(updatedGymActivity);
        GymActivity result = gymActivityService.updateGymActivity(gymActivityId, existingGymActivity);
        assertNotNull(result);
        assertEquals(updatedGymActivity, result);
    }

    @Test
    void testDeleteGymActivity(){
        Long gymActivityId = 1L;
        when(gymActivityRepository.existsById(gymActivityId)).thenReturn(true);
        doNothing().when(gymActivityRepository).deleteById(gymActivityId);
        gymActivityService.deleteGymActivity(gymActivityId);
        verify(gymActivityRepository, times(1)).deleteById(gymActivityId);
    }

}
