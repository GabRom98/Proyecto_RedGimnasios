package ProyectoATLbootcamp.Proyecto_RedGimnasios.controllers;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.Role;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class RoleController {

    @Autowired
    RoleService roleService;

    @GetMapping("roles")
    public List<Role> getAllRoles(){
        return roleService.listAllRoles();
    }

    @GetMapping("roles/{id}")
    public Role getRoleById(@PathVariable Long id){
        return roleService.findOneRole(id);
    }

    @PostMapping("roles")
    public Role createRole(@RequestBody Role role){
        return roleService.createRole(role);
    }

    @PutMapping("roles/{id}")
    public Role updateRole(@PathVariable Long id, @RequestBody Role role){
        return roleService.updateRole(id,role);
    }

    @DeleteMapping("roles/{id}")
    public void deleteRole(@PathVariable Long id){
        roleService.deleteRole(id);
    }

}
