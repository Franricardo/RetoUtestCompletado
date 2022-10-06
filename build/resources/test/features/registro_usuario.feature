#Autor

@Stories
Feature: Registro de usuario en la plataforma Utest.

  @Scenario:
  Scenario: Registro de Ricardo en Utest
    Given Ricardo quiere registrarse en la plataforma de Utest
    When El usuario ingresa toda la información requerida por la pagina
      | strNombre | strApellido | strEmail       | strMesNacimiento | strDiaNacimiento | strAnoNacimiento |strCiudad     | strZIP   | strPais    | strDispositivoMovil |  strModeloMovil  |   strSistemaOperativoMovil | strClave  |
      | Ricardo   | Herrera     | frangheri@utest.com | June            |  27              |     1995         |La Chorrera  | 507      |   Panama   |      Apple          |  iphone 4        |  iOS 11.1.2                | Turke0633. |
    Then El registro se completa cuando aparece el boton Complete Setup
      |  strTextoFinal |
      |Complete Setup  |




