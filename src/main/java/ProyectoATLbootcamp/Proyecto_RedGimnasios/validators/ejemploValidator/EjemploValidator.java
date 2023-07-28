package ProyectoATLbootcamp.Proyecto_RedGimnasios.validators.ejemploValidator;

public class EjemploValidator {
    public boolean isValidate(String gimName){
        if(gimName.length() > 30){
            return false;
        }
        return true;
    }
}

