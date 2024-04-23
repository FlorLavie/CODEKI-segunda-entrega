package codoacodo.vuelosapi.model;

import lombok.Data;

@Data
public class FlightDto {


    private Long id;
    private String origen;
    private String destino;
    private String fechaHoraSalida;
    private String fechaHoraLlegada;
    private Double convertedPrecio;
    private String frecuencia;


}
