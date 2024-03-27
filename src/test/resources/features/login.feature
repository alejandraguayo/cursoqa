# language: es


Característica: Login

  @TEST-1234
  Escenario: Login válido
    Dado que el usuario ingresa a la página de login
    Cuando el usuario se loguea con credenciales validas
    Entonces el usuario se encuentra en su cuenta

    Escenario: login invalido
     Dado que el usuario ingresa a la página de login
     Cuando el usuario se loguea con credenciales invalidas
      Entonces se muestra un mensaje de error en las credenciales
