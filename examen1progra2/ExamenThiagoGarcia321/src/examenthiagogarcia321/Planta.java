package examenthiagogarcia321;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public abstract class Planta {
    private String nombre;
    private String ubicacion;
    private String clima;
    private static List<Planta> plantas = new ArrayList<>();

    
    public Planta(String nombre, String ubicacion, String clima) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.clima = clima;
    }


    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }
    
        
    @Override
    public boolean equals(Object o){ 
        if(this == o){
            return true;
        }
        if(o == null || getClass() != o.getClass()){ 
            return false;
        }
        Planta other = (Planta) o;
        return nombre.equals(other.nombre) 
                && ubicacion.equals(other.ubicacion);
    }
    
    @Override
    public int hashCode(){
      return Objects.hash(nombre, ubicacion);
    }
    
    public static void agregarPlanta(Planta planta) {
        if(planta == null){
            throw new NullPointerException("Me pasate un null");
        }
        if (plantas.contains(planta)) {
            throw new PlantaRepetidaException();
        } 
        plantas.add(planta);
        
    }
    
    public static void mostrarPlantas() {
        for (Planta planta : plantas) {
            System.out.println(planta);
        }
    }
    
    public static void podarPlantas() {
        for (Planta planta : plantas) {
            planta.podar();
        }
    }
    

    @Override
    public String toString() {
        return "Planta: " + nombre + ", Ubicación: " + ubicacion + ", Clima: " + clima;
    }
    

    public abstract void podar();
}

    

