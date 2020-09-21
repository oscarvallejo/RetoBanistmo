#language: es

  Característica: Se desea comprobar la longitud del código de reserva de LATAM
    Escenario: Verificar codigo
      Dado que el cliente quiere ingresar a la pagina "https://www.latam.com/"
      Cuando doy click en el vinculo "¿Dónde lo encuentras?"
      Entonces verifico que el codigo "VBCDGG" sea de 6 cifras
