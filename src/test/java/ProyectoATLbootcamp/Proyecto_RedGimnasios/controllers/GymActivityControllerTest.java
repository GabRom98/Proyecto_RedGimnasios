package ProyectoATLbootcamp.Proyecto_RedGimnasios.controllers;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.Activity;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.GymActivity;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.services.GymActivityService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

public class GymActivityControllerTest {
    @Mock
    private GymActivityService gymActivityService;

    @InjectMocks
    private GymActivityController gymActivityController;

    @BeforeEach
    public void init(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllGymActivities(){
        when(gymActivityService.listAllGymActivities()).thenReturn(List.of(new GymActivity()));
        List<GymActivity> gymActivities = gymActivityController.getAllGymActivities();
        assertEquals(1, gymActivities.size());
    }

    @Test
    void testGetGymActivityById(){
        Long gymActivityId = 1L;
        GymActivity mockGymActivity = new GymActivity();
        when(gymActivityService.findOneGymActivity(gymActivityId)).thenReturn(mockGymActivity);
        GymActivity gymActivity = gymActivityController.getGymActivityById(gymActivityId);
        assertNotNull(gymActivity);
        assertEquals(mockGymActivity, gymActivity);
    }

    @Test
    void testGetActivitiesByGym() {
        Long gymId = 1L;
        when(gymActivityService.findActivitiesByGym(gymId)).thenReturn(List.of(new Activity()));
        List<Activity> activity = gymActivityController.getActivitiesByGym(gymId);
        assertEquals(1, activity.size());
    }

    @Test
    void testCreateGymActivity(){
        GymActivity gymActivity = new GymActivity();
        when(gymActivityService.createGymActivity(gymActivity)).thenReturn(gymActivity);
        GymActivity createdGymActivity = gymActivityController.createGymActivity(gymActivity);
        assertNotNull(createdGymActivity);
    }

    @Test
    void testUpdateGymActivity(){
        Long gymActivityId = 1L;
        GymActivity gymActivity = new GymActivity();
        when(gymActivityService.updateGymActivity(gymActivityId, gymActivity)).thenReturn(gymActivity);
        GymActivity updatedGymActivity = gymActivityController.updateGymActivity(gymActivityId, gymActivity);
        assertNotNull(updatedGymActivity);
    }

    @Test
    void testDeleteGymActivity(){
        Long gymActivityId = 1L;
        doNothing().when(gymActivityService).deleteGymActivity(gymActivityId);
        gymActivityController.deleteGymActivity(gymActivityId);
        verify(gymActivityService, times(1)).deleteGymActivity(gymActivityId);
    }

}
