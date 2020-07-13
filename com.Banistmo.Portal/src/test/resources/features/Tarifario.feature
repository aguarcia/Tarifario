# language : es

Característica: Tarifario de Cuenta de Depósito
  Como un cliente
  Quiero que el sistema me muestre un tarifario de cuentas
  Para poder descargar la informacion en pdf

  @DescargarPDF
  Escenario: Descargar Tarifario en PDF
    Dado que ingreso al Portal de Banistmo
    Cuando me encuentro en la opcion de tarifario
    Entonces descargo la informacion en pdf
