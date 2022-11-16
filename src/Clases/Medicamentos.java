
package Clases;


public class Medicamentos extends Veterinaria
{
    private String medicinas;
    private float costo;
    private Medicamentos siguienteMascota;


    public Medicamentos(String medicinas, float costo, String nombreDoctor, String nombreMascota, float ganancias) {
        super(nombreDoctor, nombreMascota, ganancias);
        this.medicinas = medicinas;
        this.costo = costo;
    }

    public Medicamentos() {
        
        this.medicinas = "";
        this.costo = 0;
        this.siguienteMascota = null;
    }

    public String getMedicinas() {
        return medicinas;
    }

    public void setMedicinas(String medicinas) {
        this.medicinas = medicinas;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public Medicamentos getSiguienteAut() {
        return siguienteMascota;
    }

    public void setSiguienteAut(Medicamentos siguienteAut) {
        this.siguienteMascota = siguienteAut;
    }
    
}
