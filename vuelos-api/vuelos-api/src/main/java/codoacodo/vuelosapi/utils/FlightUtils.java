package codoacodo.vuelosapi.utils;


import codoacodo.vuelosapi.model.Flight;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FlightUtils {

    public List<Flight> detectOffers(List<Flight> flights,double offerPrice){
        List<Flight> offers = new ArrayList<>();
        for (Flight flight : flights ){
            if(flight.getPrecio()< offerPrice){
              offers.add(flight);
            }
        }        return offers;
}
}