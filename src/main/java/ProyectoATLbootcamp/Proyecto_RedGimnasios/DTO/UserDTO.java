package ProyectoATLbootcamp.Proyecto_RedGimnasios.DTO;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class UserDTO {
    private Long id;
    private String first_name;
    private String last_name;
    private String phone;
    private String email;
    private String dni;
    private Date birthdate;
    private boolean is_active;
    private List<String> roles;
}
