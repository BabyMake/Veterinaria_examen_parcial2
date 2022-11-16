
package Clases;


public class ColaMedicamentos 
{
    
    public Medicamentos colaMedicamentos;

    public ColaMedicamentos() {
        colaMedicamentos = null;
    }

 

    
    
    public void  encolar(String tipos, float costo, String nombreRefaccion, String nombreTrabajador, float sueldo)
    {
        Medicamentos nuevo = new Medicamentos(tipos,costo,nombreRefaccion,nombreTrabajador,sueldo);
        
        if(colaMedicamentos == null)
        {
            colaMedicamentos = nuevo;
        }
        else
        {
            Medicamentos aux = colaMedicamentos;
            
            while(aux.getSiguienteAut() != null)
            {
                aux = aux.getSiguienteAut();
            }
            aux.setSiguienteAut(nuevo);
        }
    }
    
    public String recorrerCola()
    {
        String valor = "\n";
        Medicamentos aux = colaMedicamentos;
        
        
        if(colaMedicamentos == null)
        {
            System.out.println("No hay nada en la pila ponle algo >:");
            return "Cola vacia";
        }
        else
        {
            while(aux != null)
            {
                valor += "Nombre Medicamento:"+aux.getNombreDoctor()+"\n";
                valor += "Nombre del Docotor:"+aux.getNombreMascota()+"\n";
                valor += "Sueldo"+aux.getGanancias()+"\n";
                valor += "Tipos:"+aux.getMedicinas()+"\n";
                valor += "Costos:"+aux.getCosto()+"\n";
                aux = aux.getSiguienteAut();
            }   
        }
        return valor;
    }
    
     
   
    
}

    

