# Challenge-ONE-Back-End-Conversor-De-Moneda
![unnamed](https://github.com/aristobulo99/Challenge-ONE-Back-End-Conversor-De-Moneda/assets/64171570/fe743d3c-095f-4fd9-8f1e-89604fe60451)

## Badges
![Badge en Desarollo](https://img.shields.io/badge/STATUS-%20Culminado-green)
![Badge en Desarollo](https://img.shields.io/badge/VERSION-%200.0.1-green)

## Índice

*[Challenge-ONE-Back-End-Conversor-De-Moneda](#Challenge-ONE-Back-End-Conversor-De-Moneda)

*[Badges](#Badges)

*[Índice](#Índice)

*[Descripción del proyecto](#Descripción-del-proyecto)

*[Estado del proyecto](#Estado-del-proyecto)

*[Características de la aplicación y demostración](#Características-de-la-aplicación-y-demostración)

*[Acceso al proyecto](#acceso-proyecto)

*[Tecnologías utilizadas](#tecnologías-utilizadas)

*[Personas Contribuyentes](#personas-contribuyentes)

*[Personas-Desarrolladores del Proyecto](#personas-desarrolladores)

* [Licencia](#licencia)

*[Conclusión](#conclusión)

## Descripción-del-proyecto:
  1). Conversión de Monedas: Permitir a los usuarios convertir entre diferentes monedas utilizando tasas de cambio establecida para el proyecto. Esto facilitaría   la comparación de precios y el cálculo de costos en diferentes monedas(De Pesos a Dólar, De Pesos a Euro, De Pesos a Libras Esterlinas, De Pesos a Yen, De Pesos a Won Coreano, De Dólar a Pesos, De Euro a Pesos, De Libras a Pesos, De Yen a Pesos y De Won Coreano a Pesos) al realizar transacciones internacionales.

  2). Conversión de Masa: Permitir la conversión entre unidades de masa, como Microgramo, Miligramo, gramos, kilogramos y Toneladas. Esto sería útil para actividades relacionadas con la cocina, la industria y la ciencia.

  3). Conversión de Longitud: Facilitar la conversión de longitudes entre sistemas métrico Micrometro, Milimitro, Centimetro, Metros y Kilometro. Esto sería útil para medir distancias y dimensiones en diferentes contextos.

  4). Conversión de Temperatura: Posibilitar la conversión entre escalas de temperatura como Celsius, Fahrenheit y Kelvin. Esto permitiría a los usuarios comprender las temperaturas en diferentes regiones del mundo o en diversos campos científicos.

## Estado-del-proyecto

:trophy: Proyecto finalizado :trophy:

## Características-de-la-aplicación-y-demostración
:hammer: Funcionalidad 1: Al elegir el conversor de monedas se despliega un nueva pestaña en la que nos indica que debemos de ingresar la cantidad monetaria que deseamos convertir. Despues de ingresar un valor valido se procede a seleccionar la opción de conversión de la moneda:
[
	"De Pesos a Dólar",
	"De Pesos a Euro",
"De Pesos a Libras Esterlinas",
	"De Pesos a Yen",
	"De Pesos a Won Coreano",
	"De Dólar a Pesos",
	"De Euro a Pesos",
	"De Libras a Pesos",
	"De Yen a Pesos",
	"De Won Coreano a Pesos"
]
Para cada conversión se tiene los valores respectivos por defecto:
[
	4168.00,
	4552.08,
	5296.07,
	28.88,
	3.17,
	4168.00,
	4552.08,
	5296.07,
	28.88,
	3.17
]
Una vez seccionada la moneda la clase procede a realizar la respectiva conversión.

:hammer: Funcionalidad 2: Al elegir el conversor de Masa se despliega un nueva pestaña en la que nos indica que debemos de ingresar la cantidad que deseamos convertir. Después de ingresar un valor valido se procede a seleccionar la unidad asociada al valor ingresado ya sea Microgramo, Miligramo, gramos, kilogramos o Toneladas. Posteriormente se despliega una pestaña que no indica cual es la unidad que deseamos convertir siendo Microgramo, Miligramo, gramos, kilogramos o Toneladas, una vez seleccionada la opción se despliega una pestaña indicándonos el resultado.

:hammer: Funcionalidad 3: Al elegir el conversor de Longitud se despliega un nueva pestaña en la que nos indica que debemos de ingresar la cantidad que deseamos convertir. Después de ingresar un valor valido se procede a seleccionar la unidad asociada al valor ingresado ya sea Micrómetro, Milímetro, Centímetro, Metros o Kilometro. Posteriormente se despliega una pestaña que no indica cual es la unidad que deseamos convertir siendo sea Micrómetro, Milímetro, Centímetro, Metros o Kilometro, una vez seleccionada la opción se despliega una pestaña indicándonos el resultado.

:hammer: Funcionalidad 4: Al elegir el conversor de Temperatura se despliega un nueva pestaña en la que nos indica que debemos de ingresar la cantidad que deseamos convertir. Después de ingresar un valor valido se procede a seleccionar la unidad asociada al valor ingresado ya sea Celsius, Fahrenheit o Kelvin. Posteriormente se despliega una pestaña que no indica cual es la unidad que deseamos convertir siendo sea Celsius, Fahrenheit o Kelvin, una vez seleccionada la opción se despliega una pestaña indicándonos el resultado.

:hammer: Funcionalidad 5: 
Como funcionalidad en común al momento de ingresar el valor este input es controlado con la finalidad que solo se pueden ingresar valores de tipo Integer  o Double, si se ingresa otro tipo de valor al procedes de despliega una pestaña lanzado un mensaje con el tipo de excepción. También al momento de terminar contamos con una pestaña dispuesto con un mensaje preguntándonos si queremos continuar en donde contamos con opciones como Si, No o Cancelar.

