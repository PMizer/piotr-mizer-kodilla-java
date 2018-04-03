package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    Map<String, Boolean> avaibleAirport;



    FlightFinder(Map availableAirport){
        this.avaibleAirport = availableAirport;
    }


     public void findFlight(Flight flight) throws RouteNotFoundException{


         String arrival = flight.getArrivalAirport();
         if (!avaibleAirport.containsKey(arrival)) {
             throw new RouteNotFoundException("Arrival airport doesn't exist");
         }

         if(avaibleAirport.get(arrival)){
             System.out.println("Flight possible");
         }
         else {
             System.out.println("Airport is closed");
         }
    }

    public static void main(String[] args) {

         Map<String, Boolean> availableAirport = new HashMap<>();

         availableAirport.put("Warsaw", true);
         availableAirport.put("Gdansk", true);
         availableAirport.put("Vienna", true);
         availableAirport.put("Prague", false);
         availableAirport.put("Paris", false);
         availableAirport.put("Berlin", false);
         availableAirport.put("Hamburg", false);

         String departureAirport = "Warsaw";

         Flight flight1 = new Flight(departureAirport, "Gdansk");
         Flight flight2 = new Flight(departureAirport, "Arktyka");
         Flight flight3 = new Flight(departureAirport, "Himalaje");
         Flight flight4 = new Flight(departureAirport, "Prague");



         FlightFinder flightFinder = new FlightFinder(availableAirport);

         try{

             System.out.println(flight1.getDepartureAirport()+" to "+flight1.getArrivalAirport());
             flightFinder.findFlight(flight1);
         }
         catch (RouteNotFoundException e){
             System.out.println(e.getMessage());
         }


        try{
            System.out.println(flight2.getDepartureAirport()+" to "+flight2.getArrivalAirport());
            flightFinder.findFlight(flight2);
        }
        catch (RouteNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println(flight3.getDepartureAirport()+" to "+flight3.getArrivalAirport());
            flightFinder.findFlight(flight3);
        }
        catch (RouteNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println(flight4.getDepartureAirport()+" to "+flight4.getArrivalAirport());
            flightFinder.findFlight(flight4);
        }
        catch (RouteNotFoundException e){
            System.out.println(e.getMessage());
        }




    }
}
