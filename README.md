Explicación del Código
Interfaz Dispensador
* Define los métodos setSiguiente y dispensar. setSiguiente se usa para encadenar los manejadores y dispensar procesa la solicitud.

Clase Abstracta (DispensadorBase)
Implementa la interfaz Dispensador y proporciona una implementación básica para encadenar los manejadores. Los manejadores concretos extenderán esta clase y proporcionarán su lógica específica.

Clases Concretas (Dispensador100Mil, Dispensador50Mil, etc)
* Cada clase concreta extiende DispensadorBase y proporciona la lógica específica para manejar las solicitudes de dispensación de billetes.

Clase Main
Configura la cadena de manejadores y solicita al usuario un monto para dispensar. Valida que el monto sea un múltiplo de 5.000 y luego procesa la solicitud a través de la cadena de dispensadores.

Nota:
Cada clase concreta maneja la solicitud según su tipo de billete y luego pasa el monto restante al siguiente manejador en la cadena. Si el monto no es un múltiplo de 5.000, muestra un mensaje de error.