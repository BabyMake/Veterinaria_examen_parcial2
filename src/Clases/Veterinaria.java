
package Clases;


public class Veterinaria 
{
    private String nombreDoctor;
    private String nombreMascota;
    private float ganancias;
    //private Refacciones siguienteRef;

    public Veterinaria() {
        this.nombreDoctor = "";
        this.nombreMascota = "";
        this.ganancias = 0;
        //this.siguienteRef = null;
    }

    public Veterinaria(String nombreDoctor, String nombreMascota, float ganancias) {
        this.nombreDoctor = nombreDoctor;
        this.nombreMascota = nombreMascota;
        this.ganancias = ganancias;
        //this.siguienteRef = siguienteRef;
    }



    /*
    public Refacciones getSiguienteRef() {
        return siguienteRef;
    }

    public void setSiguienteRef(Refacciones siguienteRef) {
        this.siguienteRef = siguienteRef;
    }
    */

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public float getGanancias() {
        return ganancias;
    }

    public void setGanancias(float ganancias) {
        this.ganancias = ganancias;
    }
    
    
    
    
    
}
