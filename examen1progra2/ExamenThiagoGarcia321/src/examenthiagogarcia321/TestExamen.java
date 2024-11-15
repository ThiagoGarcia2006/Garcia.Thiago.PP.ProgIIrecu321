package examenthiagogarcia321;

public class TestExamen {


    public static void main(String[] args) {
        
        Planta arbol1 = new Arbol("Pino", "Jardín", "Frío", 10);
        Planta arbusto1 = new Arbusto("Rosal", "Jardín", "Cálido", 7);
        Planta flor1 = new Flor("Jazmin", "Jardín", "Tropical", Temporada.VERANO);
        Planta flor2 = new Flor("Tulipán", "Jardín", "Tropical", Temporada.PRIMAVERA);
        Planta arbusto2 = new Arbusto("Rosal", "Jardín", "Humedo", 9);
        
        try {
            
            Planta.agregarPlanta(arbol1);
            Planta.agregarPlanta(arbusto2);
            Planta.agregarPlanta(arbusto1);
            Planta.agregarPlanta(flor1);
            Planta.agregarPlanta(flor2);

                       
        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }
        catch(PlantaRepetidaException ex){
            System.out.println(ex.getMessage());
        }

        Planta.mostrarPlantas();
        Planta.podarPlantas();
    }
    
}
