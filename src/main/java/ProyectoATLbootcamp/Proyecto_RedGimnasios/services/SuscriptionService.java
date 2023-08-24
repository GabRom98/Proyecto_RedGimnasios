package ProyectoATLbootcamp.Proyecto_RedGimnasios.services;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.Suscription;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.SuscriptionType;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.repository.SuscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
public class SuscriptionService {

    @Autowired
    SuscriptionRepository suscriptionRepository;

    public List<Suscription> getAllSuscriptions(){
        return (List<Suscription>) suscriptionRepository.findAll();
    }

    public Suscription getSuscription(Long userID) {
        for(Suscription suscription: getAllSuscriptions()){
            if(Boolean.TRUE.equals(suscription.getIs_active()) && Objects.equals(suscription.getId(), userID)){
                return suscription;
            }
        }
        return null;

    }

    public void addSuscription(Suscription suscription) {
        if (suscription == null) throw new IllegalArgumentException("subscription invalided");
        suscriptionRepository.save(suscription);
    }

    public void deleteByUserId(Long userID) {
        for(Suscription suscription: getAllSuscriptions()){
            if(Boolean.TRUE.equals(suscription.getIs_active()) && Objects.equals(suscription.getId(), userID)){
                suscriptionRepository.deleteById(suscription.getId());
                return;
            }
        }
    }

    public void desactiveByUserId(Long userID) {
        for(Suscription suscription: getAllSuscriptions()){
            if(Boolean.TRUE.equals(suscription.getIs_active()) && Objects.equals(suscription.getId(), userID)){
                suscription.setIs_active(false);
                suscriptionRepository.save(suscription);
                return;
            }
        }
    }

    public void activeByUserId(Long userID) {
        for(Suscription suscription: getAllSuscriptions()){
            if(Boolean.FALSE.equals(suscription.getIs_active()) && Objects.equals(suscription.getId(), userID)){
                suscription.setIs_active(true);
                suscriptionRepository.save(suscription);
                return;
            }
        }
    }
}
