# git-sistema-de-reserva


### Resumen del Proyecto: Sistema de Reservas

**Objetivo:**  
Desarrollar un sistema de reservas que permita a los usuarios realizar, modificar y cancelar reservas de servicios (como hoteles, restaurantes, o eventos) de manera eficiente y amigable.

### Funcionalidades Principales:

1. **Registro de Usuarios:**
   - Los usuarios pueden registrarse y crear una cuenta.
   - Autenticación y gestión de sesiones.

2. **Gestión de Reservas:**
   - Los usuarios pueden buscar y ver disponibilidad de servicios.
   - Realizar nuevas reservas.
   - Modificar reservas existentes.
   - Cancelar reservas.

3. **Interfaz de Usuario:**
   - Interfaz gráfica (GUI) utilizando JavaFX o Swing.
   - Navegación intuitiva para facilitar la experiencia del usuario.

4. **Base de Datos:**
   - Almacenamiento de datos de usuarios y reservas en una base de datos (por ejemplo, MySQL o SQLite).
   - Operaciones CRUD (Crear, Leer, Actualizar, Borrar) para gestionar los datos.

5. **Notificaciones:**
   - Envío de confirmaciones y recordatorios de reservas por correo electrónico.

6. **Reportes:**
   - Generación de reportes sobre reservas y usuarios, útil para la administración del servicio.

### Tecnología Utilizada:

- **Lenguaje:** Java
- **Frameworks:** JavaFX o Swing para la interfaz gráfica, JDBC para la conexión a la base de datos.
- **Base de Datos:** MySQL, PostgreSQL o SQLite.
- **Otras Herramientas:** Maven o Gradle para la gestión de dependencias.

### Beneficios:

- Facilita la gestión de reservas para los usuarios.
- Aumenta la eficiencia en la administración de servicios.
- Mejora la experiencia del cliente mediante notificaciones y una interfaz amigable.

### Consideraciones:

- Implementar validaciones de entrada para evitar errores.
- Asegurar la protección de datos personales de los usuarios.
- Realizar pruebas para garantizar el correcto funcionamiento del sistema.

Este resumen puede servir como base para detallar los aspectos específicos del proyecto. 

*Author: Habcode*

 ejemplo:
  ## | Definición de actores y operaciones:
   **Actores:**
   * Recepcionista: Permitir que los clientes puedan realizar reservas en el hotel de manera online, o que los recepcionistas puedan gestionar las reservas en caso de que el cliente desee hacerlo manualmente. 

   *  Actor Cliente: Usario cuya intencion sea reservar una habitacion, dicho eso puede ser via intrnet, por la app del hotel, o puede hacer la reserva de forma 
   fisica.
   
   * Actor sistema de reserva: Sistema externo o integrado que gestiona pago, reservas, y disponibilidad en las habitaciones del hotel. El sistema debe permitir la confirmación de la disponibilidad de las habitaciones y el procesamiento de pagos.

   * Actor gestor de agencia de viajes: Este usuario nos dara facilidad y comodidad a la hora de encontrar clientes e incluso aumentar su flujo, tendremos contacto directo con el y le ofreceremos acceso a cierta informacion e disponibilidad en las habitaciones.
   
   **Operaciones:**
   * Cliente (Usuario que realiza la reserva).
   * Recepcionista (Empleado que gestiona reservas manualmente).
   * Sistema de Pagos (Sistema externo para procesar pagos).
   * Sistema de Pagos (Sistema externo para procesar pagos).
   

   **Especificacion de operaciones de actores:**
   * Cliente: 
      * Cliente inicia sesión en la página web o en la app del hotel para realizar una reserva.
      * Cliente selecciona la fecha de entrada y salida, el tipo de habitación y la cantidad de huéspedes.
      * Cliente selecciona la habitación y procede al pago.
      * Si el Cliente no puede acceder al sistema, puede ponerse en contacto con la o el Recepcionista.
      * Si el Cliente prefiere realizar la reserva manualmente o tiene problemas con el sistema en línea, la Recepcionista puede gestionar la reserva directamente.

   * Recepcionista :
      * Organizar y Gestionar las conexiones y comunicaciones telefónicas entre las personas interlocutoras internas y externas a la empresa o entidad.
      * Atiende las llamadas y gestiona las reservas.
      * La Recepcionista ingresa los datos del Cliente.
      * selecciona las fechas y habitaciones disponibles.
      *  y procesa el pago en el Sistema de Pagos.

   * Sistema:
      * El Sistema de Pagos debe estar operativo y conectado al sistema.
      * Si el Sistema no encuentra habitaciones disponibles, le muestra al Cliente una opción para seleccionar fechas alternativas o un mensaje de no disponibilidad.
      * La reserva ha sido confirmada exitosamente, y la Cliente tiene una habitación reservada para las fechas seleccionadas.
      * El Sistema de Gestión de Reservas ha registrado la reserva en la base de datos.
      * Si hubo pago, el Sistema de Pagos ha procesado y validado la transacción.
      *Sistema confirma la reserva y envía una confirmación por correo electrónico o mensaje al Cliente.La Reserva se guarda en la base de datos del Sistema de gestión de reservas.

