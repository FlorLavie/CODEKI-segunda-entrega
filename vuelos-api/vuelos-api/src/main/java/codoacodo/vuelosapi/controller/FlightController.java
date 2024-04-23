package codoacodo.vuelosapi.controller;

import codoacodo.vuelosapi.model.Dolar;
import codoacodo.vuelosapi.model.Flight;
import codoacodo.vuelosapi.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    FlightService flightService;


    @GetMapping("/all")
    public List<Flight> getAllFlights () {
        return flightService.returnAllFlights();
    }


    @PostMapping("/create")
    public void createFlight(@RequestBody Flight flight){
        flightService.createFlight(flight);
    }

    @GetMapping("/{id}")
    public Flight findFlightById(@PathVariable Long id){

        return flightService.findFlightId(id);

    }
    @GetMapping("/offers")
    public List<Flight> getOffers(){
        int offerPrice = 200;
        return flightService.getOffers(offerPrice);
    }

    @DeleteMapping("/delete")
    public void deleteFlight(@PathVariable Long id){


        flightService.deleteFlightId(id);
    }

    @PutMapping("/update")
    public Flight updateFlight(@RequestBody Flight flight){
        return flightService.updateFlight(flight);
    }

    @GetMapping("/dolar")
    public Dolar getDolar(){
        return flightService.getDolar();
    }
}
