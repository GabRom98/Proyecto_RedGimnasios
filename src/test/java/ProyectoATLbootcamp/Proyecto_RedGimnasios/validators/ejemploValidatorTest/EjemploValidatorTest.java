package ProyectoATLbootcamp.Proyecto_RedGimnasios.validators.ejemploValidatorTest;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.validators.ejemploValidator.EjemploValidator;
import org.junit.Test;
import static org.junit.Assert.assertFalse;

public class EjemploValidatorTest {
    @Test
    public void EmailHaveArroba(){
        EjemploValidator validator = new EjemploValidator();
        boolean resultado = validator.isValidate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

        assertFalse(resultado);
    }
}
