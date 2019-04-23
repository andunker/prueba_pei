INSTRUCCIONES
1- Instalar docker
2- Ejecutar en terminal 'sh start.sh' dentro de la raiz del proyecto
3- Ya podemos ejecutar alguno de los llamados al servicio. 'http://localhost:9090/'   

NOTA: MIRAR EL CONTRATO PARA HACER LOS LLAMADOS A LOS ENDPOINTS VIA POSTMAN

Contrato del servicio (Tambien se puede visualizar el contrato en el archivo swagger.json)
http://localhost:9090/swagger-ui.html#/

BASE DE DATOS H2
http://localhost:9090/h2-console
JDBC URL: jdbc:h2:mem:pruebafabiodatabase
user name: root
password: root

NOTA: AL MOMENTO DE LA SINCRONIZACION DE LOS DATOS DEL SERVICIO SOAP, DEBERIA CADA MOVIMIENTO DEVOLVER UN ID
      PARA NO VOLVER A ESCRIBIR LOS MISMOS REGISTROS EN BASE DE DATOS, ESTOS AL SER MOVIMIENTO DE TARJETA PUEDEN 
      TODOS LOS CAMPOS SER UNICOS Y HABER OTRO REGISTRO IGUAL. TAMBIEN DE IGUAL MODO PARA LLEVAR LOS DATOS A UNA
      SUPUESTA BASE DE DATOS MASTER A LA QUE SE CONECTA EL SERVICIO EXPUESTO SOAP, TAMBIEN ESTE DEBERIA TENER EN SUPUESTA
      CONTRATO LA IMPLEMENTACION DE GUARDAR MOVIMIENTOS Y TARJETAS PARA TENER UNA SINCRONIZACION DE REGRESO.


url en github: https://github.com/andunker/prueba_pei

Autor:
Fabio Andres Mora Ossa
Ingeniero de Sistemas - Backend developer en domicilios.com