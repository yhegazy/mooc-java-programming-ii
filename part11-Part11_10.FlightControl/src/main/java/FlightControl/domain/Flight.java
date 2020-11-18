package FlightControl.domain;

public class Flight {

    private Airplane plane;
    private Places airportDestination;
    private Places airportDeparture;
    
    public Flight(Airplane plane, Places destination, Places departure){
        this.plane = plane;
        this.airportDestination = destination;
        this.airportDeparture = departure;
    }
    
    public Airplane getAirplane(){
        return this.plane;
    }
    
    public Places getDeparture(){
        return this.airportDeparture;
    }
    
    public Places getDestination(){
        return this.airportDestination;
    }
    
    @Override
    public String toString() {
        return this.plane.toString() + " (" + this.airportDeparture + "-" + this.airportDestination + ")";
    }
    
}
