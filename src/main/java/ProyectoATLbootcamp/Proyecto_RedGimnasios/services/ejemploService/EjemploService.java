package ProyectoATLbootcamp.Proyecto_RedGimnasios.services.ejemploService;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.ModelEjemplo;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.repository.EjemploRepository;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.validators.ejemploValidator.EjemploValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EjemploService implements EjemploInterface{
    @Autowired
    private EjemploRepository ejemploRepository;

    @Override
    public List<ModelEjemplo> getAll() {
        return ejemploRepository.getAll();
    }

    @Override
    public String agregar(ModelEjemplo modelEjemplo) {
        String gym = modelEjemplo.getNombreGim();

        EjemploValidator ejemploValidator= new EjemploValidator();
        if(ejemploValidator.isValidate(gym) == false){
            return "La cantidad de caracteres es muy larga para el nombre";
        }

        ejemploRepository.agregar(modelEjemplo);
        return "Se ha agregado el gimnasio";
    }

}
