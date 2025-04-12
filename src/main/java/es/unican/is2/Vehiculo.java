package es.unican.is2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Vehiculo {
    private LocalDate fecha;

    public Vehiculo(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double calculaImpuesto() {
        double impuestoBase = 100.0;
        long antiguedad = ChronoUnit.YEARS.between(fecha, LocalDate.now());

        if (antiguedad <= 4) {
            return impuestoBase;
        } else if (antiguedad <= 10) {
            return impuestoBase * 0.8; // 20% descuento
        } else {
            return impuestoBase * 0.5; // 50% descuento
        }
    }

    public double calculaImpuestoMal() {
        double impuestoBase = 100.0;
        int antiguedad = LocalDate.now().getYear() - fecha.getYear();

        if (antiguedad <= 4) {
            return impuestoBase;
        } else if (antiguedad <= 10) {
            return impuestoBase * 0.8; // 20% descuento
        } else {
            return impuestoBase * 0.5; // 50% descuento
        }
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}