````
                                    Case use:
+-------------------+                          +-----------------+    +--------+  
|     Cliente       |                          |  Recepcionista  |----|Agencia |
+-------------------+                          +-----------------+    |de viaje|
         |                                                 |          +-------+ 
         | Inicia Reserva                  Gestiona Reserva| 
         v                                                 v
+---------------------+  <----------------- +------------------------+   
|     Sistema         |                     |  Sistema de Pagos      | 
|     de Reservas     |                     +-----------------------+    
  +---------------------+                                 |              
         |                                                |
    Muestra Disponibilidad                             Procesa Pago
         |                                                |
         v                                                v
  Confirma Reserva                                     Validación
         |                                                |
         v                                                v
  Envía Confirmación                                    Respuesta Pago

````        

**Author: Habccode**                                                                     
---

# Definicion de los actores:

| caso de uso | XXX (Cliente) |
|---|---|
| sistema de reserva  | _cliente de reserva_  |
| busca habitaciones | _Le gusta los hoteles economicos_ |
| administrador/recepcionista| _ ofrece precios he informacion requerida._  |
| confirma reserva | _  cliente_ |   
|  Notas |  _Prefiere una habitacion con vista al oceano_ |
| administrador/recepcionista | _ se ejecuta el pago_ |
|Fecha | _01-11-2024_ |

|  Atributo |||
|---|---|---|
| _Nombre_  | _jhoaquin fenix_  | 
| | |
<<<<<<< HEAD
=======


|  caso de uso| XXX (recepcionista/ administrador) |
|---|---|
| sistemas de reserva  | _obtiene las entradas de clientes buscando reservas_  |
|  asigna habitaciones y da ofertas | _Le gusta los generos de fantasia y terror_ |
| cliente| _ solicita informacion de las habitaciones_  |
| asigna reserva | _el cliente escogio habitacion_ |   
|  Notas |  _ Prefiere una habitaicon con vista al oceano_ |
| se cobra el pago| _se ejecuta el pago_ |
|Fecha | _01-11-2024_ |

|  Atributo |||
|---|---|---|
| _Nombre_  | _Administrador/recepcionista_  | _Tipo_ |
| | |


|  caso de uso | XXX (Agente de viajes) |
|---|---|
| sistemas de agencia de viajes| _administrador de agente de viajes_  |
| Paquete de viaje | _Ofrece viajes con veneficios descuento y ofertas_ |
| reserva paquetes con hoteles | _ habla con el hotel y le ofrece las ofertas entrantes a ver si le parece atractivo._  |
| Administrador/recepcionista | _estudia si la oferta es beneficiosa y accede a conceder la reserva el administrador_ |   
|  Notas |  _son una familia de 12 personas_ |
| agencia de viajes  | _ envian a los clientes y pagan la reserva_ |
|Fecha | _01-11-2024_ |

|  Atributo |||
|---|---|---|
| _Nombre_  | _Agente de viajes_  | _Tipo_ |
| | |

---
# Definicion de los casos de uso:

|  Caso de Uso	CU | cliente  |
  |---|---|
  | Fuentes  | _ingresa al sistema_  |
  | Actor  |  _cliente_ |
  | Descripción | _interactua con el sistema y escoge a su gusto_  |
  | Flujo básico | _ busca habitaciones_ |
  | Pre-condiciones | _Observa su valoracion_  |  
  | Post-condiciones  | _ desea una habitacion con vista al oceano_  |  
  |  Requerimientos | _tarjeta de credito_  |
  |  Notas |  _Comentarios: _"me ha encantado el hotel nos vemos el siguiente año"_ |
  | Autor  | _cliente_ |
  |Fecha | _01-11-2024_ |

  |  Caso de Uso	CU | Administrador/recepcionista |
  |---|---|
  | Fuentes  | _gestiona el sistema_  |
  | Actor  |  _administrador/recepcionista_ |
  | Descripción | _gestiona el sistema y y asigna las habitaciones del gusto de los clientes_  |
  | Flujo básico | _ gestiona las entradas y salida de los clientes y cuanod es temporada baja se comunica con agencias de viajes_ |
  | Pre-condiciones | _"Mantienen una imagen alta para mantener el estatus y la clientela_  |  
  | Post-condiciones  | _Las temporadas bajas hacen pasquetes de reserva_  |  
  |  Requerimientos | _gestiona los pagos con los clientes en especifico mayormente son con tarjeta de credito_  |
  |  Notas |  _Comentarios: "revisa analiza y concluye en un analisis para mejorar todos los aspectos del hotel"_ |
  | Autor  | _lector_ |
  |Fecha | _01-11-2024_ |


  Caso de Uso	CU | Administrador de agencia de viajes |
  |---|---|
  | Fuentes  | _gestiona el sistema de viajes_  |
  | Actor  |  _se comunica con el administrador/recepcionista_ |
  | Descripción | _gestiona el sistema y y asigna los paquetes de viaje al hotel tanto en temporada alta como baja_  |
  | Flujo básico | _ gestiona las entradas y salida de los paquetes de viajes que cordina con el hotel_ |
  | Pre-condiciones | _ Colabora con el hotel con porcentajes ajustables tanto pra los clientes como para las dos empresas_  |  
  | Post-condiciones  | _Las temporadas bajas hacen pasquetes de reserva con un porcentaje un poco menos_  |  
  |  Requerimientos | _gestiona los pagos con los clientes en especifico mayormente son con tarjeta de credito_  |
  |  Notas |  _Comentarios: "La isla de tenerife fue eplendida 100% recomendado"_ |
  | Autor  | _cliente_ |
  |Fecha | _01-11-2024_ |


