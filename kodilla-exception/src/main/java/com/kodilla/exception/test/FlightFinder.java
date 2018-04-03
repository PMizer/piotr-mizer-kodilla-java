package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

     public boolean findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> avaibleAirport = new HashMap<>();

         avaibleAirport.put("Warsaw", true);
         avaibleAirport.put("Gdansk", true);
         avaibleAirport.put("Vienna", true);
         avaibleAirport.put("Prague", false);
         avaibleAirport.put("Paris", false);
         avaibleAirport.put("Berlin", false);
         avaibleAirport.put("Hamburg", false);

         String arrivalAirport = flight.getArrivalAirport();
         String departureAirport = flight.getDepartureAirport();

         Boolean isAvaibleArrivalAirpot = avaibleAirport.get(arrivalAirport);
         Boolean isAvaibleDepartureAirport = avaibleAirport.get(departureAirport);

         if (isAvaibleArrivalAirpot && isAvaibleDepartureAirport){
             System.out.println("Flight avaible");
             return true;
         }
         else {
             String message;

             if(!isAvaibleArrivalAirpot && !isAvaibleDepartureAirport){
                 message = "No airport in any of those cities";
             }
             else if(!isAvaibleArrivalAirpot){
                 message = "No airport in arrival location";

             }
             else{
                 message = "No airport in departure location";
             }

             throw new RouteNotFoundException(message);
         }
    }

    public static void main(String[] args) {
         Flight flight1 = new Flight("Warsaw", "Gdansk");
         Flight flight2 = new Flight("Vienna", "Prague");
         Flight flight3 = new Flight("Paris", "Gdansk");
         Flight flight4 = new Flight("Hamburg", "Berlin");

         FlightFinder flightFinder = new FlightFinder();

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
