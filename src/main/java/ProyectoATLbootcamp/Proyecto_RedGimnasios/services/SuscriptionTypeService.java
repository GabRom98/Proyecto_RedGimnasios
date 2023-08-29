package ProyectoATLbootcamp.Proyecto_RedGimnasios.services;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.SuscriptionType;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.repository.SuscriptionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuscriptionTypeService {

    @Autowired
    SuscriptionTypeRepository suscriptionTypeRepository;

    public List<SuscriptionType> getAllSuscriptionsTypes () {
        return (List<SuscriptionType>) suscriptionTypeRepository.findAll();
    }

    public SuscriptionType getSuscriptionType (Long id) {
        return suscriptionTypeRepository.findById(id).orElse(null);
    }

    public SuscriptionType addSuscriptionType (SuscriptionType suscriptiontype) {
        return suscriptionTypeRepository.save(suscriptiontype);
    }

    public SuscriptionType updateSuscriptionType(Long id, SuscriptionType suscriptiontype){
        if (suscriptionTypeRepository.existsById(id)){
            suscriptiontype.setId(id);
            return suscriptionTypeRepository.save(suscriptiontype);
        }
        return null;
    }
    public void deleteSuscriptionType(Long id) {
        suscriptionTypeRepository.deleteById(id);
    }

}
