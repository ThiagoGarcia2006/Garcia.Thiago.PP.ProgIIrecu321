package examenthiagogarcia321;

import java.util.ArrayList;
import java.util.List;

public class Jardin implements Mantenimiento {
    private String nombre;
    private List<Planta> plantas;

    public Jardin(String nombre) {
        this.nombre = nombre;
        this.plantas = new ArrayList<>();
    }

    public void agregarPlanta(Planta planta) {
        if (plantas.contains(planta)) {
            throw new PlantaRepetidaException();
        }
        plantas.add(planta);
    }

    public void eliminarPlanta(Planta planta) {
        plantas.remove(planta);
    }

    public void mostrarPlantas() {
        for (Planta planta : plantas) {
            System.out.println(planta);
        }
    }

    @Override
    public void regar() {
        System.out.println("Regando todas las plantas en el jardín " + nombre);
        for (Planta planta : plantas) {
            if (planta instanceof Mantenimiento) {
                ((Mantenimiento) planta).regar();
            }
        }
    }

    @Override
    public void fertilizar() {
        System.out.println("Fertilizando todas las plantas en el jardín " + nombre);
        for (Planta planta : plantas) {
            if (planta instanceof Mantenimiento) {
                ((Mantenimiento) planta).fertilizar();
            }
        }
    }
}
