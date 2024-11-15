package examenthiagogarcia321;

public class Flor extends Planta implements Mantenimiento {
    private Temporada temporadaFlorecimiento;

    public Flor(String nombre, String ubicacion, String clima, Temporada temporadaFlorecimiento) {
        super(nombre, ubicacion, clima);
        this.temporadaFlorecimiento = temporadaFlorecimiento;
    }

    @Override
    public void podar() {
        System.out.println("La planta " + getNombre() + " no puede ser podada.");
    }

    @Override
    public void regar() {
        System.out.println("Regando la flor " + getNombre());
    }

    @Override
    public void fertilizar() {
        System.out.println("Fertilizando la flor " + getNombre());
    }

    @Override
    public String toString() {
        return super.toString() + ", Temporada de Florecimiento: " + temporadaFlorecimiento;
    }
}

