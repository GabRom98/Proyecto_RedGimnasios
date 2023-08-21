package ProyectoATLbootcamp.Proyecto_RedGimnasios.controllers;


import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.Role;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.services.RoleService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

public class RoleControllerTest {

    @Mock
    private RoleService roleService;

    @InjectMocks
    private RoleController roleController;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetAllRoles() {
        when(roleService.listAllRoles()).thenReturn(Arrays.asList(new Role(), new Role()));
        List<Role> roles = roleController.getAllRoles();
        assertEquals(2, roles.size());
    }

    @Test
    public void testGetRoleById() {
        Long roleId = 1L;
        Role mockRole = new Role();
        when(roleService.findOneRole(roleId)).thenReturn(mockRole);
        Role role = roleController.getRoleById(roleId);
        assertNotNull(role);
        assertEquals(mockRole, role);
    }

    @Test
    public void testCreateRole() {
        Role role = new Role();
        when(roleService.createRole(role)).thenReturn(role);
        Role createdRole = roleController.createRole(role);
        assertNotNull(createdRole);
    }

    @Test
    public void testUpdateRole() {
        Long roleId = 1L;
        Role role = new Role();
        when(roleService.updateRole(roleId, role)).thenReturn(role);
        Role updatedRole = roleController.updateRole(roleId, role);
        assertNotNull(updatedRole);
    }

    @Test
    public void testDeleteRole() {
        Long roleId = 1L;
        doNothing().when(roleService).deleteRole(roleId);
        roleController.deleteRole(roleId);
        verify(roleService, times(1)).deleteRole(roleId);
    }
}
