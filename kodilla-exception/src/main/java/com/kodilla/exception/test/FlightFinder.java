package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    Map<String, Boolean> avaibleAirport;



         FlightFinder(Map avaibleAirport){
             this.avaibleAirport = avaibleAirport;
         }


     public boolean findFlight(Flight flight) throws RouteNotFoundException{


         String arrivalAirport = flight.getArrivalAirport();
         String departureAirport = flight.getDepartureAirport();

         Boolean isAvaibleArrivalAirpot = avaibleAirport.containsKey(arrivalAirport);
         Boolean isAvaibleDepartureAirport = avaibleAirport.containsKey(departureAirport);

         if (isAvaibleArrivalAirpot && isAvaibleDepartureAirport){

              if(avaibleAirport.get(arrivalAirport) && avaibleAirport.get(departureAirport)){
                  System.out.println("Flight avaible ");
                  return true;
              }
              else if(!avaibleAirport.get(arrivalAirport)){
                  System.out.println("No avaible flight on arrival airport");
                  return false;
              }
              else{
                  System.out.println("No avaible flight on departure airport");
                  return false;
              }
         }
         else {
             String message;

             if(isAvaibleArrivalAirpot){
                 message = flight.departureAirport + " has no airport.";
             }
            else{
                 message = flight.arrivalAirport + " has no airport.";
             }

             throw new RouteNotFoundException(message);
         }
    }

    public static void main(String[] args) {

        Map<String, Boolean> avaibleAirport = new HashMap<>();

        avaibleAirport.put("Warsaw", true);
        avaibleAirport.put("Gdansk", true);
        avaibleAirport.put("Vienna", true);
        avaibleAirport.put("Prague", false);
        avaibleAirport.put("Paris", false);
        avaibleAirport.put("Berlin", false);
        avaibleAirport.put("Hamburg", false);

         Flight flight1 = new Flight("Warsaw", "Gdansk");
         Flight flight2 = new Flight("Kowno", "Arktyka");
         Flight flight3 = new Flight("Paris", "Himalaje");
         Flight flight4 = new Flight("Tokio", "Berlin");

         FlightFinder flightFinder = new FlightFinder(avaibleAirport);

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
