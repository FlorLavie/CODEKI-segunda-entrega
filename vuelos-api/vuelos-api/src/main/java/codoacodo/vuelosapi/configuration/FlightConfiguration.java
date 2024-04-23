package codoacodo.vuelosapi.configuration;

import codoacodo.vuelosapi.model.Dolar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class FlightConfiguration {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public Dolar fetchDolar(){
        RestTemplate restTemplate = restTemplate();
        String apiURL = "https://dolarapi.com/v1/dolares/tarjeta";
        return restTemplate.getForObject(apiURL, Dolar.class);
    }
}
