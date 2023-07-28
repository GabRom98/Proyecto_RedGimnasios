package ProyectoATLbootcamp.Proyecto_RedGimnasios.repository;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.ModelEjemplo;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EjemploRepository {
    @PersistenceContext
    private EntityManager entityManager;
    @Transactional
    public void agregar(ModelEjemplo modelEjemplo){
        entityManager.merge(modelEjemplo);
    }

    @Transactional
    public List<ModelEjemplo> getAll() {
        String consultaSql = "SELECT nombreGim FROM ModelEjemplo";

        return entityManager.createQuery(consultaSql).getResultList();
    }
}
