# Descripción de las Pruebas

Este directorio contiene las pruebas unitarias para el proyecto. Las pruebas están diseñadas para garantizar el correcto funcionamiento de las clases y métodos implementados en el código fuente.

## Pruebas incluidas

### VehiculoTest

- **Propósito**: Validar el cálculo del impuesto basado en la antigüedad del vehículo.
- **Casos de prueba**:
  - Vehículo nuevo (2 años de antigüedad): Impuesto esperado de 100.0.
  - Vehículo de antigüedad media (6 años): Impuesto esperado de 80.0.
  - Vehículo viejo (12 años de antigüedad): Impuesto esperado de 50.0.

## Ejecución de las pruebas

Para ejecutar las pruebas, utiliza el siguiente comando de Maven:

```bash
mvn test
```

Esto ejecutará todas las pruebas definidas en este directorio y generará un informe en la carpeta `target/surefire-reports`.