---

  Caso de Uso  | 	_Gestion de clientes_  |
  |--|--|
|Crear Cliente|	_Administrador, Ejecutivo	Crear un nuevo registro de cliente._ 
|Consultar Información de Cliente|	Administrador, Ejecutivo	Buscar y consultar la información de un cliente.
|Actualizar Información de Cliente|	Administrador, Ejecutivo	Modificar los datos de un cliente existente.
|Eliminar Cliente|	Administrador	|Eliminar un cliente del sistema.
|Generar Informe de Clientes|	Administrador	Generar un informe detallado sobre  los clientes.
|Fecha | _01-11-2024_ |

---
|Caso de Uso |	Gestionar habitacion|
|--|--|
|Crear Habitación |	Administrador de Hotel	Agregar una nueva habitación al sistema de gestión.
|Consultar Habitaciones|	Administrador, Recepcionista	Buscar y consultar |información sobre las habitaciones.
|Actualizar Habitación|	Administrador de Hotel	Modificar los detalles de una habitación existente.
|Eliminar Habitación|	Administrador de Hotel	Eliminar una habitación del sistema.
|Gestionar Disponibilidad de Habitación|	Administrador, Recepcionista	Cambiar el estado de disponibilidad de una habitación.
|Fecha | _01-11-2024_ |

---

|Caso de Uso|	Gestion de reserva de habitaciones|
|--|--|
|Crear Reserva de Habitación|	Recepcionista, Cliente	Realizar una nueva reserva de habitación.
|Modificar Reserva de Habitación|	Recepcionista, Cliente	Cambiar los detalles de una reserva existente.
|Cancelar Reserva de Habitación|	Recepcionista, Cliente	Eliminar una reserva de habitación.
|Consultar Reserva de Habitación|	Recepcionista, Cliente	Consultar los detalles de una reserva existente.
|Fecha | _01-11-2024_ |

---
|Caso de Uso| Registro de hospedaje|
|--|--|
| Llegada del huésped|	El huésped llega al hotel y proporciona sus datos de reserva (nombre, número de reserva, etc.).
|Verificación de reserva|	El recepcionista verifica la reserva en el sistema (fechas de estancia, tipo de habitación, pagos).
|Creación del registro|	El recepcionista crea el registro de hospedaje en el sistema, asignando la habitación.
| Generación de confirmación|	El sistema genera una confirmación de check-in con los detalles de la estancia y la entrega al huésped.
|Actualización de disponibilidad|	El sistema actualiza la disponibilidad de la habitación para reflejar que está ocupada.
|Fecha | _01-11-2024_ |

  En la creacion de mi primer proyecto he tomado en cuenta todas las caracteristicas y requisitos necesarios, para su realizacion:

   La siguente extructura es un ejemplo de como deberia estar estructurado nuestro proyecto correctamente.

## Ejemplo de estructura:

   ````
    ├── docs/
   │   ├── requisitos/
   │   │   ├── especificacion_requisitos.md
   │   │   ├── casos_uso.md
   │   │   └── backlog.md
   │   ├── diseno/
   │   │   ├── diagramas/
   │   │   │   ├── diagrama_clases.png
   │   │   │   ├── diagrama_secuencia.png
   │   │   │   ├── diagrama_actividades.png
   │   │   │   ├── diagrama_componentes.png
   │   │   │   └── diagrama_despliegue.png
   │   │   └── arquitectura.md
   │   ├── planificacion/
   │   │   ├── plan_proyecto.md
   │   │   ├── cronograma.md
   │   │   └── riesgos.md
   └── README.md

   ````   

## Diagrama de paquetes:
-----

**AUTHOR: Habcode**

<img src="imagenes/sistemaDeReserva.drawio.png">



