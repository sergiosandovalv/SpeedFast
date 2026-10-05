![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# 🧠 Evaluación – Programación Orientado a Objetos II

## 👨‍💻 Autor del proyecto

**Nombre:** Sergio Sandoval Valenzuela

**Carrera:** Analista Programador

**Sede:** Santiago Online

**Profesor:** Francesco Tossi Brante

---

# 📖 Introducción

Este repositorio contiene el desarrollo del proyecto **SpeedFast**, realizado para la asignatura **Programación Orientado a Objetos II**.

Durante las primeras semanas, el proyecto integra conceptos de herencia, polimorfismo, abstracción e interfaces para representar diferentes tipos de pedidos y sus capacidades.

Durante la **Semana 4**, el proyecto incorpora concurrencia para simular que varios repartidores realizan entregas durante el mismo período de tiempo.

Durante la **Semana 5**, el sistema incorpora sincronización para controlar el acceso concurrente a una zona de carga compartida.

Durante la **Semana 6**, el proyecto incorpora una interfaz gráfica desarrollada con **Java Swing**, permitiendo registrar pedidos, visualizar los pedidos almacenados e iniciar el proceso de entrega desde una ventana principal.

Durante la **Semana 7**, SpeedFast incorpora persistencia de datos mediante **MySQL y JDBC**, permitiendo almacenar pedidos, consultar repartidores, registrar entregas y visualizar desde Swing la información almacenada en la base de datos.

Además, el proyecto incorpora los paquetes `dao` y `datos`, separando las operaciones JDBC y la conexión a MySQL de las clases del modelo y de la interfaz gráfica.

Durante la **Semana 8**, el proyecto evoluciona incorporando operaciones **CRUD** sobre pedidos, repartidores y entregas. La interfaz gráfica permite registrar, consultar, editar y eliminar información persistente, manteniendo la integridad referencial definida en MySQL.

---

# 🎯 Propósito del proyecto

El propósito del proyecto es aplicar conceptos de Programación Orientada a Objetos mediante una jerarquía basada en la clase abstracta `Pedido`.

El sistema permite representar diferentes tipos de pedidos, reutilizar sus características comunes y definir comportamientos específicos según el tipo de pedido.

Mediante las interfaces `Despachable`, `Cancelable` y `Rastreable`, se incorporan diferentes capacidades sin modificar la estructura principal de herencia.

Durante la Semana 4 se incorpora la ejecución concurrente de repartidores mediante `Runnable` y `ExecutorService`.

Durante la Semana 5 se incorpora una `ZonaDeCarga` compartida y sincronizada.

Durante la Semana 6 se incorpora una interfaz gráfica mediante Java Swing.

Durante la Semana 7 se incorpora una capa de acceso a datos mediante JDBC y clases DAO, permitiendo almacenar y consultar información persistente desde MySQL.

Durante la Semana 8 esta capa se amplía con operaciones de creación, consulta, actualización y eliminación de datos desde la interfaz gráfica.

De esta forma, los datos registrados pueden mantenerse almacenados aunque la aplicación sea cerrada y ejecutada nuevamente.

---

# 📘 Conceptos aplicados

- Encapsulamiento.
- Herencia.
- Clases abstractas.
- Métodos abstractos.
- Métodos concretos.
- Polimorfismo.
- Sobrecarga de métodos.
- Sobrescritura mediante `@Override`.
- Interfaces.
- Implementación de múltiples interfaces.
- Desacoplamiento.![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# 🧠 Evaluación – Programación Orientado a Objetos II

## 👨‍💻 Autor del proyecto

**Nombre:** Sergio Sandoval Valenzuela

**Carrera:** Analista Programador

**Sede:** Santiago Online

**Profesor:** Francesco Tossi Brante

---

# 📖 Introducción

Este repositorio contiene el desarrollo del proyecto **SpeedFast**, realizado para la asignatura **Programación Orientado a Objetos II**.

Durante las primeras semanas, el proyecto integra conceptos de herencia, polimorfismo, abstracción e interfaces para representar diferentes tipos de pedidos y sus capacidades.

Durante la **Semana 4**, el proyecto incorpora concurrencia para simular que varios repartidores realizan entregas durante el mismo período de tiempo.

Durante la **Semana 5**, el sistema incorpora sincronización para controlar el acceso concurrente a una zona de carga compartida.

Durante la **Semana 6**, el proyecto incorpora una interfaz gráfica desarrollada con **Java Swing**, permitiendo registrar pedidos, visualizar los pedidos almacenados e iniciar el proceso de entrega desde una ventana principal.

Durante la **Semana 7**, SpeedFast incorpora persistencia de datos mediante **MySQL y JDBC**, permitiendo almacenar pedidos, consultar repartidores, registrar entregas y visualizar desde Swing la información almacenada en la base de datos.

Además, el proyecto incorpora los paquetes `dao` y `datos`, separando las operaciones JDBC y la conexión a MySQL de las clases del modelo y de la interfaz gráfica.

Durante la **Semana 8**, el proyecto evoluciona incorporando operaciones **CRUD** sobre pedidos, repartidores y entregas. La interfaz gráfica permite registrar, consultar, editar y eliminar información persistente, manteniendo la integridad referencial definida en MySQL.

---

# 🎯 Propósito del proyecto

El propósito del proyecto es aplicar conceptos de Programación Orientada a Objetos mediante una jerarquía basada en la clase abstracta `Pedido`.

El sistema permite representar diferentes tipos de pedidos, reutilizar sus características comunes y definir comportamientos específicos según el tipo de pedido.

Mediante las interfaces `Despachable`, `Cancelable` y `Rastreable`, se incorporan diferentes capacidades sin modificar la estructura principal de herencia.

Durante la Semana 4 se incorpora la ejecución concurrente de repartidores mediante `Runnable` y `ExecutorService`.

Durante la Semana 5 se incorpora una `ZonaDeCarga` compartida y sincronizada.

Durante la Semana 6 se incorpora una interfaz gráfica mediante Java Swing.

Durante la Semana 7 se incorpora una capa de acceso a datos mediante JDBC y clases DAO, permitiendo almacenar y consultar información persistente desde MySQL.

Durante la Semana 8 esta capa se amplía con operaciones de creación, consulta, actualización y eliminación de datos desde la interfaz gráfica.

De esta forma, los datos registrados pueden mantenerse almacenados aunque la aplicación sea cerrada y ejecutada nuevamente.

---

# 📘 Conceptos aplicados

- Encapsulamiento.
- Herencia.
- Clases abstractas.
- Métodos abstractos.
- Métodos concretos.
- Polimorfismo.
- Sobrecarga de métodos.
- Sobrescritura mediante `@Override`.
- Interfaces.
- Implementación de múltiples interfaces.
- Desacoplamiento.
- Constructores.
- Getters y Setters.
- Uso de `super()`.
- Uso de `ArrayList`.
- Reutilización de código.
- Documentación mediante Javadoc.
- Enumeraciones mediante `enum`.
- Concurrencia.
- Interfaz `Runnable`.
- Método `run()`.
- Uso de `Thread.sleep()`.
- Manejo de `InterruptedException`.
- Uso de `ExecutorService`.
- Uso de `newFixedThreadPool()`.
- Envío de tareas mediante `submit()`.
- Cierre mediante `shutdown()`.
- Recursos compartidos.
- Secciones críticas.
- Sincronización mediante `synchronized`.
- Interfaz gráfica mediante Java Swing.
- Uso de `JFrame`.
- Uso de `JPanel`.
- Uso de `JButton`.
- Uso de `JLabel`.
- Uso de `JTextField`.
- Uso de `JComboBox`.
- Uso de `JTable`.
- Uso de `JScrollPane`.
- Uso de `JOptionPane`.
- Uso de `SwingUtilities.invokeLater()`.
- Manejo de eventos mediante `ActionListener`.
- Organización del proyecto mediante paquetes.
- Persistencia de datos.
- JDBC.
- MySQL.
- Patrón DAO.
- Operaciones CRUD.
- Uso de `Connection`.
- Uso de `DriverManager`.
- Uso de `PreparedStatement`.
- Uso de `ResultSet`.
- Manejo de `SQLException`.
- Cierre de recursos mediante `try-with-resources`.
- Variables de entorno para información sensible.
- Integridad referencial mediante claves foráneas.
- Control de versiones mediante Git.
- Publicación del proyecto en GitHub.

---

# 🧱 Estructura del proyecto

```text
SpeedFast/
│
├── .gitignore
├── README.md
├── Semana8.sql
│
└── src/
    │
    ├── dao/
    │   ├── EntregaDAO.java
    │   ├── PedidoDAO.java
    │   ├── PedidoTablaDAO.java
    │   └── RepartidorDAO.java
    │
    ├── datos/
    │   └── ConexionBD.java
    │
    ├── main/
    │   └── Main.java
    │
    ├── modelo/
    │   ├── Cancelable.java
    │   ├── ControladorPedidos.java
    │   ├── Despachable.java
    │   ├── Entrega.java
    │   ├── EstadoPedido.java
    │   ├── Pedido.java
    │   ├── PedidoComida.java
    │   ├── PedidoEncomienda.java
    │   ├── PedidoExpress.java
    │   ├── Rastreable.java
    │   ├── Repartidor.java
    │   └── ZonaDeCarga.java
    │
    └── vista/
        ├── VentanaEditarPedido.java
        ├── VentanaEditarRepartidor.java
        ├── VentanaEliminarPedido.java
        ├── VentanaEliminarRepartidor.java
        ├── VentanaGestionEntregas.java
        ├── VentanaListaPedidos.java
        ├── VentanaPrincipal.java
        ├── VentanaRegistroPedido.java
        └── VentanaRegistroRepartidor.java
```

---

# 📦 Organización mediante paquetes

Durante las Semanas 7 y 8 el proyecto se organiza en cinco paquetes principales.

### `dao`

Contiene las clases encargadas de realizar las operaciones JDBC sobre la base de datos:

- `PedidoDAO`.
- `PedidoTablaDAO`.
- `RepartidorDAO`.
- `EntregaDAO`.

### `datos`

Contiene la clase:

- `ConexionBD`.

Esta clase centraliza la conexión entre la aplicación SpeedFast y MySQL.

### `main`

Contiene la clase `Main`, encargada de iniciar la aplicación.

### `modelo`

Contiene las clases relacionadas con la lógica y los datos del sistema:

- `Pedido`.
- `PedidoComida`.
- `PedidoEncomienda`.
- `PedidoExpress`.
- `ControladorPedidos`.
- `Repartidor`.
- `Entrega`.
- `ZonaDeCarga`.
- `EstadoPedido`.
- `Despachable`.
- `Cancelable`.
- `Rastreable`.

### `vista`

Contiene las clases relacionadas con la interfaz gráfica:

- `VentanaPrincipal`.
- `VentanaRegistroPedido`.
- `VentanaRegistroRepartidor`.
- `VentanaListaPedidos`.
- `VentanaEditarPedido`.
- `VentanaEliminarPedido`.
- `VentanaEditarRepartidor`.
- `VentanaEliminarRepartidor`.
- `VentanaGestionEntregas`.

Esta organización permite separar las responsabilidades del sistema entre modelo, interfaz gráfica, conexión y acceso a datos.

---

# 📊 Diagrama general del proyecto

```text
                           SpeedFast
                               │
           ┌───────────────────┼───────────────────┐
           │                   │                   │
           ▼                   ▼                   ▼
         vista               modelo               dao
           │                   │                   │
           │                 Pedido            PedidoDAO
           │             <<abstracta>>       RepartidorDAO
           │                   │              EntregaDAO
           │       ┌───────────┼───────────┐  PedidoTablaDAO
           │       │           │           │       │
           │       ▼           ▼           ▼       │
           │  PedidoComida  PedidoEncomienda       │
           │                         PedidoExpress  │
           │                                        │
           │                                        ▼
           │                                   ConexionBD
           │                                        │
           └────────────────────────────────────────┤
                                                    ▼
                                                  MySQL
                                                    │
                                      ┌─────────────┼─────────────┐
                                      ▼             ▼             ▼
                                   pedidos    repartidores     entregas
```

---

# 🧩 Abstracción

La clase `Pedido` se define como abstracta:

```java
public abstract class Pedido
```

Esto permite utilizarla como base de la jerarquía sin crear objetos `Pedido` directamente.

Cada subclase mantiene los comportamientos específicos correspondientes a su tipo.

---

# 🔄 Polimorfismo

Los diferentes tipos de pedidos pueden ser administrados mediante referencias de tipo `Pedido`.

Las clases:

```text
PedidoComida
PedidoEncomienda
PedidoExpress
```

heredan desde `Pedido` y mantienen comportamientos específicos según el tipo de objeto creado.

---

# 🔌 Interfaces

El sistema mantiene las interfaces:

### `Despachable`

Define la capacidad de despachar un pedido.

### `Cancelable`

Define la capacidad de cancelar un pedido.

### `Rastreable`

Define la capacidad de consultar el historial de un pedido.

Las interfaces permiten mantener separadas las capacidades de los pedidos de la estructura principal de herencia.

---

# 🧵 Concurrencia – Semana 4

La clase `Repartidor` funciona como una tarea concurrente mediante:

```java
public class Repartidor implements Runnable
```

La ejecución de los repartidores se administra mediante `ExecutorService`.

Esto permite que diferentes repartidores procesen pedidos concurrentemente.

---

# 🔒 Sincronización – Semana 5

La clase `ZonaDeCarga` representa el recurso compartido entre los repartidores.

El acceso a los pedidos se controla mediante métodos sincronizados.

La sincronización evita que dos repartidores retiren el mismo pedido desde la zona de carga.

---

# 🚦 Estados de los pedidos

El sistema incorpora el enum:

```java
EstadoPedido
```

con los estados:

```text
PENDIENTE
EN_REPARTO
ENTREGADO
```

Cuando se registra un pedido comienza en:

```text
PENDIENTE
```

Durante la entrega:

```text
PENDIENTE
    ↓
EN_REPARTO
    ↓
ENTREGADO
```

Desde la Semana 7 estos cambios también pueden actualizarse en la base de datos.

---

# 🖥️ Interfaz gráfica – Semanas 6, 7 y 8

La interfaz gráfica se encuentra desarrollada mediante Java Swing.

La ventana principal permite acceder a las principales funcionalidades:

```text
Registrar pedido
Registrar repartidor
Editar repartidor
Eliminar repartidor
Listar pedidos
Eliminar pedido
Gestionar entregas
Asignar repartidor / Iniciar entrega
Salir de la aplicacion
```

Durante la Semana 7 la interfaz se integra con MySQL para registrar y consultar información persistente.

Durante la Semana 8 se incorporan opciones para editar y eliminar pedidos y repartidores, además de consultar, editar y eliminar entregas.

---

# 📝 Gestión de pedidos

`VentanaRegistroPedido` permite crear nuevos pedidos desde la interfaz gráfica.

El usuario ingresa:

```text
Direccion
Distancia (km)
Tipo
```

El tipo puede ser:

```text
Comida
Encomienda
Express
```

Dependiendo de la selección se crea una instancia de:

```text
PedidoComida
PedidoEncomienda
PedidoExpress
```

El sistema valida los datos ingresados.

Al guardar el pedido, `PedidoDAO` realiza la operación correspondiente sobre MySQL.

El identificador del pedido es generado por la base de datos mediante `AUTO_INCREMENT`.

Durante la Semana 8 también se incorporan operaciones para editar y eliminar pedidos.

---

# 👤 Gestión de repartidores

Durante la Semana 7 se incorpora `VentanaRegistroRepartidor`.

Esta ventana permite registrar nuevos repartidores desde la interfaz gráfica.

Durante la Semana 8 se incorporan:

- `VentanaEditarRepartidor`.
- `VentanaEliminarRepartidor`.

De esta forma, los repartidores pueden ser registrados, consultados, modificados y eliminados.

Los repartidores quedan almacenados en la tabla:

```text
repartidores
```

de MySQL.

---

# 📋 Lista de pedidos

`VentanaListaPedidos` permite visualizar los pedidos registrados mediante un `JTable`.

La tabla contiene:

```text
ID
Direccion
Tipo
Estado
```

Los datos mostrados son consultados desde MySQL mediante `PedidoTablaDAO`.

La ventana incorpora la opción:

```text
Refrescar
```

que permite volver a consultar la información almacenada en la base de datos.

La tabla es utilizada para visualizar información y sus celdas no pueden ser modificadas directamente por el usuario.

---

# 🚚 Gestión de entregas – Semana 8

Durante la Semana 8 se incorpora:

```text
VentanaGestionEntregas
```

Esta ventana permite consultar las entregas almacenadas en MySQL mediante un `JTable`.

Desde esta interfaz es posible:

```text
Consultar entregas
Refrescar información
Editar el repartidor asociado
Eliminar una entrega
```

Las operaciones realizadas se almacenan directamente en MySQL mediante `EntregaDAO`.

---

# 🗄️ Base de datos – Semanas 7 y 8

Durante la Semana 8, SpeedFast utiliza una base de datos MySQL denominada:

```text
speedfast_semana8_db
```

La base contiene tres tablas principales:

```text
repartidores
pedidos
entregas
```

---

## Tabla `repartidores`

Almacena los repartidores disponibles en SpeedFast.

```text
id
nombre
```

El campo `id` corresponde a la clave primaria y utiliza `AUTO_INCREMENT`.

---

## Tabla `pedidos`

Almacena los pedidos registrados desde la aplicación.

```text
id
direccion
tipo
estado
```

El campo `id` corresponde a la clave primaria y utiliza `AUTO_INCREMENT`.

---

## Tabla `entregas`

Registra la relación entre un pedido y el repartidor que realiza la entrega.

```text
id
id_pedido
id_repartidor
fecha
hora
```

La tabla contiene claves foráneas hacia:

```text
pedidos(id)
repartidores(id)
```

Esto permite mantener relacionadas las entregas con los pedidos y repartidores correspondientes.

---

# 📄 Script SQL – Semana 8

El proyecto incluye:

```text
Semana8.sql
```

Este archivo contiene el DDL necesario para crear la estructura utilizada por la versión de Semana 8 de SpeedFast.

El script permite crear:

```text
speedfast_semana8_db
repartidores
pedidos
entregas
```

También incorpora las relaciones necesarias entre las tablas y consultas de verificación.

---

# 🔌 Conexión JDBC

La clase:

```text
ConexionBD
```

ubicada en el paquete:

```text
datos
```

es responsable de establecer la conexión entre Java y MySQL.

La conexión utiliza:

```java
DriverManager.getConnection(...)
```

La URL configurada corresponde a:

```text
jdbc:mysql://localhost:3306/speedfast_semana8_db
```

El usuario configurado para la conexión es:

```text
root
```

La contraseña no se encuentra almacenada directamente en el código fuente.

---

# 🔐 Variable de entorno

La contraseña utilizada por MySQL se obtiene mediante la variable de entorno:

```text
MYSQL_PASSWORD
```

En Java se obtiene mediante:

```java
System.getenv("MYSQL_PASSWORD")
```

Esto permite mantener la contraseña fuera del código fuente y evita publicarla en GitHub.

Cada equipo que ejecute SpeedFast debe configurar localmente esta variable con la contraseña correspondiente a su instalación de MySQL.

Ejemplo:

```text
MYSQL_PASSWORD=<contraseña local de MySQL>
```

No se debe reemplazar este ejemplo por una contraseña real dentro del repositorio.

---

# 💾 Acceso a datos mediante DAO

Durante la Semana 7 se incorpora una capa DAO para separar las operaciones JDBC del resto de la aplicación.

Durante la Semana 8 esta capa se amplía para soportar las operaciones CRUD requeridas por el sistema.

## `PedidoDAO`

Permite realizar operaciones relacionadas con los pedidos.

Entre ellas:

```text
Guardar pedidos.
Actualizar pedidos.
Eliminar pedidos.
Actualizar estados.
Consultar pedidos pendientes.
```

Los pedidos nuevos utilizan el ID generado automáticamente por MySQL.

## `RepartidorDAO`

Permite realizar operaciones relacionadas con los repartidores.

Entre ellas:

```text
Registrar repartidores.
Consultar repartidores almacenados.
Actualizar repartidores.
Eliminar repartidores.
```

## `EntregaDAO`

Permite registrar, consultar, actualizar y eliminar entregas en MySQL.

La entrega relaciona:

```text
Pedido
Repartidor
Fecha
Hora
```

## `PedidoTablaDAO`

Permite consultar los pedidos almacenados en MySQL y cargar la información utilizada por el `JTable`.

De esta manera, la tabla de la interfaz gráfica consulta información persistente en lugar de depender solamente de los datos almacenados en memoria.

---

# ✏️ Operaciones CRUD – Semana 8

Durante la Semana 8, SpeedFast amplía la persistencia incorporada en la semana anterior mediante operaciones CRUD integradas con Java Swing y MySQL.

## Pedidos

Los pedidos pueden ser:

```text
Registrados
Consultados
Editados
Eliminados
```

La edición permite modificar la información correspondiente al pedido.

## Repartidores

Los repartidores pueden ser:

```text
Registrados
Consultados
Editados
Eliminados
```

## Entregas

`VentanaGestionEntregas` permite:

```text
Consultar entregas
Cambiar el repartidor asociado
Eliminar una entrega
Refrescar la información
```

Las operaciones se realizan mediante las clases DAO y se reflejan directamente en MySQL.

La base de datos mantiene claves foráneas entre entregas, pedidos y repartidores.

Por este motivo, una eliminación puede ser rechazada cuando el registro se encuentra relacionado con una entrega, protegiendo la integridad de los datos.

---

# 🔒 Manejo de recursos JDBC

Las operaciones de acceso a datos utilizan:

```java
try-with-resources
```

para administrar recursos JDBC como:

```text
Connection
PreparedStatement
ResultSet
```

También se utiliza manejo de:

```java
SQLException
```

para controlar posibles errores durante las operaciones con la base de datos.

---

# 🚚 Proceso de entrega

Desde `VentanaPrincipal`, el usuario puede seleccionar:

```text
Asignar repartidor / Iniciar entrega
```

Los pedidos pendientes son procesados mediante la lógica de `ZonaDeCarga` y `Repartidor`.

Durante el proceso el estado cambia:

```text
PENDIENTE
    ↓
EN_REPARTO
    ↓
ENTREGADO
```

Los cambios de estado se actualizan también en MySQL.

Al finalizar una entrega, se registra la información correspondiente mediante `EntregaDAO`.

Posteriormente, las entregas pueden ser consultadas y administradas desde `VentanaGestionEntregas`.

---

# 💾 Persistencia

Una de las principales incorporaciones de la Semana 7 es la persistencia.

Durante la Semana 8 esta persistencia se amplía mediante operaciones CRUD.

Los registros almacenados en MySQL permanecen disponibles aunque SpeedFast sea cerrado.

Por este motivo es posible:

```text
Ejecutar SpeedFast
        ↓
Registrar información
        ↓
Editar o eliminar información
        ↓
Cerrar SpeedFast
        ↓
Ejecutar nuevamente
        ↓
Consultar información almacenada
```

La persistencia permite que las ventanas de la interfaz vuelvan a consultar los registros almacenados anteriormente desde MySQL.

---

# 💻 Tecnologías utilizadas

- Java JDK 26.
- Java Swing.
- JDBC.
- MySQL Community Server.
- MySQL Connector/J.
- MySQL Workbench.
- IntelliJ IDEA.
- Git.
- GitHub.
- Markdown.

---

# ⚙️ Preparación de la base de datos

Antes de ejecutar SpeedFast se debe preparar MySQL.

### Paso 1

Iniciar el servidor MySQL.

### Paso 2

Abrir el archivo:

```text
Semana8.sql
```

mediante MySQL Workbench.

### Paso 3

Ejecutar el script SQL.

### Paso 4

Verificar la existencia de la base:

```text
speedfast_semana8_db
```

### Paso 5

Verificar las tablas:

```text
repartidores
pedidos
entregas
```

---

# 🔧 MySQL Connector/J

SpeedFast utiliza **MySQL Connector/J** para establecer la conexión JDBC.

El controlador debe encontrarse disponible para el proyecto antes de ejecutar la aplicación.

El proyecto fue desarrollado utilizando:

```text
mysql-connector-j-26.7.0.jar
```

Una vez disponible el controlador JDBC, IntelliJ puede utilizarlo como biblioteca del proyecto para realizar la conexión con MySQL.

La ubicación del archivo `.jar` puede variar según el sistema operativo y la instalación realizada en cada equipo.

---

# ⚙️ Configuración en IntelliJ IDEA

Antes de ejecutar SpeedFast:

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que se encuentre configurado Java JDK 26.
3. Verificar que MySQL Connector/J se encuentre disponible.
4. Ejecutar `Semana8.sql` en MySQL.
5. Configurar la variable de entorno `MYSQL_PASSWORD`.
6. Ejecutar `Main.java`.

La variable se configura localmente en la configuración de ejecución.

Ejemplo:

```text
MYSQL_PASSWORD=<contraseña local de MySQL>
```

La contraseña real no debe incorporarse al código fuente ni al repositorio.

---

# ▶️ Ejecución y prueba

Una vez configurado el proyecto:

1. Ejecutar `Main.java` del paquete `main`.
2. Verificar que se abra la ventana principal.
3. Seleccionar **Registrar pedido**.
4. Ingresar los datos solicitados.
5. Guardar el pedido.
6. Seleccionar **Listar pedidos**.
7. Verificar que el pedido aparezca en estado `PENDIENTE`.
8. Probar la edición de un pedido.
9. Verificar el cambio desde MySQL.
10. Registrar un repartidor.
11. Probar la edición del repartidor.
12. Regresar al menú principal.
13. Seleccionar **Asignar repartidor / Iniciar entrega**.
14. Esperar el procesamiento.
15. Abrir nuevamente **Listar pedidos**.
16. Presionar **Refrescar**.
17. Verificar el cambio de estado.
18. Abrir **Gestionar entregas**.
19. Verificar las entregas almacenadas.
20. Editar el repartidor asociado a una entrega.
21. Verificar el cambio en MySQL.
22. Eliminar una entrega de prueba.
23. Verificar la eliminación en MySQL.
24. Cerrar SpeedFast.
25. Ejecutar nuevamente la aplicación.
26. Verificar que los registros almacenados continúen disponibles.

---

# 🔍 Verificación desde MySQL

Los registros pueden comprobarse mediante:

```sql
SELECT * FROM repartidores;
SELECT * FROM pedidos;
SELECT * FROM entregas;
```

Esto permite comparar la información registrada desde la interfaz gráfica con los datos almacenados realmente en MySQL.

---

# 📄 Funcionalidades implementadas

- Clase abstracta `Pedido`.
- Creación de pedidos de comida, encomienda y express.
- Encapsulamiento.
- Herencia.
- Métodos abstractos y concretos.
- Polimorfismo.
- Sobrecarga.
- Sobrescritura mediante `@Override`.
- Interfaces `Despachable`, `Cancelable` y `Rastreable`.
- Historial mediante `ArrayList`.
- Clase `Repartidor`.
- Implementación de `Runnable`.
- Clase `EstadoPedido`.
- Estados `PENDIENTE`, `EN_REPARTO` y `ENTREGADO`.
- Clase `ZonaDeCarga`.
- Sincronización mediante `synchronized`.
- Ejecución concurrente mediante `ExecutorService`.
- Interfaz gráfica mediante Java Swing.
- Ventana principal.
- Registro de pedidos.
- Registro de repartidores.
- Validación de datos.
- Visualización mediante `JTable`.
- Tabla no editable.
- Botón Refrescar.
- Persistencia mediante MySQL.
- Conexión mediante JDBC.
- Clase `ConexionBD`.
- Patrón DAO.
- `PedidoDAO`.
- `RepartidorDAO`.
- `EntregaDAO`.
- `PedidoTablaDAO`.
- Uso de `PreparedStatement`.
- Uso de `ResultSet`.
- Manejo de `SQLException`.
- Cierre de recursos mediante `try-with-resources`.
- Inserción de pedidos en MySQL.
- Consulta de repartidores.
- Actualización de estados.
- Registro de entregas.
- Consulta de pedidos desde MySQL.
- Edición y eliminación de pedidos.
- Edición y eliminación de repartidores.
- Consulta, edición y eliminación de entregas.
- Operaciones CRUD integradas con Java Swing y MySQL.
- Integridad referencial mediante claves foráneas.
- Persistencia después de reiniciar la aplicación.
- Variable de entorno `MYSQL_PASSWORD`.
- Documentación mediante Javadoc.
- Control de versiones mediante Git.
- Publicación mediante GitHub.

---

# 📈 Reutilización y mantenibilidad

La clase abstracta `Pedido` mantiene los atributos y comportamientos comunes de la jerarquía.

Las subclases especializan las reglas correspondientes a cada tipo de pedido.

Las interfaces permiten separar las capacidades de los pedidos.

`Repartidor` representa las tareas concurrentes y `ZonaDeCarga` administra el recurso compartido.

La interfaz gráfica se mantiene separada en el paquete `vista`.

Durante la Semana 7, las operaciones SQL se separan mediante el paquete `dao`.

Durante la Semana 8, los DAO se amplían para soportar operaciones CRUD desde la interfaz gráfica.

La conexión se centraliza mediante `ConexionBD` en el paquete `datos`.

Esta organización permite mantener separadas las responsabilidades entre:

```text
Interfaz
Modelo
Acceso a datos
Conexión
Base de datos
```

De esta manera, SpeedFast incorpora persistencia y operaciones CRUD manteniendo la estructura orientada a objetos desarrollada durante las semanas anteriores.

---

# 📚 Evolución del proyecto

```text
Semanas iniciales
Herencia, abstracción, polimorfismo e interfaces
        ↓
Semana 4
Concurrencia con Runnable y ExecutorService
        ↓
Semana 5
Sincronización y ZonaDeCarga
        ↓
Semana 6
Interfaz gráfica con Java Swing
        ↓
Semana 7
Persistencia con JDBC, MySQL y DAO
        ↓
Semana 8
Operaciones CRUD e integración Swing + MySQL
```

SpeedFast se desarrolla de manera incremental, reutilizando y ampliando las funcionalidades implementadas durante las semanas anteriores.

---

# ✅ Conclusión

El proyecto **SpeedFast** integra los conceptos desarrollados durante las primeras ocho semanas de Programación Orientado a Objetos II.

La clase abstracta `Pedido` permite centralizar información y comportamientos comunes, mientras que `PedidoComida`, `PedidoEncomienda` y `PedidoExpress` especializan las reglas del sistema.

Las interfaces permiten representar diferentes capacidades de los pedidos.

Durante la Semana 4 se incorpora concurrencia mediante `Runnable` y `ExecutorService`.

Durante la Semana 5 se incorpora sincronización mediante `ZonaDeCarga`.

Durante la Semana 6 se incorpora una interfaz gráfica desarrollada con Java Swing.

Durante la Semana 7 se incorpora persistencia mediante **JDBC y MySQL**.

Durante la Semana 8 se incorporan operaciones **CRUD** para pedidos, repartidores y entregas, integradas con Java Swing y la base de datos.

Las clases DAO permiten separar las operaciones SQL del resto de la aplicación y `ConexionBD` centraliza la conexión con MySQL.

La interfaz permite registrar, consultar, editar y eliminar información persistente, mientras que las relaciones definidas mediante claves foráneas permiten mantener la integridad de los datos.

De esta forma, SpeedFast evoluciona desde una aplicación orientada a objetos con interfaz gráfica hacia una aplicación con persistencia y operaciones CRUD sobre una base de datos relacional, manteniendo y ampliando los conceptos desarrollados durante las semanas anteriores.

---

# 🔗 Repositorio

**GitHub**

https://github.com/sergiosandovalv/SpeedFast
- Constructores.
- Getters y Setters.
- Uso de `super()`.
- Uso de `ArrayList`.
- Reutilización de código.
- Documentación mediante Javadoc.
- Enumeraciones mediante `enum`.
- Concurrencia.
- Interfaz `Runnable`.
- Método `run()`.
- Uso de `Thread.sleep()`.
- Manejo de `InterruptedException`.
- Uso de `ExecutorService`.
- Uso de `newFixedThreadPool()`.
- Envío de tareas mediante `submit()`.
- Cierre mediante `shutdown()`.
- Recursos compartidos.
- Secciones críticas.
- Sincronización mediante `synchronized`.
- Interfaz gráfica mediante Java Swing.
- Uso de `JFrame`.
- Uso de `JPanel`.
- Uso de `JButton`.
- Uso de `JLabel`.
- Uso de `JTextField`.
- Uso de `JComboBox`.
- Uso de `JTable`.
- Uso de `JScrollPane`.
- Uso de `JOptionPane`.
- Uso de `SwingUtilities.invokeLater()`.
- Manejo de eventos mediante `ActionListener`.
- Organización del proyecto mediante paquetes.
- Persistencia de datos.
- JDBC.
- MySQL.
- Patrón DAO.
- Operaciones CRUD.
- Uso de `Connection`.
- Uso de `DriverManager`.
- Uso de `PreparedStatement`.
- Uso de `ResultSet`.
- Manejo de `SQLException`.
- Cierre de recursos mediante `try-with-resources`.
- Variables de entorno para información sensible.
- Integridad referencial mediante claves foráneas.
- Control de versiones mediante Git.
- Publicación del proyecto en GitHub.

---

# 🧱 Estructura del proyecto

```text
SpeedFast/
│
├── .gitignore
├── README.md
├── Semana8.sql
│
└── src/
    │
    ├── dao/
    │   ├── EntregaDAO.java
    │   ├── PedidoDAO.java
    │   ├── PedidoTablaDAO.java
    │   └── RepartidorDAO.java
    │
    ├── datos/
    │   └── ConexionBD.java
    │
    ├── main/
    │   └── Main.java
    │
    ├── modelo/
    │   ├── Cancelable.java
    │   ├── ControladorPedidos.java
    │   ├── Despachable.java
    │   ├── Entrega.java
    │   ├── EstadoPedido.java
    │   ├── Pedido.java
    │   ├── PedidoComida.java
    │   ├── PedidoEncomienda.java
    │   ├── PedidoExpress.java
    │   ├── Rastreable.java
    │   ├── Repartidor.java
    │   └── ZonaDeCarga.java
    │
    └── vista/
        ├── VentanaEditarPedido.java
        ├── VentanaEditarRepartidor.java
        ├── VentanaEliminarPedido.java
        ├── VentanaEliminarRepartidor.java
        ├── VentanaGestionEntregas.java
        ├── VentanaListaPedidos.java
        ├── VentanaPrincipal.java
        ├── VentanaRegistroPedido.java
        └── VentanaRegistroRepartidor.java
```

---

# 📦 Organización mediante paquetes
![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# 🧠 Evaluación – Programación Orientado a Objetos II

## 👨‍💻 Autor del proyecto

**Nombre:** Sergio Sandoval Valenzuela

**Carrera:** Analista Programador

**Sede:** Santiago Online

**Profesor:** Francesco Tossi Brante

---

# 📖 Introducción

Este repositorio contiene el desarrollo del proyecto **SpeedFast**, realizado para la asignatura **Programación Orientado a Objetos II**.

Durante las primeras semanas, el proyecto integra conceptos de herencia, polimorfismo, abstracción e interfaces para representar diferentes tipos de pedidos y sus capacidades.

Durante la **Semana 4**, el proyecto incorpora concurrencia para simular que varios repartidores realizan entregas durante el mismo período de tiempo.

Durante la **Semana 5**, el sistema incorpora sincronización para controlar el acceso concurrente a una zona de carga compartida.

Durante la **Semana 6**, el proyecto incorpora una interfaz gráfica desarrollada con **Java Swing**, permitiendo registrar pedidos, visualizar los pedidos almacenados e iniciar el proceso de entrega desde una ventana principal.

Durante la **Semana 7**, SpeedFast incorpora persistencia de datos mediante **MySQL y JDBC**, permitiendo almacenar pedidos, consultar repartidores, registrar entregas y visualizar desde Swing la información almacenada en la base de datos.

Además, el proyecto incorpora los paquetes `dao` y `datos`, separando las operaciones JDBC y la conexión a MySQL de las clases del modelo y de la interfaz gráfica.

Durante la **Semana 8**, el proyecto evoluciona incorporando operaciones **CRUD** sobre pedidos, repartidores y entregas. La interfaz gráfica permite registrar, consultar, editar y eliminar información persistente, manteniendo la integridad referencial definida en MySQL.

---

# 🎯 Propósito del proyecto

El propósito del proyecto es aplicar conceptos de Programación Orientada a Objetos mediante una jerarquía basada en la clase abstracta `Pedido`.

El sistema permite representar diferentes tipos de pedidos, reutilizar sus características comunes y definir comportamientos específicos según el tipo de pedido.

Mediante las interfaces `Despachable`, `Cancelable` y `Rastreable`, se incorporan diferentes capacidades sin modificar la estructura principal de herencia.

Durante la Semana 4 se incorpora la ejecución concurrente de repartidores mediante `Runnable` y `ExecutorService`.

Durante la Semana 5 se incorpora una `ZonaDeCarga` compartida y sincronizada.

Durante la Semana 6 se incorpora una interfaz gráfica mediante Java Swing.

Durante la Semana 7 se incorpora una capa de acceso a datos mediante JDBC y clases DAO, permitiendo almacenar y consultar información persistente desde MySQL.

Durante la Semana 8 esta capa se amplía con operaciones de creación, consulta, actualización y eliminación de datos desde la interfaz gráfica.

De esta forma, los datos registrados pueden mantenerse almacenados aunque la aplicación sea cerrada y ejecutada nuevamente.

---

# 📘 Conceptos aplicados

- Encapsulamiento.
- Herencia.
- Clases abstractas.
- Métodos abstractos.
- Métodos concretos.
- Polimorfismo.
- Sobrecarga de métodos.
- Sobrescritura mediante `@Override`.
- Interfaces.
- Implementación de múltiples interfaces.
- Desacoplamiento.
- Constructores.
- Getters y Setters.
- Uso de `super()`.
- Uso de `ArrayList`.
- Reutilización de código.
- Documentación mediante Javadoc.
- Enumeraciones mediante `enum`.
- Concurrencia.
- Interfaz `Runnable`.
- Método `run()`.
- Uso de `Thread.sleep()`.
- Manejo de `InterruptedException`.
- Uso de `ExecutorService`.
- Uso de `newFixedThreadPool()`.
- Envío de tareas mediante `submit()`.
- Cierre mediante `shutdown()`.
- Recursos compartidos.
- Secciones críticas.
- Sincronización mediante `synchronized`.
- Interfaz gráfica mediante Java Swing.
- Uso de `JFrame`.
- Uso de `JPanel`.
- Uso de `JButton`.
- Uso de `JLabel`.
- Uso de `JTextField`.
- Uso de `JComboBox`.
- Uso de `JTable`.
- Uso de `JScrollPane`.
- Uso de `JOptionPane`.
- Uso de `SwingUtilities.invokeLater()`.
- Manejo de eventos mediante `ActionListener`.
- Organización del proyecto mediante paquetes.
- Persistencia de datos.
- JDBC.
- MySQL.
- Patrón DAO.
- Operaciones CRUD.
- Uso de `Connection`.
- Uso de `DriverManager`.
- Uso de `PreparedStatement`.
- Uso de `ResultSet`.
- Manejo de `SQLException`.
- Cierre de recursos mediante `try-with-resources`.
- Variables de entorno para información sensible.
- Integridad referencial mediante claves foráneas.
- Control de versiones mediante Git.
- Publicación del proyecto en GitHub.

---

# 🧱 Estructura del proyecto

```text
SpeedFast/
│
├── .gitignore
├── README.md
├── Semana8.sql
│
└── src/
    │
    ├── dao/
    │   ├── EntregaDAO.java
    │   ├── PedidoDAO.java
    │   ├── PedidoTablaDAO.java
    │   └── RepartidorDAO.java
    │
    ├── datos/
    │   └── ConexionBD.java
    │
    ├── main/
    │   └── Main.java
    │
    ├── modelo/
    │   ├── Cancelable.java
    │   ├── ControladorPedidos.java
    │   ├── Despachable.java
    │   ├── Entrega.java
    │   ├── EstadoPedido.java
    │   ├── Pedido.java
    │   ├── PedidoComida.java
    │   ├── PedidoEncomienda.java
    │   ├── PedidoExpress.java
    │   ├── Rastreable.java
    │   ├── Repartidor.java
    │   └── ZonaDeCarga.java
    │
    └── vista/
        ├── VentanaEditarPedido.java
        ├── VentanaEditarRepartidor.java
        ├── VentanaEliminarPedido.java
        ├── VentanaEliminarRepartidor.java
        ├── VentanaGestionEntregas.java
        ├── VentanaListaPedidos.java
        ├── VentanaPrincipal.java
        ├── VentanaRegistroPedido.java
        └── VentanaRegistroRepartidor.java
```

---

# 📦 Organización mediante paquetes

Durante las Semanas 7 y 8 el proyecto se organiza en cinco paquetes principales.

### `dao`

Contiene las clases encargadas de realizar las operaciones JDBC sobre la base de datos:

- `PedidoDAO`.
- `PedidoTablaDAO`.
- `RepartidorDAO`.
- `EntregaDAO`.

### `datos`

Contiene la clase:

- `ConexionBD`.

Esta clase centraliza la conexión entre la aplicación SpeedFast y MySQL.

### `main`

Contiene la clase `Main`, encargada de iniciar la aplicación.

### `modelo`

Contiene las clases relacionadas con la lógica y los datos del sistema:

- `Pedido`.
- `PedidoComida`.
- `PedidoEncomienda`.
- `PedidoExpress`.
- `ControladorPedidos`.
- `Repartidor`.
- `Entrega`.
- `ZonaDeCarga`.
- `EstadoPedido`.
- `Despachable`.
- `Cancelable`.
- `Rastreable`.

### `vista`

Contiene las clases relacionadas con la interfaz gráfica:

- `VentanaPrincipal`.
- `VentanaRegistroPedido`.
- `VentanaRegistroRepartidor`.
- `VentanaListaPedidos`.
- `VentanaEditarPedido`.
- `VentanaEliminarPedido`.
- `VentanaEditarRepartidor`.
- `VentanaEliminarRepartidor`.
- `VentanaGestionEntregas`.

Esta organización permite separar las responsabilidades del sistema entre modelo, interfaz gráfica, conexión y acceso a datos.

---

# 📊 Diagrama general del proyecto

```text
                           SpeedFast
                               │
           ┌───────────────────┼───────────────────┐
           │                   │                   │
           ▼                   ▼                   ▼
         vista               modelo               dao
           │                   │                   │
           │                 Pedido            PedidoDAO
           │             <<abstracta>>       RepartidorDAO
           │                   │              EntregaDAO
           │       ┌───────────┼───────────┐  PedidoTablaDAO
           │       │           │           │       │
           │       ▼           ▼           ▼       │
           │  PedidoComida  PedidoEncomienda       │
           │                         PedidoExpress  │
           │                                        │
           │                                        ▼
           │                                   ConexionBD
           │                                        │
           └────────────────────────────────────────┤
                                                    ▼
                                                  MySQL
                                                    │
                                      ┌─────────────┼─────────────┐
                                      ▼             ▼             ▼
                                   pedidos    repartidores     entregas
```

---

# 🧩 Abstracción

La clase `Pedido` se define como abstracta:

```java
public abstract class Pedido
```

Esto permite utilizarla como base de la jerarquía sin crear objetos `Pedido` directamente.

Cada subclase mantiene los comportamientos específicos correspondientes a su tipo.

---

# 🔄 Polimorfismo

Los diferentes tipos de pedidos pueden ser administrados mediante referencias de tipo `Pedido`.

Las clases:

```text
PedidoComida
PedidoEncomienda
PedidoExpress
```

heredan desde `Pedido` y mantienen comportamientos específicos según el tipo de objeto creado.

---

# 🔌 Interfaces

El sistema mantiene las interfaces:

### `Despachable`

Define la capacidad de despachar un pedido.

### `Cancelable`

Define la capacidad de cancelar un pedido.

### `Rastreable`

Define la capacidad de consultar el historial de un pedido.

Las interfaces permiten mantener separadas las capacidades de los pedidos de la estructura principal de herencia.

---

# 🧵 Concurrencia – Semana 4

La clase `Repartidor` funciona como una tarea concurrente mediante:

```java
public class Repartidor implements Runnable
```

La ejecución de los repartidores se administra mediante `ExecutorService`.

Esto permite que diferentes repartidores procesen pedidos concurrentemente.

---

# 🔒 Sincronización – Semana 5

La clase `ZonaDeCarga` representa el recurso compartido entre los repartidores.

El acceso a los pedidos se controla mediante métodos sincronizados.

La sincronización evita que dos repartidores retiren el mismo pedido desde la zona de carga.

---

# 🚦 Estados de los pedidos

El sistema incorpora el enum:

```java
EstadoPedido
```

con los estados:

```text
PENDIENTE
EN_REPARTO
ENTREGADO
```

Cuando se registra un pedido comienza en:

```text
PENDIENTE
```

Durante la entrega:

```text
PENDIENTE
    ↓
EN_REPARTO
    ↓
ENTREGADO
```

Desde la Semana 7 estos cambios también pueden actualizarse en la base de datos.

---

# 🖥️ Interfaz gráfica – Semanas 6, 7 y 8

La interfaz gráfica se encuentra desarrollada mediante Java Swing.

La ventana principal permite acceder a las principales funcionalidades:

```text
Registrar pedido
Registrar repartidor
Editar repartidor
Eliminar repartidor
Listar pedidos
Eliminar pedido
Gestionar entregas
Asignar repartidor / Iniciar entrega
Salir de la aplicacion
```

Durante la Semana 7 la interfaz se integra con MySQL para registrar y consultar información persistente.

Durante la Semana 8 se incorporan opciones para editar y eliminar pedidos y repartidores, además de consultar, editar y eliminar entregas.

---

# 📝 Gestión de pedidos

`VentanaRegistroPedido` permite crear nuevos pedidos desde la interfaz gráfica.

El usuario ingresa:

```text
Direccion
Distancia (km)
Tipo
```

El tipo puede ser:

```text
Comida
Encomienda
Express
```

Dependiendo de la selección se crea una instancia de:

```text
PedidoComida
PedidoEncomienda
PedidoExpress
```

El sistema valida los datos ingresados.

Al guardar el pedido, `PedidoDAO` realiza la operación correspondiente sobre MySQL.

El identificador del pedido es generado por la base de datos mediante `AUTO_INCREMENT`.

Durante la Semana 8 también se incorporan operaciones para editar y eliminar pedidos.

---

# 👤 Gestión de repartidores

Durante la Semana 7 se incorpora `VentanaRegistroRepartidor`.

Esta ventana permite registrar nuevos repartidores desde la interfaz gráfica.

Durante la Semana 8 se incorporan:

- `VentanaEditarRepartidor`.
- `VentanaEliminarRepartidor`.

De esta forma, los repartidores pueden ser registrados, consultados, modificados y eliminados.

Los repartidores quedan almacenados en la tabla:

```text
repartidores
```

de MySQL.

---

# 📋 Lista de pedidos

`VentanaListaPedidos` permite visualizar los pedidos registrados mediante un `JTable`.

La tabla contiene:

```text
ID
Direccion
Tipo
Estado
```

Los datos mostrados son consultados desde MySQL mediante `PedidoTablaDAO`.

La ventana incorpora la opción:

```text
Refrescar
```

que permite volver a consultar la información almacenada en la base de datos.

La tabla es utilizada para visualizar información y sus celdas no pueden ser modificadas directamente por el usuario.

---

# 🚚 Gestión de entregas – Semana 8

Durante la Semana 8 se incorpora:

```text
VentanaGestionEntregas
```

Esta ventana permite consultar las entregas almacenadas en MySQL mediante un `JTable`.

Desde esta interfaz es posible:

```text
Consultar entregas
Refrescar información
Editar el repartidor asociado
Eliminar una entrega
```

Las operaciones realizadas se almacenan directamente en MySQL mediante `EntregaDAO`.

---

# 🗄️ Base de datos – Semanas 7 y 8

Durante la Semana 8, SpeedFast utiliza una base de datos MySQL denominada:

```text
speedfast_semana8_db
```

La base contiene tres tablas principales:

```text
repartidores
pedidos
entregas
```

---

## Tabla `repartidores`

Almacena los repartidores disponibles en SpeedFast.

```text
id
nombre
```

El campo `id` corresponde a la clave primaria y utiliza `AUTO_INCREMENT`.

---

## Tabla `pedidos`

Almacena los pedidos registrados desde la aplicación.

```text
id
direccion
tipo
estado
```

El campo `id` corresponde a la clave primaria y utiliza `AUTO_INCREMENT`.

---

## Tabla `entregas`

Registra la relación entre un pedido y el repartidor que realiza la entrega.

```text
id
id_pedido
id_repartidor
fecha
hora
```

La tabla contiene claves foráneas hacia:

```text
pedidos(id)
repartidores(id)
```

Esto permite mantener relacionadas las entregas con los pedidos y repartidores correspondientes.

---

# 📄 Script SQL – Semana 8

El proyecto incluye:

```text
Semana8.sql
```

Este archivo contiene el DDL necesario para crear la estructura utilizada por la versión de Semana 8 de SpeedFast.

El script permite crear:

```text
speedfast_semana8_db
repartidores
pedidos
entregas
```

También incorpora las relaciones necesarias entre las tablas y consultas de verificación.

---

# 🔌 Conexión JDBC

La clase:

```text
ConexionBD
```

ubicada en el paquete:

```text
datos
```

es responsable de establecer la conexión entre Java y MySQL.

La conexión utiliza:

```java
DriverManager.getConnection(...)
```

La URL configurada corresponde a:

```text
jdbc:mysql://localhost:3306/speedfast_semana8_db
```

El usuario configurado para la conexión es:

```text
root
```

La contraseña no se encuentra almacenada directamente en el código fuente.

---

# 🔐 Variable de entorno

La contraseña utilizada por MySQL se obtiene mediante la variable de entorno:

```text
MYSQL_PASSWORD
```

En Java se obtiene mediante:

```java
System.getenv("MYSQL_PASSWORD")
```

Esto permite mantener la contraseña fuera del código fuente y evita publicarla en GitHub.

Cada equipo que ejecute SpeedFast debe configurar localmente esta variable con la contraseña correspondiente a su instalación de MySQL.

Ejemplo:

```text
MYSQL_PASSWORD=<contraseña local de MySQL>
```

No se debe reemplazar este ejemplo por una contraseña real dentro del repositorio.

---

# 💾 Acceso a datos mediante DAO

Durante la Semana 7 se incorpora una capa DAO para separar las operaciones JDBC del resto de la aplicación.

Durante la Semana 8 esta capa se amplía para soportar las operaciones CRUD requeridas por el sistema.

## `PedidoDAO`

Permite realizar operaciones relacionadas con los pedidos.

Entre ellas:

```text
Guardar pedidos.
Actualizar pedidos.
Eliminar pedidos.
Actualizar estados.
Consultar pedidos pendientes.
```

Los pedidos nuevos utilizan el ID generado automáticamente por MySQL.

## `RepartidorDAO`

Permite realizar operaciones relacionadas con los repartidores.

Entre ellas:

```text
Registrar repartidores.
Consultar repartidores almacenados.
Actualizar repartidores.
Eliminar repartidores.
```

## `EntregaDAO`

Permite registrar, consultar, actualizar y eliminar entregas en MySQL.

La entrega relaciona:

```text
Pedido
Repartidor
Fecha
Hora
```

## `PedidoTablaDAO`

Permite consultar los pedidos almacenados en MySQL y cargar la información utilizada por el `JTable`.

De esta manera, la tabla de la interfaz gráfica consulta información persistente en lugar de depender solamente de los datos almacenados en memoria.

---

# ✏️ Operaciones CRUD – Semana 8

Durante la Semana 8, SpeedFast amplía la persistencia incorporada en la semana anterior mediante operaciones CRUD integradas con Java Swing y MySQL.

## Pedidos

Los pedidos pueden ser:

```text
Registrados
Consultados
Editados
Eliminados
```

La edición permite modificar la información correspondiente al pedido.

## Repartidores

Los repartidores pueden ser:

```text
Registrados
Consultados
Editados
Eliminados
```

## Entregas

`VentanaGestionEntregas` permite:

```text
Consultar entregas
Cambiar el repartidor asociado
Eliminar una entrega
Refrescar la información
```

Las operaciones se realizan mediante las clases DAO y se reflejan directamente en MySQL.

La base de datos mantiene claves foráneas entre entregas, pedidos y repartidores.

Por este motivo, una eliminación puede ser rechazada cuando el registro se encuentra relacionado con una entrega, protegiendo la integridad de los datos.

---

# 🔒 Manejo de recursos JDBC

Las operaciones de acceso a datos utilizan:

```java
try-with-resources
```

para administrar recursos JDBC como:

```text
Connection
PreparedStatement
ResultSet
```

También se utiliza manejo de:

```java
SQLException
```

para controlar posibles errores durante las operaciones con la base de datos.

---

# 🚚 Proceso de entrega

Desde `VentanaPrincipal`, el usuario puede seleccionar:

```text
Asignar repartidor / Iniciar entrega
```

Los pedidos pendientes son procesados mediante la lógica de `ZonaDeCarga` y `Repartidor`.

Durante el proceso el estado cambia:

```text
PENDIENTE
    ↓
EN_REPARTO
    ↓
ENTREGADO
```

Los cambios de estado se actualizan también en MySQL.

Al finalizar una entrega, se registra la información correspondiente mediante `EntregaDAO`.

Posteriormente, las entregas pueden ser consultadas y administradas desde `VentanaGestionEntregas`.

---

# 💾 Persistencia

Una de las principales incorporaciones de la Semana 7 es la persistencia.

Durante la Semana 8 esta persistencia se amplía mediante operaciones CRUD.

Los registros almacenados en MySQL permanecen disponibles aunque SpeedFast sea cerrado.

Por este motivo es posible:

```text
Ejecutar SpeedFast
        ↓
Registrar información
        ↓
Editar o eliminar información
        ↓
Cerrar SpeedFast
        ↓
Ejecutar nuevamente
        ↓
Consultar información almacenada
```

La persistencia permite que las ventanas de la interfaz vuelvan a consultar los registros almacenados anteriormente desde MySQL.

---

# 💻 Tecnologías utilizadas

- Java JDK 26.
- Java Swing.
- JDBC.
- MySQL Community Server.
- MySQL Connector/J.
- MySQL Workbench.
- IntelliJ IDEA.
- Git.
- GitHub.
- Markdown.

---

# ⚙️ Preparación de la base de datos

Antes de ejecutar SpeedFast se debe preparar MySQL.

### Paso 1

Iniciar el servidor MySQL.

### Paso 2

Abrir el archivo:

```text
Semana8.sql
```

mediante MySQL Workbench.

### Paso 3

Ejecutar el script SQL.

### Paso 4

Verificar la existencia de la base:

```text
speedfast_semana8_db
```

### Paso 5

Verificar las tablas:

```text
repartidores
pedidos
entregas
```

---

# 🔧 MySQL Connector/J

SpeedFast utiliza **MySQL Connector/J** para establecer la conexión JDBC.

El controlador debe encontrarse disponible para el proyecto antes de ejecutar la aplicación.

El proyecto fue desarrollado utilizando:

```text
mysql-connector-j-26.7.0.jar
```

Una vez disponible el controlador JDBC, IntelliJ puede utilizarlo como biblioteca del proyecto para realizar la conexión con MySQL.

La ubicación del archivo `.jar` puede variar según el sistema operativo y la instalación realizada en cada equipo.

---

# ⚙️ Configuración en IntelliJ IDEA

Antes de ejecutar SpeedFast:

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que se encuentre configurado Java JDK 26.
3. Verificar que MySQL Connector/J se encuentre disponible.
4. Ejecutar `Semana8.sql` en MySQL.
5. Configurar la variable de entorno `MYSQL_PASSWORD`.
6. Ejecutar `Main.java`.

La variable se configura localmente en la configuración de ejecución.

Ejemplo:

```text
MYSQL_PASSWORD=<contraseña local de MySQL>
```

La contraseña real no debe incorporarse al código fuente ni al repositorio.

---

# ▶️ Ejecución y prueba

Una vez configurado el proyecto:

1. Ejecutar `Main.java` del paquete `main`.
2. Verificar que se abra la ventana principal.
3. Seleccionar **Registrar pedido**.
4. Ingresar los datos solicitados.
5. Guardar el pedido.
6. Seleccionar **Listar pedidos**.
7. Verificar que el pedido aparezca en estado `PENDIENTE`.
8. Probar la edición de un pedido.
9. Verificar el cambio desde MySQL.
10. Registrar un repartidor.
11. Probar la edición del repartidor.
12. Regresar al menú principal.
13. Seleccionar **Asignar repartidor / Iniciar entrega**.
14. Esperar el procesamiento.
15. Abrir nuevamente **Listar pedidos**.
16. Presionar **Refrescar**.
17. Verificar el cambio de estado.
18. Abrir **Gestionar entregas**.
19. Verificar las entregas almacenadas.
20. Editar el repartidor asociado a una entrega.
21. Verificar el cambio en MySQL.
22. Eliminar una entrega de prueba.
23. Verificar la eliminación en MySQL.
24. Cerrar SpeedFast.
25. Ejecutar nuevamente la aplicación.
26. Verificar que los registros almacenados continúen disponibles.

---

# 🔍 Verificación desde MySQL

Los registros pueden comprobarse mediante:

```sql
SELECT * FROM repartidores;
SELECT * FROM pedidos;
SELECT * FROM entregas;
```

Esto permite comparar la información registrada desde la interfaz gráfica con los datos almacenados realmente en MySQL.

---

# 📄 Funcionalidades implementadas

- Clase abstracta `Pedido`.
- Creación de pedidos de comida, encomienda y express.
- Encapsulamiento.
- Herencia.
- Métodos abstractos y concretos.
- Polimorfismo.
- Sobrecarga.
- Sobrescritura mediante `@Override`.
- Interfaces `Despachable`, `Cancelable` y `Rastreable`.
- Historial mediante `ArrayList`.
- Clase `Repartidor`.
- Implementación de `Runnable`.
- Clase `EstadoPedido`.
- Estados `PENDIENTE`, `EN_REPARTO` y `ENTREGADO`.
- Clase `ZonaDeCarga`.
- Sincronización mediante `synchronized`.
- Ejecución concurrente mediante `ExecutorService`.
- Interfaz gráfica mediante Java Swing.
- Ventana principal.
- Registro de pedidos.
- Registro de repartidores.
- Validación de datos.
- Visualización mediante `JTable`.
- Tabla no editable.
- Botón Refrescar.
- Persistencia mediante MySQL.
- Conexión mediante JDBC.
- Clase `ConexionBD`.
- Patrón DAO.
- `PedidoDAO`.
- `RepartidorDAO`.
- `EntregaDAO`.
- `PedidoTablaDAO`.
- Uso de `PreparedStatement`.
- Uso de `ResultSet`.
- Manejo de `SQLException`.
- Cierre de recursos mediante `try-with-resources`.
- Inserción de pedidos en MySQL.
- Consulta de repartidores.
- Actualización de estados.
- Registro de entregas.
- Consulta de pedidos desde MySQL.
- Edición y eliminación de pedidos.
- Edición y eliminación de repartidores.
- Consulta, edición y eliminación de entregas.
- Operaciones CRUD integradas con Java Swing y MySQL.
- Integridad referencial mediante claves foráneas.
- Persistencia después de reiniciar la aplicación.
- Variable de entorno `MYSQL_PASSWORD`.
- Documentación mediante Javadoc.
- Control de versiones mediante Git.
- Publicación mediante GitHub.

---

# 📈 Reutilización y mantenibilidad

La clase abstracta `Pedido` mantiene los atributos y comportamientos comunes de la jerarquía.

Las subclases especializan las reglas correspondientes a cada tipo de pedido.

Las interfaces permiten separar las capacidades de los pedidos.

`Repartidor` representa las tareas concurrentes y `ZonaDeCarga` administra el recurso compartido.

La interfaz gráfica se mantiene separada en el paquete `vista`.

Durante la Semana 7, las operaciones SQL se separan mediante el paquete `dao`.

Durante la Semana 8, los DAO se amplían para soportar operaciones CRUD desde la interfaz gráfica.

La conexión se centraliza mediante `ConexionBD` en el paquete `datos`.

Esta organización permite mantener separadas las responsabilidades entre:

```text
Interfaz
Modelo
Acceso a datos
Conexión
Base de datos
```

De esta manera, SpeedFast incorpora persistencia y operaciones CRUD manteniendo la estructura orientada a objetos desarrollada durante las semanas anteriores.

---

# 📚 Evolución del proyecto

```text
Semanas iniciales
Herencia, abstracción, polimorfismo e interfaces
        ↓
Semana 4
Concurrencia con Runnable y ExecutorService
        ↓
Semana 5
Sincronización y ZonaDeCarga
        ↓
Semana 6
Interfaz gráfica con Java Swing
        ↓
Semana 7
Persistencia con JDBC, MySQL y DAO
        ↓
Semana 8
Operaciones CRUD e integración Swing + MySQL
```

SpeedFast se desarrolla de manera incremental, reutilizando y ampliando las funcionalidades implementadas durante las semanas anteriores.

---

# ✅ Conclusión

El proyecto **SpeedFast** integra los conceptos desarrollados durante las primeras ocho semanas de Programación Orientado a Objetos II.

La clase abstracta `Pedido` permite centralizar información y comportamientos comunes, mientras que `PedidoComida`, `PedidoEncomienda` y `PedidoExpress` especializan las reglas del sistema.

Las interfaces permiten representar diferentes capacidades de los pedidos.

Durante la Semana 4 se incorpora concurrencia mediante `Runnable` y `ExecutorService`.

Durante la Semana 5 se incorpora sincronización mediante `ZonaDeCarga`.

Durante la Semana 6 se incorpora una interfaz gráfica desarrollada con Java Swing.

Durante la Semana 7 se incorpora persistencia mediante **JDBC y MySQL**.

Durante la Semana 8 se incorporan operaciones **CRUD** para pedidos, repartidores y entregas, integradas con Java Swing y la base de datos.

Las clases DAO permiten separar las operaciones SQL del resto de la aplicación y `ConexionBD` centraliza la conexión con MySQL.

La interfaz permite registrar, consultar, editar y eliminar información persistente, mientras que las relaciones definidas mediante claves foráneas permiten mantener la integridad de los datos.

De esta forma, SpeedFast evoluciona desde una aplicación orientada a objetos con interfaz gráfica hacia una aplicación con persistencia y operaciones CRUD sobre una base de datos relacional, manteniendo y ampliando los conceptos desarrollados durante las semanas anteriores.

---

# 🔗 Repositorio

**GitHub**

https://github.com/sergiosandovalv/SpeedFast
Durante las Semanas 7 y 8 el proyecto se organiza en cinco paquetes principales.

### `dao`

Contiene las clases encargadas de realizar las operaciones JDBC sobre la base de datos:

- `PedidoDAO`.
- `PedidoTablaDAO`.
- `RepartidorDAO`.
- `EntregaDAO`.

### `datos`

Contiene la clase:

- `ConexionBD`.

Esta clase centraliza la conexión entre la aplicación SpeedFast y MySQL.

### `main`

Contiene la clase `Main`, encargada de iniciar la aplicación.

### `modelo`

Contiene las clases relacionadas con la lógica y los datos del sistema:

- `Pedido`.
- `PedidoComida`.
- `PedidoEncomienda`.
- `PedidoExpress`.
- `ControladorPedidos`.
- `Repartidor`.
- `Entrega`.
- `ZonaDeCarga`.
- `EstadoPedido`.
- `Despachable`.
- `Cancelable`.
- `Rastreable`.

### `vista`

Contiene las clases relacionadas con la interfaz gráfica:

- `VentanaPrincipal`.
- `VentanaRegistroPedido`.
- `VentanaRegistroRepartidor`.
- `VentanaListaPedidos`.
- `VentanaEditarPedido`.
- `VentanaEliminarPedido`.
- `VentanaEditarRepartidor`.
- `VentanaEliminarRepartidor`.
- `VentanaGestionEntregas`.

Esta organización permite separar las responsabilidades del sistema entre modelo, interfaz gráfica, conexión y acceso a datos.

---

# 📊 Diagrama general del proyecto

```text
                           SpeedFast
                               │
           ┌───────────────────┼───────────────────┐
           │                   │                   │
           ▼                   ▼                   ▼
         vista               modelo               dao
           │                   │                   │
           │                 Pedido            PedidoDAO
           │             <<abstracta>>       RepartidorDAO
           │                   │              EntregaDAO
           │       ┌───────────┼───────────┐  PedidoTablaDAO
           │       │           │           │       │
           │       ▼           ▼           ▼       │
           │  PedidoComida  PedidoEncomienda       │
           │                         PedidoExpress  │
           │                                        │
           │                                        ▼
           │                                   ConexionBD
           │                                        │
           └────────────────────────────────────────┤
                                                    ▼
                                                  MySQL
                                                    │
                                      ┌─────────────┼─────────────┐
                                      ▼             ▼             ▼
                                   pedidos    repartidores     entregas
```

---

# 🧩 Abstracción

La clase `Pedido` se define como abstracta:

```java
public abstract class Pedido
```

Esto permite utilizarla como base de la jerarquía sin crear objetos `Pedido` directamente.

Cada subclase mantiene los comportamientos específicos correspondientes a su tipo.

---

# 🔄 Polimorfismo

Los diferentes tipos de pedidos pueden ser administrados mediante referencias de tipo `Pedido`.

Las clases:

```text
PedidoComida
PedidoEncomienda
PedidoExpress
```

heredan desde `Pedido` y mantienen comportamientos específicos según el tipo de objeto creado.

---

# 🔌 Interfaces

El sistema mantiene las interfaces:

### `Despachable`

Define la capacidad de despachar un pedido.

### `Cancelable`

Define la capacidad de cancelar un pedido.

### `Rastreable`

Define la capacidad de consultar el historial de un pedido.

Las interfaces permiten mantener separadas las capacidades de los pedidos de la estructura principal de herencia.

---

# 🧵 Concurrencia – Semana 4

La clase `Repartidor` funciona como una tarea concurrente mediante:

```java
public class Repartidor implements Runnable
```

La ejecución de los repartidores se administra mediante `ExecutorService`.

Esto permite que diferentes repartidores procesen pedidos concurrentemente.

---

# 🔒 Sincronización – Semana 5

La clase `ZonaDeCarga` representa el recurso compartido entre los repartidores.

El acceso a los pedidos se controla mediante métodos sincronizados.

La sincronización evita que dos repartidores retiren el mismo pedido desde la zona de carga.

---

# 🚦 Estados de los pedidos

El sistema incorpora el enum:

```java
EstadoPedido
```

con los estados:

```text
PENDIENTE
EN_REPARTO
ENTREGADO
```

Cuando se registra un pedido comienza en:

```text
PENDIENTE
```

Durante la entrega:

```text
PENDIENTE
    ↓
EN_REPARTO
    ↓
ENTREGADO
```

Desde la Semana 7 estos cambios también pueden actualizarse en la base de datos.

---

# 🖥️ Interfaz gráfica – Semanas 6, 7 y 8

La interfaz gráfica se encuentra desarrollada mediante Java Swing.

La ventana principal permite acceder a las principales funcionalidades:

```text
Registrar pedido
Registrar repartidor
Editar repartidor
Eliminar repartidor
Listar pedidos
Eliminar pedido
Gestionar entregas
Asignar repartidor / Iniciar entrega
Salir de la aplicacion
```

Durante la Semana 7 la interfaz se integra con MySQL para registrar y consultar información persistente.

Durante la Semana 8 se incorporan opciones para editar y eliminar pedidos y repartidores, además de consultar, editar y eliminar entregas.

---

# 📝 Gestión de pedidos

`VentanaRegistroPedido` permite crear nuevos pedidos desde la interfaz gráfica.

El usuario ingresa:

```text
Direccion
Distancia (km)
Tipo
```

El tipo puede ser:

```text
Comida
Encomienda
Express
```

Dependiendo de la selección se crea una instancia de:

```text
PedidoComida
PedidoEncomienda
PedidoExpress
```

El sistema valida los datos ingresados.

Al guardar el pedido, `PedidoDAO` realiza la operación correspondiente sobre MySQL.

El identificador del pedido es generado por la base de datos mediante `AUTO_INCREMENT`.

Durante la Semana 8 también se incorporan operaciones para editar y eliminar pedidos.

---

# 👤 Gestión de repartidores

Durante la Semana 7 se incorpora `VentanaRegistroRepartidor`.

Esta ventana permite registrar nuevos repartidores desde la interfaz gráfica.

Durante la Semana 8 se incorporan:

- `VentanaEditarRepartidor`.
- `VentanaEliminarRepartidor`.

De esta forma, los repartidores pueden ser registrados, consultados, modificados y eliminados.

Los repartidores quedan almacenados en la tabla:

```text
repartidores
```

de MySQL.

---

# 📋 Lista de pedidos

`VentanaListaPedidos` permite visualizar los pedidos registrados mediante un `JTable`.

La tabla contiene:

```text
ID
Direccion
Tipo
Estado
```

Los datos mostrados son consultados desde MySQL mediante `PedidoTablaDAO`.

La ventana incorpora la opción:

```text
Refrescar
```

que permite volver a consultar la información almacenada en la base de datos.

La tabla es utilizada para visualizar información y sus celdas no pueden ser modificadas directamente por el usuario.

---

# 🚚 Gestión de entregas – Semana 8

Durante la Semana 8 se incorpora:

```text
VentanaGestionEntregas
```

Esta ventana permite consultar las entregas almacenadas en MySQL mediante un `JTable`.

Desde esta interfaz es posible:

```text
Consultar entregas
Refrescar información
Editar el repartidor asociado
Eliminar una entrega
```

Las operaciones realizadas se almacenan directamente en MySQL mediante `EntregaDAO`.

---

# 🗄️ Base de datos – Semanas 7 y 8

Durante la Semana 8, SpeedFast utiliza una base de datos MySQL denominada:

```text
speedfast_semana8_db
```

La base contiene tres tablas principales:

```text
repartidores
pedidos
entregas
```

---

## Tabla `repartidores`

Almacena los repartidores disponibles en SpeedFast.

```text
id
nombre
```

El campo `id` corresponde a la clave primaria y utiliza `AUTO_INCREMENT`.

---

## Tabla `pedidos`

Almacena los pedidos registrados desde la aplicación.

```text
id
direccion
tipo
estado
```

El campo `id` corresponde a la clave primaria y utiliza `AUTO_INCREMENT`.

---

## Tabla `entregas`

Registra la relación entre un pedido y el repartidor que realiza la entrega.

```text
id
id_pedido
id_repartidor
fecha
hora
```

La tabla contiene claves foráneas hacia:

```text
pedidos(id)
repartidores(id)
```

Esto permite mantener relacionadas las entregas con los pedidos y repartidores correspondientes.

---

# 📄 Script SQL – Semana 8

El proyecto incluye:

```text
Semana8.sql
```

Este archivo contiene el DDL necesario para crear la estructura utilizada por la versión de Semana 8 de SpeedFast.

El script permite crear:

```text
speedfast_semana8_db
repartidores
pedidos
entregas
```

También incorpora las relaciones necesarias entre las tablas y consultas de verificación.

---

# 🔌 Conexión JDBC

La clase:

```text
ConexionBD
```

ubicada en el paquete:

```text
datos
```

es responsable de establecer la conexión entre Java y MySQL.

La conexión utiliza:

```java
DriverManager.getConnection(...)
```

La URL configurada corresponde a:

```text
jdbc:mysql://localhost:3306/speedfast_semana8_db
```

El usuario configurado para la conexión es:

```text
root
```

La contraseña no se encuentra almacenada directamente en el código fuente.

---

# 🔐 Variable de entorno

La contraseña utilizada por MySQL se obtiene mediante la variable de entorno:

```text
MYSQL_PASSWORD
```

En Java se obtiene mediante:

```java
System.getenv("MYSQL_PASSWORD")
```

Esto permite mantener la contraseña fuera del código fuente y evita publicarla en GitHub.

Cada equipo que ejecute SpeedFast debe configurar localmente esta variable con la contraseña correspondiente a su instalación de MySQL.

Ejemplo:

```text
MYSQL_PASSWORD=<contraseña local de MySQL>
```

No se debe reemplazar este ejemplo por una contraseña real dentro del repositorio.

---

# 💾 Acceso a datos mediante DAO

Durante la Semana 7 se incorpora una capa DAO para separar las operaciones JDBC del resto de la aplicación.

Durante la Semana 8 esta capa se amplía para soportar las operaciones CRUD requeridas por el sistema.

## `PedidoDAO`

Permite realizar operaciones relacionadas con los pedidos.

Entre ellas:

```text
Guardar pedidos.
Actualizar pedidos.
Eliminar pedidos.
Actualizar estados.
Consultar pedidos pendientes.
```

Los pedidos nuevos utilizan el ID generado automáticamente por MySQL.

## `RepartidorDAO`

Permite realizar operaciones relacionadas con los repartidores.

Entre ellas:

```text
Registrar repartidores.
Consultar repartidores almacenados.
Actualizar repartidores.
Eliminar repartidores.
```

## `EntregaDAO`

Permite registrar, consultar, actualizar y eliminar entregas en MySQL.

La entrega relaciona:

```text
Pedido
Repartidor
Fecha
Hora
```

## `PedidoTablaDAO`

Permite consultar los pedidos almacenados en MySQL y cargar la información utilizada por el `JTable`.

De esta manera, la tabla de la interfaz gráfica consulta información persistente en lugar de depender solamente de los datos almacenados en memoria.

---

# ✏️ Operaciones CRUD – Semana 8

Durante la Semana 8, SpeedFast amplía la persistencia incorporada en la semana anterior mediante operaciones CRUD integradas con Java Swing y MySQL.

## Pedidos

Los pedidos pueden ser:

```text
Registrados
Consultados
Editados
Eliminados
```

La edición permite modificar la información correspondiente al pedido.

## Repartidores

Los repartidores pueden ser:

```text
Registrados
Consultados
Editados
Eliminados
```

## Entregas

`VentanaGestionEntregas` permite:

```text
Consultar entregas
Cambiar el repartidor asociado
Eliminar una entrega
Refrescar la información
```

Las operaciones se realizan mediante las clases DAO y se reflejan directamente en MySQL.

La base de datos mantiene claves foráneas entre entregas, pedidos y repartidores.

Por este motivo, una eliminación puede ser rechazada cuando el registro se encuentra relacionado con una entrega, protegiendo la integridad de los datos.

---

# 🔒 Manejo de recursos JDBC

Las operaciones de acceso a datos utilizan:

```java
try-with-resources
```

para administrar recursos JDBC como:

```text
Connection
PreparedStatement
ResultSet
```

También se utiliza manejo de:

```java
SQLException
```

para controlar posibles errores durante las operaciones con la base de datos.

---

# 🚚 Proceso de entrega

Desde `VentanaPrincipal`, el usuario puede seleccionar:

```text
Asignar repartidor / Iniciar entrega
```

Los pedidos pendientes son procesados mediante la lógica de `ZonaDeCarga` y `Repartidor`.

Durante el proceso el estado cambia:

```text
PENDIENTE
    ↓
EN_REPARTO
    ↓
ENTREGADO
```

Los cambios de estado se actualizan también en MySQL.

Al finalizar una entrega, se registra la información correspondiente mediante `EntregaDAO`.

Posteriormente, las entregas pueden ser consultadas y administradas desde `VentanaGestionEntregas`.

---

# 💾 Persistencia

Una de las principales incorporaciones de la Semana 7 es la persistencia.

Durante la Semana 8 esta persistencia se amplía mediante operaciones CRUD.

Los registros almacenados en MySQL permanecen disponibles aunque SpeedFast sea cerrado.

Por este motivo es posible:

```text
Ejecutar SpeedFast
        ↓
Registrar información
        ↓
Editar o eliminar información
        ↓
Cerrar SpeedFast
        ↓
Ejecutar nuevamente
        ↓
Consultar información almacenada
```

La persistencia permite que las ventanas de la interfaz vuelvan a consultar los registros almacenados anteriormente desde MySQL.

---

# 💻 Tecnologías utilizadas

- Java JDK 26.
- Java Swing.
- JDBC.
- MySQL Community Server.
- MySQL Connector/J.
- MySQL Workbench.
- IntelliJ IDEA.
- Git.
- GitHub.
- Markdown.

---

# ⚙️ Preparación de la base de datos

Antes de ejecutar SpeedFast se debe preparar MySQL.

### Paso 1

Iniciar el servidor MySQL.

### Paso 2

Abrir el archivo:

```text
Semana8.sql
```

mediante MySQL Workbench.

### Paso 3

Ejecutar el script SQL.

### Paso 4

Verificar la existencia de la base:

```text
speedfast_semana8_db
```

### Paso 5

Verificar las tablas:

```text
repartidores
pedidos
entregas
```

---

# 🔧 MySQL Connector/J

SpeedFast utiliza **MySQL Connector/J** para establecer la conexión JDBC.

El controlador debe encontrarse disponible para el proyecto antes de ejecutar la aplicación.

El proyecto fue desarrollado utilizando:

```text
mysql-connector-j-26.7.0.jar
```

Una vez disponible el controlador JDBC, IntelliJ puede utilizarlo como biblioteca del proyecto para realizar la conexión con MySQL.

La ubicación del archivo `.jar` puede variar según el sistema operativo y la instalación realizada en cada equipo.

---

# ⚙️ Configuración en IntelliJ IDEA

Antes de ejecutar SpeedFast:

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que se encuentre configurado Java JDK 26.
3. Verificar que MySQL Connector/J se encuentre disponible.
4. Ejecutar `Semana8.sql` en MySQL.
5. Configurar la variable de entorno `MYSQL_PASSWORD`.
6. Ejecutar `Main.java`.

La variable se configura localmente en la configuración de ejecución.

Ejemplo:

```text
MYSQL_PASSWORD=<contraseña local de MySQL>
```

La contraseña real no debe incorporarse al código fuente ni al repositorio.

---

# ▶️ Ejecución y prueba

# 🧠 Evaluación – Programación Orientado a Objetos II

## 👨‍💻 Autor del proyecto

**Nombre:** Sergio Sandoval Valenzuela

**Carrera:** Analista Programador

**Sede:** Santiago Online

**Profesor:** Francesco Tossi Brante

---

# 📖 Introducción

Este repositorio contiene el desarrollo del proyecto **SpeedFast**, realizado para la asignatura **Programación Orientado a Objetos II**.

Durante las primeras semanas, el proyecto integra conceptos de herencia, polimorfismo, abstracción e interfaces para representar diferentes tipos de pedidos y sus capacidades.

Durante la **Semana 4**, el proyecto incorpora concurrencia para simular que varios repartidores realizan entregas durante el mismo período de tiempo.

Durante la **Semana 5**, el sistema incorpora sincronización para controlar el acceso concurrente a una zona de carga compartida.

Durante la **Semana 6**, el proyecto incorpora una interfaz gráfica desarrollada con **Java Swing**, permitiendo registrar pedidos, visualizar los pedidos almacenados e iniciar el proceso de entrega desde una ventana principal.

Durante la **Semana 7**, SpeedFast incorpora persistencia de datos mediante **MySQL y JDBC**, permitiendo almacenar pedidos, consultar repartidores, registrar entregas y visualizar desde Swing la información almacenada en la base de datos.

Además, el proyecto incorpora los paquetes `dao` y `datos`, separando las operaciones JDBC y la conexión a MySQL de las clases del modelo y de la interfaz gráfica.

Durante la **Semana 8**, el proyecto evoluciona incorporando operaciones **CRUD** sobre pedidos, repartidores y entregas. La interfaz gráfica permite registrar, consultar, editar y eliminar información persistente, manteniendo la integridad referencial definida en MySQL.

---

# 🎯 Propósito del proyecto

El propósito del proyecto es aplicar conceptos de Programación Orientada a Objetos mediante una jerarquía basada en la clase abstracta `Pedido`.

El sistema permite representar diferentes tipos de pedidos, reutilizar sus características comunes y definir comportamientos específicos según el tipo de pedido.

Mediante las interfaces `Despachable`, `Cancelable` y `Rastreable`, se incorporan diferentes capacidades sin modificar la estructura principal de herencia.

Durante la Semana 4 se incorpora la ejecución concurrente de repartidores mediante `Runnable` y `ExecutorService`.

Durante la Semana 5 se incorpora una `ZonaDeCarga` compartida y sincronizada.

Durante la Semana 6 se incorpora una interfaz gráfica mediante Java Swing.

Durante la Semana 7 se incorpora una capa de acceso a datos mediante JDBC y clases DAO, permitiendo almacenar y consultar información persistente desde MySQL.

Durante la Semana 8 esta capa se amplía con operaciones de creación, consulta, actualización y eliminación de datos desde la interfaz gráfica.

De esta forma, los datos registrados pueden mantenerse almacenados aunque la aplicación sea cerrada y ejecutada nuevamente.

---

# 📘 Conceptos aplicados

- Encapsulamiento.
- Herencia.
- Clases abstractas.
- Métodos abstractos.
- Métodos concretos.
- Polimorfismo.
- Sobrecarga de métodos.
- Sobrescritura mediante `@Override`.
- Interfaces.
- Implementación de múltiples interfaces.
- Desacoplamiento.
- Constructores.
- Getters y Setters.
- Uso de `super()`.
- Uso de `ArrayList`.
- Reutilización de código.
- Documentación mediante Javadoc.
- Enumeraciones mediante `enum`.
- Concurrencia.
- Interfaz `Runnable`.
- Método `run()`.
- Uso de `Thread.sleep()`.
- Manejo de `InterruptedException`.
- Uso de `ExecutorService`.
- Uso de `newFixedThreadPool()`.
- Envío de tareas mediante `submit()`.
- Cierre mediante `shutdown()`.
- Recursos compartidos.
- Secciones críticas.
- Sincronización mediante `synchronized`.
- Interfaz gráfica mediante Java Swing.
- Uso de `JFrame`.
- Uso de `JPanel`.
- Uso de `JButton`.
- Uso de `JLabel`.
- Uso de `JTextField`.
- Uso de `JComboBox`.
- Uso de `JTable`.
- Uso de `JScrollPane`.
- Uso de `JOptionPane`.
- Uso de `SwingUtilities.invokeLater()`.
- Manejo de eventos mediante `ActionListener`.
- Organización del proyecto mediante paquetes.
- Persistencia de datos.
- JDBC.
- MySQL.
- Patrón DAO.
- Operaciones CRUD.
- Uso de `Connection`.
- Uso de `DriverManager`.
- Uso de `PreparedStatement`.
- Uso de `ResultSet`.
- Manejo de `SQLException`.
- Cierre de recursos mediante `try-with-resources`.
- Variables de entorno para información sensible.
- Integridad referencial mediante claves foráneas.
- Control de versiones mediante Git.
- Publicación del proyecto en GitHub.

---

# 🧱 Estructura del proyecto

```text
SpeedFast/
│
├── .gitignore
├── README.md
├── Semana8.sql
│
└── src/
    │
    ├── dao/
    │   ├── EntregaDAO.java
    │   ├── PedidoDAO.java
    │   ├── PedidoTablaDAO.java
    │   └── RepartidorDAO.java
    │
    ├── datos/
    │   └── ConexionBD.java
    │
    ├── main/
    │   └── Main.java
    │
    ├── modelo/
    │   ├── Cancelable.java
    │   ├── ControladorPedidos.java
    │   ├── Despachable.java
    │   ├── Entrega.java
    │   ├── EstadoPedido.java
    │   ├── Pedido.java
    │   ├── PedidoComida.java
    │   ├── PedidoEncomienda.java
    │   ├── PedidoExpress.java
    │   ├── Rastreable.java
    │   ├── Repartidor.java
    │   └── ZonaDeCarga.java
    │
    └── vista/
        ├── VentanaEditarPedido.java
        ├── VentanaEditarRepartidor.java
        ├── VentanaEliminarPedido.java
        ├── VentanaEliminarRepartidor.java
        ├── VentanaGestionEntregas.java
        ├── VentanaListaPedidos.java
        ├── VentanaPrincipal.java
        ├── VentanaRegistroPedido.java
        └── VentanaRegistroRepartidor.java
```

---

# 📦 Organización mediante paquetes

Durante las Semanas 7 y 8 el proyecto se organiza en cinco paquetes principales.

### `dao`

Contiene las clases encargadas de realizar las operaciones JDBC sobre la base de datos:

- `PedidoDAO`.
- `PedidoTablaDAO`.
- `RepartidorDAO`.
- `EntregaDAO`.

### `datos`

Contiene la clase:

- `ConexionBD`.

Esta clase centraliza la conexión entre la aplicación SpeedFast y MySQL.

### `main`

Contiene la clase `Main`, encargada de iniciar la aplicación.

### `modelo`

Contiene las clases relacionadas con la lógica y los datos del sistema:

- `Pedido`.
- `PedidoComida`.
- `PedidoEncomienda`.
- `PedidoExpress`.
- `ControladorPedidos`.
- `Repartidor`.
- `Entrega`.
- `ZonaDeCarga`.
- `EstadoPedido`.
- `Despachable`.
- `Cancelable`.
- `Rastreable`.

### `vista`

Contiene las clases relacionadas con la interfaz gráfica:

- `VentanaPrincipal`.
- `VentanaRegistroPedido`.
- `VentanaRegistroRepartidor`.
- `VentanaListaPedidos`.
- `VentanaEditarPedido`.
- `VentanaEliminarPedido`.
- `VentanaEditarRepartidor`.
- `VentanaEliminarRepartidor`.
- `VentanaGestionEntregas`.

Esta organización permite separar las responsabilidades del sistema entre modelo, interfaz gráfica, conexión y acceso a datos.

---

# 📊 Diagrama general del proyecto

```text
                           SpeedFast
                               │
           ┌───────────────────┼───────────────────┐
           │                   │                   │
           ▼                   ▼                   ▼
         vista               modelo               dao
           │                   │                   │
           │                 Pedido            PedidoDAO
           │             <<abstracta>>       RepartidorDAO
           │                   │              EntregaDAO
           │       ┌───────────┼───────────┐  PedidoTablaDAO
           │       │           │           │       │
           │       ▼           ▼           ▼       │
           │  PedidoComida  PedidoEncomienda       │
           │                         PedidoExpress  │
           │                                        │
           │                                        ▼
           │                                   ConexionBD
           │                                        │
           └────────────────────────────────────────┤
                                                    ▼
                                                  MySQL
                                                    │
                                      ┌─────────────┼─────────────┐
                                      ▼             ▼             ▼
                                   pedidos    repartidores     entregas
```

---

# 🧩 Abstracción

La clase `Pedido` se define como abstracta:

```java
public abstract class Pedido
```

Esto permite utilizarla como base de la jerarquía sin crear objetos `Pedido` directamente.

Cada subclase mantiene los comportamientos específicos correspondientes a su tipo.

---

# 🔄 Polimorfismo

Los diferentes tipos de pedidos pueden ser administrados mediante referencias de tipo `Pedido`.

Las clases:

```text
PedidoComida
PedidoEncomienda
PedidoExpress
```

heredan desde `Pedido` y mantienen comportamientos específicos según el tipo de objeto creado.

---

# 🔌 Interfaces

El sistema mantiene las interfaces:

### `Despachable`

Define la capacidad de despachar un pedido.

### `Cancelable`

Define la capacidad de cancelar un pedido.

### `Rastreable`

Define la capacidad de consultar el historial de un pedido.

Las interfaces permiten mantener separadas las capacidades de los pedidos de la estructura principal de herencia.

---

# 🧵 Concurrencia – Semana 4

La clase `Repartidor` funciona como una tarea concurrente mediante:

```java
public class Repartidor implements Runnable
```

La ejecución de los repartidores se administra mediante `ExecutorService`.

Esto permite que diferentes repartidores procesen pedidos concurrentemente.

---

# 🔒 Sincronización – Semana 5

La clase `ZonaDeCarga` representa el recurso compartido entre los repartidores.

El acceso a los pedidos se controla mediante métodos sincronizados.

La sincronización evita que dos repartidores retiren el mismo pedido desde la zona de carga.

---

# 🚦 Estados de los pedidos

El sistema incorpora el enum:

```java
EstadoPedido
```

con los estados:

```text
PENDIENTE
EN_REPARTO
ENTREGADO
```

Cuando se registra un pedido comienza en:

```text
PENDIENTE
```

Durante la entrega:

```text
PENDIENTE
    ↓
EN_REPARTO
    ↓
ENTREGADO
```

Desde la Semana 7 estos cambios también pueden actualizarse en la base de datos.

---

# 🖥️ Interfaz gráfica – Semanas 6, 7 y 8

La interfaz gráfica se encuentra desarrollada mediante Java Swing.

La ventana principal permite acceder a las principales funcionalidades:

```text
Registrar pedido
Registrar repartidor
Editar repartidor
Eliminar repartidor
Listar pedidos
Eliminar pedido
Gestionar entregas
Asignar repartidor / Iniciar entrega
Salir de la aplicacion
```

Durante la Semana 7 la interfaz se integra con MySQL para registrar y consultar información persistente.

Durante la Semana 8 se incorporan opciones para editar y eliminar pedidos y repartidores, además de consultar, editar y eliminar entregas.

---

# 📝 Gestión de pedidos

`VentanaRegistroPedido` permite crear nuevos pedidos desde la interfaz gráfica.

El usuario ingresa:

```text
Direccion
Distancia (km)
Tipo
```

El tipo puede ser:

```text
Comida
Encomienda
Express
```

Dependiendo de la selección se crea una instancia de:

```text
PedidoComida
PedidoEncomienda
PedidoExpress
```

El sistema valida los datos ingresados.

Al guardar el pedido, `PedidoDAO` realiza la operación correspondiente sobre MySQL.

El identificador del pedido es generado por la base de datos mediante `AUTO_INCREMENT`.

Durante la Semana 8 también se incorporan operaciones para editar y eliminar pedidos.

---

# 👤 Gestión de repartidores

Durante la Semana 7 se incorpora `VentanaRegistroRepartidor`.

Esta ventana permite registrar nuevos repartidores desde la interfaz gráfica.

Durante la Semana 8 se incorporan:

- `VentanaEditarRepartidor`.
- `VentanaEliminarRepartidor`.

De esta forma, los repartidores pueden ser registrados, consultados, modificados y eliminados.

Los repartidores quedan almacenados en la tabla:

```text
repartidores
```

de MySQL.

---

# 📋 Lista de pedidos

`VentanaListaPedidos` permite visualizar los pedidos registrados mediante un `JTable`.

La tabla contiene:

```text
ID
Direccion
Tipo
Estado
```

Los datos mostrados son consultados desde MySQL mediante `PedidoTablaDAO`.

La ventana incorpora la opción:

```text
Refrescar
```

que permite volver a consultar la información almacenada en la base de datos.

La tabla es utilizada para visualizar información y sus celdas no pueden ser modificadas directamente por el usuario.

---

# 🚚 Gestión de entregas – Semana 8

Durante la Semana 8 se incorpora:

```text
VentanaGestionEntregas
```

Esta ventana permite consultar las entregas almacenadas en MySQL mediante un `JTable`.

Desde esta interfaz es posible:

```text
Consultar entregas
Refrescar información
Editar el repartidor asociado
Eliminar una entrega
```

Las operaciones realizadas se almacenan directamente en MySQL mediante `EntregaDAO`.

---

# 🗄️ Base de datos – Semanas 7 y 8

Durante la Semana 8, SpeedFast utiliza una base de datos MySQL denominada:

```text
speedfast_semana8_db
```

La base contiene tres tablas principales:

```text
repartidores
pedidos
entregas
```

---

## Tabla `repartidores`

Almacena los repartidores disponibles en SpeedFast.

```text
id
nombre
```

El campo `id` corresponde a la clave primaria y utiliza `AUTO_INCREMENT`.

---

## Tabla `pedidos`

Almacena los pedidos registrados desde la aplicación.

```text
id
direccion
tipo
estado
```

El campo `id` corresponde a la clave primaria y utiliza `AUTO_INCREMENT`.

---

## Tabla `entregas`

Registra la relación entre un pedido y el repartidor que realiza la entrega.

```text
id
id_pedido
id_repartidor
fecha
hora
```

La tabla contiene claves foráneas hacia:

```text
pedidos(id)
repartidores(id)
```

Esto permite mantener relacionadas las entregas con los pedidos y repartidores correspondientes.

---

# 📄 Script SQL – Semana 8

El proyecto incluye:

```text
Semana8.sql
```

Este archivo contiene el DDL necesario para crear la estructura utilizada por la versión de Semana 8 de SpeedFast.

El script permite crear:

```text
speedfast_semana8_db
repartidores
pedidos
entregas
```

También incorpora las relaciones necesarias entre las tablas y consultas de verificación.

---

# 🔌 Conexión JDBC

La clase:

```text
ConexionBD
```

ubicada en el paquete:

```text
datos
```

es responsable de establecer la conexión entre Java y MySQL.

La conexión utiliza:

```java
DriverManager.getConnection(...)
```

La URL configurada corresponde a:

```text
jdbc:mysql://localhost:3306/speedfast_semana8_db
```

El usuario configurado para la conexión es:

```text
root
```

La contraseña no se encuentra almacenada directamente en el código fuente.

---

# 🔐 Variable de entorno

La contraseña utilizada por MySQL se obtiene mediante la variable de entorno:

```text
MYSQL_PASSWORD
```

En Java se obtiene mediante:

```java
System.getenv("MYSQL_PASSWORD")
```

Esto permite mantener la contraseña fuera del código fuente y evita publicarla en GitHub.

Cada equipo que ejecute SpeedFast debe configurar localmente esta variable con la contraseña correspondiente a su instalación de MySQL.

Ejemplo:

```text
MYSQL_PASSWORD=<contraseña local de MySQL>
```

No se debe reemplazar este ejemplo por una contraseña real dentro del repositorio.

---

# 💾 Acceso a datos mediante DAO

Durante la Semana 7 se incorpora una capa DAO para separar las operaciones JDBC del resto de la aplicación.

Durante la Semana 8 esta capa se amplía para soportar las operaciones CRUD requeridas por el sistema.

## `PedidoDAO`

Permite realizar operaciones relacionadas con los pedidos.

Entre ellas:

```text
Guardar pedidos.
Actualizar pedidos.
Eliminar pedidos.
Actualizar estados.
Consultar pedidos pendientes.
```

Los pedidos nuevos utilizan el ID generado automáticamente por MySQL.

## `RepartidorDAO`

Permite realizar operaciones relacionadas con los repartidores.

Entre ellas:

```text
Registrar repartidores.
Consultar repartidores almacenados.
Actualizar repartidores.
Eliminar repartidores.
```

## `EntregaDAO`

Permite registrar, consultar, actualizar y eliminar entregas en MySQL.

La entrega relaciona:

```text
Pedido
Repartidor
Fecha
Hora
```

## `PedidoTablaDAO`

Permite consultar los pedidos almacenados en MySQL y cargar la información utilizada por el `JTable`.

De esta manera, la tabla de la interfaz gráfica consulta información persistente en lugar de depender solamente de los datos almacenados en memoria.

---

# ✏️ Operaciones CRUD – Semana 8

Durante la Semana 8, SpeedFast amplía la persistencia incorporada en la semana anterior mediante operaciones CRUD integradas con Java Swing y MySQL.

## Pedidos

Los pedidos pueden ser:

```text
Registrados
Consultados
Editados
Eliminados
```

La edición permite modificar la información correspondiente al pedido.

## Repartidores

Los repartidores pueden ser:

```text
Registrados
Consultados
Editados
Eliminados
```

## Entregas

`VentanaGestionEntregas` permite:

```text
Consultar entregas
Cambiar el repartidor asociado
Eliminar una entrega
Refrescar la información
```

Las operaciones se realizan mediante las clases DAO y se reflejan directamente en MySQL.

La base de datos mantiene claves foráneas entre entregas, pedidos y repartidores.

Por este motivo, una eliminación puede ser rechazada cuando el registro se encuentra relacionado con una entrega, protegiendo la integridad de los datos.

---

# 🔒 Manejo de recursos JDBC

Las operaciones de acceso a datos utilizan:

```java
try-with-resources
```

para administrar recursos JDBC como:

```text
Connection
PreparedStatement
ResultSet
```

También se utiliza manejo de:

```java
SQLException
```

para controlar posibles errores durante las operaciones con la base de datos.

---

# 🚚 Proceso de entrega

Desde `VentanaPrincipal`, el usuario puede seleccionar:

```text
Asignar repartidor / Iniciar entrega
```

Los pedidos pendientes son procesados mediante la lógica de `ZonaDeCarga` y `Repartidor`.

Durante el proceso el estado cambia:

```text
PENDIENTE
    ↓
EN_REPARTO
    ↓
ENTREGADO
```

Los cambios de estado se actualizan también en MySQL.

Al finalizar una entrega, se registra la información correspondiente mediante `EntregaDAO`.

Posteriormente, las entregas pueden ser consultadas y administradas desde `VentanaGestionEntregas`.

---

# 💾 Persistencia

Una de las principales incorporaciones de la Semana 7 es la persistencia.

Durante la Semana 8 esta persistencia se amplía mediante operaciones CRUD.

Los registros almacenados en MySQL permanecen disponibles aunque SpeedFast sea cerrado.

Por este motivo es posible:

```text
Ejecutar SpeedFast
        ↓
Registrar información
        ↓
Editar o eliminar información
        ↓
Cerrar SpeedFast
        ↓
Ejecutar nuevamente
        ↓
Consultar información almacenada
```

La persistencia permite que las ventanas de la interfaz vuelvan a consultar los registros almacenados anteriormente desde MySQL.

---

# 💻 Tecnologías utilizadas

- Java JDK 26.
- Java Swing.
- JDBC.
- MySQL Community Server.
- MySQL Connector/J.
- MySQL Workbench.
- IntelliJ IDEA.
- Git.
- GitHub.
- Markdown.

---

# ⚙️ Preparación de la base de datos

Antes de ejecutar SpeedFast se debe preparar MySQL.

### Paso 1

Iniciar el servidor MySQL.

### Paso 2

Abrir el archivo:

```text
Semana8.sql
```

mediante MySQL Workbench.

### Paso 3

Ejecutar el script SQL.

### Paso 4

Verificar la existencia de la base:

```text
speedfast_semana8_db
```

### Paso 5

Verificar las tablas:

```text
repartidores
pedidos
entregas
```

---

# 🔧 MySQL Connector/J

SpeedFast utiliza **MySQL Connector/J** para establecer la conexión JDBC.

El controlador debe encontrarse disponible para el proyecto antes de ejecutar la aplicación.

El proyecto fue desarrollado utilizando:

```text
mysql-connector-j-26.7.0.jar
```

Una vez disponible el controlador JDBC, IntelliJ puede utilizarlo como biblioteca del proyecto para realizar la conexión con MySQL.

La ubicación del archivo `.jar` puede variar según el sistema operativo y la instalación realizada en cada equipo.

---

# ⚙️ Configuración en IntelliJ IDEA

Antes de ejecutar SpeedFast:

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que se encuentre configurado Java JDK 26.
3. Verificar que MySQL Connector/J se encuentre disponible.
4. Ejecutar `Semana8.sql` en MySQL.
5. Configurar la variable de entorno `MYSQL_PASSWORD`.
6. Ejecutar `Main.java`.

La variable se configura localmente en la configuración de ejecución.

Ejemplo:

```text
MYSQL_PASSWORD=<contraseña local de MySQL>
```

La contraseña real no debe incorporarse al código fuente ni al repositorio.

---

# ▶️ Ejecución y prueba

Una vez configurado el proyecto:

1. Ejecutar `Main.java` del paquete `main`.
2. Verificar que se abra la ventana principal.
3. Seleccionar **Registrar pedido**.
4. Ingresar los datos solicitados.
5. Guardar el pedido.
6. Seleccionar **Listar pedidos**.
7. Verificar que el pedido aparezca en estado `PENDIENTE`.
8. Probar la edición de un pedido.
9. Verificar el cambio desde MySQL.
10. Registrar un repartidor.
11. Probar la edición del repartidor.
12. Regresar al menú principal.
13. Seleccionar **Asignar repartidor / Iniciar entrega**.
14. Esperar el procesamiento.
15. Abrir nuevamente **Listar pedidos**.
16. Presionar **Refrescar**.
17. Verificar el cambio de estado.
18. Abrir **Gestionar entregas**.
19. Verificar las entregas almacenadas.
20. Editar el repartidor asociado a una entrega.
21. Verificar el cambio en MySQL.
22. Eliminar una entrega de prueba.
23. Verificar la eliminación en MySQL.
24. Cerrar SpeedFast.
25. Ejecutar nuevamente la aplicación.
26. Verificar que los registros almacenados continúen disponibles.

---

# 🔍 Verificación desde MySQL

Los registros pueden comprobarse mediante:

```sql
SELECT * FROM repartidores;
SELECT * FROM pedidos;
SELECT * FROM entregas;
```

Esto permite comparar la información registrada desde la interfaz gráfica con los datos almacenados realmente en MySQL.

---

# 📄 Funcionalidades implementadas

- Clase abstracta `Pedido`.
- Creación de pedidos de comida, encomienda y express.
- Encapsulamiento.
- Herencia.
- Métodos abstractos y concretos.
- Polimorfismo.
- Sobrecarga.
- Sobrescritura mediante `@Override`.
- Interfaces `Despachable`, `Cancelable` y `Rastreable`.
- Historial mediante `ArrayList`.
- Clase `Repartidor`.
- Implementación de `Runnable`.
- Clase `EstadoPedido`.
- Estados `PENDIENTE`, `EN_REPARTO` y `ENTREGADO`.
- Clase `ZonaDeCarga`.
- Sincronización mediante `synchronized`.
- Ejecución concurrente mediante `ExecutorService`.
- Interfaz gráfica mediante Java Swing.
- Ventana principal.
- Registro de pedidos.
- Registro de repartidores.
- Validación de datos.
- Visualización mediante `JTable`.
- Tabla no editable.
- Botón Refrescar.
- Persistencia mediante MySQL.
- Conexión mediante JDBC.
- Clase `ConexionBD`.
- Patrón DAO.
- `PedidoDAO`.
- `RepartidorDAO`.
- `EntregaDAO`.
- `PedidoTablaDAO`.
- Uso de `PreparedStatement`.
- Uso de `ResultSet`.
- Manejo de `SQLException`.
- Cierre de recursos mediante `try-with-resources`.
- Inserción de pedidos en MySQL.
- Consulta de repartidores.
- Actualización de estados.
- Registro de entregas.
- Consulta de pedidos desde MySQL.
- Edición y eliminación de pedidos.
- Edición y eliminación de repartidores.
- Consulta, edición y eliminación de entregas.
- Operaciones CRUD integradas con Java Swing y MySQL.
- Integridad referencial mediante claves foráneas.
- Persistencia después de reiniciar la aplicación.
- Variable de entorno `MYSQL_PASSWORD`.
- Documentación mediante Javadoc.
- Control de versiones mediante Git.
- Publicación mediante GitHub.

---

# 📈 Reutilización y mantenibilidad

La clase abstracta `Pedido` mantiene los atributos y comportamientos comunes de la jerarquía.

Las subclases especializan las reglas correspondientes a cada tipo de pedido.

Las interfaces permiten separar las capacidades de los pedidos.

`Repartidor` representa las tareas concurrentes y `ZonaDeCarga` administra el recurso compartido.

La interfaz gráfica se mantiene separada en el paquete `vista`.

Durante la Semana 7, las operaciones SQL se separan mediante el paquete `dao`.

Durante la Semana 8, los DAO se amplían para soportar operaciones CRUD desde la interfaz gráfica.

La conexión se centraliza mediante `ConexionBD` en el paquete `datos`.

Esta organización permite mantener separadas las responsabilidades entre:

```text
Interfaz
Modelo
Acceso a datos
Conexión
Base de datos
```

De esta manera, SpeedFast incorpora persistencia y operaciones CRUD manteniendo la estructura orientada a objetos desarrollada durante las semanas anteriores.

---

# 📚 Evolución del proyecto

```text
Semanas iniciales
Herencia, abstracción, polimorfismo e interfaces
        ↓
Semana 4
Concurrencia con Runnable y ExecutorService
        ↓
Semana 5
Sincronización y ZonaDeCarga
        ↓
Semana 6
Interfaz gráfica con Java Swing
        ↓
Semana 7
Persistencia con JDBC, MySQL y DAO
        ↓
Semana 8
Operaciones CRUD e integración Swing + MySQL
```

SpeedFast se desarrolla de manera incremental, reutilizando y ampliando las funcionalidades implementadas durante las semanas anteriores.

---

# ✅ Conclusión

El proyecto **SpeedFast** integra los conceptos desarrollados durante las primeras ocho semanas de Programación Orientado a Objetos II.

La clase abstracta `Pedido` permite centralizar información y comportamientos comunes, mientras que `PedidoComida`, `PedidoEncomienda` y `PedidoExpress` especializan las reglas del sistema.

Las interfaces permiten representar diferentes capacidades de los pedidos.

Durante la Semana 4 se incorpora concurrencia mediante `Runnable` y `ExecutorService`.

Durante la Semana 5 se incorpora sincronización mediante `ZonaDeCarga`.

Durante la Semana 6 se incorpora una interfaz gráfica desarrollada con Java Swing.

Durante la Semana 7 se incorpora persistencia mediante **JDBC y MySQL**.

Durante la Semana 8 se incorporan operaciones **CRUD** para pedidos, repartidores y entregas, integradas con Java Swing y la base de datos.

Las clases DAO permiten separar las operaciones SQL del resto de la aplicación y `ConexionBD` centraliza la conexión con MySQL.

La interfaz permite registrar, consultar, editar y eliminar información persistente, mientras que las relaciones definidas mediante claves foráneas permiten mantener la integridad de los datos.

De esta forma, SpeedFast evoluciona desde una aplicación orientada a objetos con interfaz gráfica hacia una aplicación con persistencia y operaciones CRUD sobre una base de datos relacional, manteniendo y ampliando los conceptos desarrollados durante las semanas anteriores.

---

# 🔗 Repositorio

**GitHub**

https://github.com/sergiosandovalv/SpeedFast

Una vez configurado el proyecto:

1. Ejecutar `Main.java` del paquete `main`.
2. Verificar que se abra la ventana principal.
3. Seleccionar **Registrar pedido**.
4. Ingresar los datos solicitados.
5. Guardar el pedido.
6. Seleccionar **Listar pedidos**.
7. Verificar que el pedido aparezca en estado `PENDIENTE`.
8. Probar la edición de un pedido.
9. Verificar el cambio desde MySQL.
10. Registrar un repartidor.
11. Probar la edición del repartidor.
12. Regresar al menú principal.
13. Seleccionar **Asignar repartidor / Iniciar entrega**.
14. Esperar el procesamiento.
15. Abrir nuevamente **Listar pedidos**.
16. Presionar **Refrescar**.
17. Verificar el cambio de estado.
18. Abrir **Gestionar entregas**.
19. Verificar las entregas almacenadas.
20. Editar el repartidor asociado a una entrega.
21. Verificar el cambio en MySQL.
22. Eliminar una entrega de prueba.
23. Verificar la eliminación en MySQL.
24. Cerrar SpeedFast.
25. Ejecutar nuevamente la aplicación.
26. Verificar que los registros almacenados continúen disponibles.

---

# 🔍 Verificación desde MySQL

Los registros pueden comprobarse mediante:

```sql
SELECT * FROM repartidores;
SELECT * FROM pedidos;
SELECT * FROM entregas;
```

Esto permite comparar la información registrada desde la interfaz gráfica con los datos almacenados realmente en MySQL.

---

# 📄 Funcionalidades implementadas

- Clase abstracta `Pedido`.
- Creación de pedidos de comida, encomienda y express.
- Encapsulamiento.
- Herencia.
- Métodos abstractos y concretos.
- Polimorfismo.
- Sobrecarga.
- Sobrescritura mediante `@Override`.
- Interfaces `Despachable`, `Cancelable` y `Rastreable`.
- Historial mediante `ArrayList`.
- Clase `Repartidor`.
- Implementación de `Runnable`.
- Clase `EstadoPedido`.
- Estados `PENDIENTE`, `EN_REPARTO` y `ENTREGADO`.
- Clase `ZonaDeCarga`.
- Sincronización mediante `synchronized`.
- Ejecución concurrente mediante `ExecutorService`.
- Interfaz gráfica mediante Java Swing.
- Ventana principal.
- Registro de pedidos.
- Registro de repartidores.
- Validación de datos.
- Visualización mediante `JTable`.
- Tabla no editable.
- Botón Refrescar.
- Persistencia mediante MySQL.
- Conexión mediante JDBC.
- Clase `ConexionBD`.
- Patrón DAO.
- `PedidoDAO`.
- `RepartidorDAO`.
- `EntregaDAO`.
- `PedidoTablaDAO`.
- Uso de `PreparedStatement`.
- Uso de `ResultSet`.
- Manejo de `SQLException`.
- Cierre de recursos mediante `try-with-resources`.
- Inserción de pedidos en MySQL.
- Consulta de repartidores.
- Actualización de estados.
- Registro de entregas.
- Consulta de pedidos desde MySQL.
- Edición y eliminación de pedidos.
- Edición y eliminación de repartidores.
- Consulta, edición y eliminación de entregas.
- Operaciones CRUD integradas con Java Swing y MySQL.
- Integridad referencial mediante claves foráneas.
- Persistencia después de reiniciar la aplicación.
- Variable de entorno `MYSQL_PASSWORD`.
- Documentación mediante Javadoc.
- Control de versiones mediante Git.
- Publicación mediante GitHub.

---

# 📈 Reutilización y mantenibilidad

La clase abstracta `Pedido` mantiene los atributos y comportamientos comunes de la jerarquía.

Las subclases especializan las reglas correspondientes a cada tipo de pedido.

Las interfaces permiten separar las capacidades de los pedidos.

`Repartidor` representa las tareas concurrentes y `ZonaDeCarga` administra el recurso compartido.

La interfaz gráfica se mantiene separada en el paquete `vista`.

Durante la Semana 7, las operaciones SQL se separan mediante el paquete `dao`.

Durante la Semana 8, los DAO se amplían para soportar operaciones CRUD desde la interfaz gráfica.

La conexión se centraliza mediante `ConexionBD` en el paquete `datos`.

Esta organización permite mantener separadas las responsabilidades entre:

```text
Interfaz
Modelo
Acceso a datos
Conexión
Base de datos
```

De esta manera, SpeedFast incorpora persistencia y operaciones CRUD manteniendo la estructura orientada a objetos desarrollada durante las semanas anteriores.

---

# 📚 Evolución del proyecto

```text
Semanas iniciales
Herencia, abstracción, polimorfismo e interfaces
        ↓
Semana 4
Concurrencia con Runnable y ExecutorService
        ↓
Semana 5
Sincronización y ZonaDeCarga
        ↓
Semana 6
Interfaz gráfica con Java Swing
        ↓
Semana 7
Persistencia con JDBC, MySQL y DAO
        ↓
Semana 8
Operaciones CRUD e integración Swing + MySQL
```

SpeedFast se desarrolla de manera incremental, reutilizando y ampliando las funcionalidades implementadas durante las semanas anteriores.

---

# ✅ Conclusión

El proyecto **SpeedFast** integra los conceptos desarrollados durante las primeras ocho semanas de Programación Orientado a Objetos II.

La clase abstracta `Pedido` permite centralizar información y comportamientos comunes, mientras que `PedidoComida`, `PedidoEncomienda` y `PedidoExpress` especializan las reglas del sistema.

Las interfaces permiten representar diferentes capacidades de los pedidos.

Durante la Semana 4 se incorpora concurrencia mediante `Runnable` y `ExecutorService`.

Durante la Semana 5 se incorpora sincronización mediante `ZonaDeCarga`.

Durante la Semana 6 se incorpora una interfaz gráfica desarrollada con Java Swing.

Durante la Semana 7 se incorpora persistencia mediante **JDBC y MySQL**.

Durante la Semana 8 se incorporan operaciones **CRUD** para pedidos, repartidores y entregas, integradas con Java Swing y la base de datos.

Las clases DAO permiten separar las operaciones SQL del resto de la aplicación y `ConexionBD` centraliza la conexión con MySQL.

La interfaz permite registrar, consultar, editar y eliminar información persistente, mientras que las relaciones definidas mediante claves foráneas permiten mantener la integridad de los datos.

De esta forma, SpeedFast evoluciona desde una aplicación orientada a objetos con interfaz gráfica hacia una aplicación con persistencia y operaciones CRUD sobre una base de datos relacional, manteniendo y ampliando los conceptos desarrollados durante las semanas anteriores.

---

# 🔗 Repositorio

**GitHub**

https://github.com/sergiosandovalv/SpeedFast
