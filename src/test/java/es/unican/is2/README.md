## Descripción

- **Cálculo del impuesto del vehículo**:
  - Vehículo nuevo (menos de 4 años de antigüedad): Impuesto esperado de 100.0.
  - Vehículo de antigüedad media (menos de 10 años de antigüedad): Impuesto esperado de 80.0.
  - Vehículo viejo (vehículos a partir de 10 años de antigüedad): Impuesto esperado de 50.0.

## Casos de prueba para la clase Vehiculo

Este archivo describe los casos de prueba implementados en `VehiculoTest.java` para verificar el cálculo del impuesto de un vehículo basado en su fecha de fabricación.

### Casos de prueba

Los casos de prueba se generan utilizando un método parametrizado con diferentes fechas de fabricación y el impuesto esperado. A continuación, se describen los casos en una tabla:

| Fecha de primera matriculación      | Impuesto esperado |
|-------------------------------------|-------------------|
| Hoy - 20 años                       | 50.0              |
| Hoy - 10 años                       | 50.0              |
| Hoy - 10 años + 1 día               | 80.0              |
| Hoy - 6 años                        | 80.0              |
| Hoy - 4 años                        | 80.0              |
| Hoy - 4 años + 1 día                | 100.0             |
| Hoy - 2 años                        | 100.0             |
| Hoy                                 | 100.0             |

### Métodos de prueba

Se implementan dos métodos de prueba:

1. `testCalculaImpuesto`: Verifica el cálculo correcto del impuesto.
2. `testCalculaImpuestoMal`: Verifica un cálculo alternativo del impuesto para propósitos de comparación.

### Ejecución de las pruebas

Para ejecutar las pruebas, utiliza el siguiente comando de Maven:

```bash
mvn clean test
```

Esto ejecutará todas las pruebas definidas en este directorio y generará un informe en la carpeta `target/surefire-reports`.