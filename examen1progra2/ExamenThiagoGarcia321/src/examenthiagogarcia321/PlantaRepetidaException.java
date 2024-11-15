package examenthiagogarcia321;

public class PlantaRepetidaException extends RuntimeException{
    
    private static final String MESSAGE = "Ya existe una planta con el mismo nombre y ubicación.";

    public PlantaRepetidaException() {
        super(MESSAGE);
    }
    
}
