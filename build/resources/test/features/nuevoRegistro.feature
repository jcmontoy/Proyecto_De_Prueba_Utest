#Autor: julio.montoya

@tag
Feature: registro de nuevo usuario
  Yo como nuevo usuario
  Quiero registrarme
  Para poder ingresar a la pagina uTest

  @tag2
  Scenario Outline: registro de nuevo usuario
    Given me quiero registrar en la pagina de uTest
    When ingreso los datos del primer registro
      | firstName   | lastName   | emailAddress   | month   | day   | year   | languagesSpoken   |
      | <firstName> | <lastName> | <emailAddress> | <month> | <day> | <year> | <languagesSpoken> |
    And ingreso los datos del segundo registro
      | city   | zipOrPostalCode   | country   |
      | <city> | <zipOrPostalCode> | <country> |
    And ingreso los datos del tercer registro
      | yourComputer   | version   | language   | yourMobileDevice   | model   | operatingSystem   |
      | <yourComputer> | <version> | <language> | <yourMobileDevice> | <model> | <operatingSystem> |
    And ingreso los datos del cuarto registro
      | createYourUtestPassword   | confirmPassword   | stayInformed   | uTestTermOfUse   | privacyYSecurity   |
      | <createYourUtestPassword> | <confirmPassword> | <stayInformed> | <uTestTermOfUse> | <privacyYSecurity> |
    Then verifico que el mensaje del registro sea: "Welcome to the world's largest community of freelance software testers!"

    Examples:
      | firstName | lastName | emailAddress      | month   | day | year | languagesSpoken | city   | zipOrPostalCode | country | yourComputer | version | language | yourMobileDevice | model    | operatingSystem | createYourUtestPassword | confirmPassword | stayInformed | uTestTermOfUse | privacyYSecurity |
      | Juan      | Montoya  | email@Address.com | January | 20  | 2002 | Itagüi          | 055414 | Alberta         | Canada  | Linux        | Ubuntu  | Spanish  | Alcatel          | OT-C700A | Android 2.0     | Reto2021*!              | Reto2021*!      |              |                |                  |