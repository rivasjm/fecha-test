package es.unican.is2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class VehiculoTest {

    @Test
    public void testCalculaImpuesto() {
        Vehiculo vehiculoNuevo = new Vehiculo(LocalDate.now().minusYears(2));
        assertEquals(100.0, vehiculoNuevo.calculaImpuesto(), 0.01);

        Vehiculo vehiculoMedio = new Vehiculo(LocalDate.now().minusYears(6));
        assertEquals(80.0, vehiculoMedio.calculaImpuesto(), 0.01);

        Vehiculo vehiculoViejo = new Vehiculo(LocalDate.now().minusYears(12));
        assertEquals(50.0, vehiculoViejo.calculaImpuesto(), 0.01);
    }

    @Test
    public void testCalculaImpuestoMal() {
        Vehiculo vehiculoNuevo = new Vehiculo(LocalDate.now().minusYears(2));
        assertEquals(100.0, vehiculoNuevo.calculaImpuesto(), 0.01);

        Vehiculo vehiculoMedio = new Vehiculo(LocalDate.now().minusYears(6));
        assertEquals(80.0, vehiculoMedio.calculaImpuesto(), 0.01);

        Vehiculo vehiculoViejo = new Vehiculo(LocalDate.now().minusYears(12));
        assertEquals(50.0, vehiculoViejo.calculaImpuesto(), 0.01);
    }
}