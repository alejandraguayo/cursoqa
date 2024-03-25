package cursoqa.clase7;

import com.Aleja.Clase7.Soldado;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SoldadoTest {
    
    @Test
    public void saludDespuesDePelear(){
        Soldado soldado= new Soldado(50);
        soldado.pelear(10);

        Assert.assertEquals(soldado.getSalud(), 45, "La salud no es correcta despues de pelear");
    }

    @Test
    public void soldadoMuerto(){
         Soldado soldado = new Soldado( 50);

         soldado.pelear(120);
         Assert.assertTrue(soldado.estaMuerto(), "el soldado no está muerto");
    }
    @Test
    public void elSoldadoDescansa() {
        Soldado soldado = new Soldado(15);

        soldado.descansar();

        Assert.assertEquals(soldado.getSalud(), 25);
    }

    }

