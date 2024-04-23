package codoacodo.vuelosapi.services;

import codoacodo.vuelosapi.configuration.FlightConfiguration;
import codoacodo.vuelosapi.model.Dolar;
import codoacodo.vuelosapi.model.Flight;
import codoacodo.vuelosapi.repository.FlightRepository;
import codoacodo.vuelosapi.utils.FlightUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FlightService {




    @Autowired
    FlightRepository flightRepository;
    @Autowired
    FlightUtils flightUtils;

    @Autowired
    FlightConfiguration flightConfiguration;

    public List<Flight> returnAllFlights(){
        return flightRepository.findAll();
    }

    public void createFlight(Flight flight) {
        flightRepository.save(flight);
    }

    public Flight findFlightId (Long id){
        return flightRepository.findById(id).orElse(new Flight());
    }

    public void deleteFlightId (Long id){

    }

    public Flight updateFlight(Flight flight){
        flightRepository.save(flight);
        return flightRepository.findById(flight.getId()).orElse(null);
    }

    public List<Flight> getOffers(int offerPrice) {
        List<Flight> flights = flightRepository.findAll();
        return flightUtils.detectOffers(flights,offerPrice);
    }

    public Dolar getDolar() {
        Dolar dolar = flightConfiguration.fetchDolar();
        return dolar;
    }
}
