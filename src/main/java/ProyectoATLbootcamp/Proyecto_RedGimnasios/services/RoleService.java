package ProyectoATLbootcamp.Proyecto_RedGimnasios.services;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.Role;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    RoleRepository roleRepository;

    public List<Role> listAllRoles(){
        return (List<Role>) roleRepository.findAll();
    }


    public Role findOneRole(Long id){
        return roleRepository.findById(id).orElse(null);
    }


    public Role createRole(Role role){
        return roleRepository.save(role);
    }


    public Role updateRole(Long id, Role editRole){
        if (roleRepository.existsById(id)){
            editRole.setId(id);
            return roleRepository.save(editRole);
        }
        return null;
    }


    public void deleteRole(Long id){
        roleRepository.deleteById(id);
    }
}

