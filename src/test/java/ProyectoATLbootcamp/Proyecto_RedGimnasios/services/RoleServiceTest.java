package ProyectoATLbootcamp.Proyecto_RedGimnasios.services;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.Role;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.repository.RoleRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


public class RoleServiceTest {


    @Mock
    private RoleRepository roleRepository;

    @InjectMocks
    private RoleService roleService;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testListAllRoles() {
        when(roleRepository.findAll()).thenReturn(Arrays.asList(new Role(), new Role()));
        List<Role> roles = roleService.listAllRoles();
        assertEquals(2, roles.size());
    }

    @Test
    public void testFindOneRole() {
        Long roleId = 1L;
        Role mockRole = new Role();
        when(roleRepository.findById(roleId)).thenReturn(Optional.of(mockRole));
        Role role = roleService.findOneRole(roleId);
        assertNotNull(role);
        assertEquals(mockRole, role);
    }

    @Test
    public void testCreateRole() {
        Role role = new Role();
        when(roleRepository.save(role)).thenReturn(role);
        Role createdRole = roleService.createRole(role);
        assertNotNull(createdRole);
    }

    @Test
    public void testUpdateRole() {
        Long roleId = 1L;
        Role existingRole = new Role();
        existingRole.setId(roleId);
        Role updatedRole = new Role();
        updatedRole.setId(roleId);
        when(roleRepository.existsById(roleId)).thenReturn(true);
        when(roleRepository.save(any(Role.class))).thenReturn(updatedRole);
        Role result = roleService.updateRole(roleId, existingRole);
        assertNotNull(result);
        assertEquals(updatedRole, result);
    }

    @Test
    public void testDeleteRole() {
        Long roleId = 1L;
        when(roleRepository.existsById(roleId)).thenReturn(true);
        doNothing().when(roleRepository).deleteById(roleId);
        roleService.deleteRole(roleId);
        verify(roleRepository, times(1)).deleteById(roleId);
    }
}
