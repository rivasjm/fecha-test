package es.unican.is2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class VehiculoTest {

    private Vehiculo vehiculo;

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
            Arguments.of(LocalDate.now().minusYears(20), 50.0),
            Arguments.of(LocalDate.now().minusYears(10), 50.0),
            Arguments.of(LocalDate.now().minusYears(10).plusDays(1), 80.0),
            Arguments.of(LocalDate.now().minusYears(6), 80.0),
            Arguments.of(LocalDate.now().minusYears(4), 80.0),
            Arguments.of(LocalDate.now().minusYears(4).plusDays(1), 100.0),
            Arguments.of(LocalDate.now().minusYears(2), 100.0),
            Arguments.of(LocalDate.now(), 100.0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testCalculaImpuesto(LocalDate fechaFabricacion, double impuestoEsperado) {
        vehiculo = new Vehiculo(fechaFabricacion);
        assertEquals(impuestoEsperado, vehiculo.calculaImpuesto(), 0.01);
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testCalculaImpuestoMal(LocalDate fechaFabricacion, double impuestoEsperado) {
        vehiculo = new Vehiculo(fechaFabricacion);
        assertEquals(impuestoEsperado, vehiculo.calculaImpuestoMal(), 0.01);
    }

    
}