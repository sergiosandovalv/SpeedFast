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

Durante la **Semana 5**, el sistema incorpora sincronización para controlar el acceso concurrente a una zona de carga compartida. Los repartidores obtienen pedidos desde este recurso común de forma segura, evitando que un mismo pedido sea retirado por más de un repartidor.

Durante la **Semana 6**, el proyecto incorpora una interfaz gráfica desarrollada con **Java Swing**, permitiendo registrar pedidos, visualizar los pedidos almacenados e iniciar el proceso de entrega desde una ventana principal.

Además, el proyecto se organiza mediante los paquetes `main`, `modelo` y `vista`, separando la ejecución de la aplicación, la lógica del sistema y la interfaz gráfica.

---

# 🎯 Propósito del proyecto

El propósito del proyecto es aplicar conceptos de Programación Orientada a Objetos mediante una jerarquía basada en la clase abstracta `Pedido`.

El sistema permite representar diferentes tipos de pedidos, reutilizar sus características comunes y definir comportamientos específicos según el tipo de pedido.

Mediante las interfaces `Despachable`, `Cancelable` y `Rastreable`, se incorporan diferentes capacidades sin modificar la estructura principal de herencia.

Durante la Semana 4 se incorpora la ejecución concurrente de repartidores mediante `Runnable` y `ExecutorService`.

Durante la Semana 5 se incorpora una `ZonaDeCarga` compartida y sincronizada, permitiendo que varios repartidores retiren y procesen pedidos de forma concurrente sin duplicar su procesamiento.

Durante la Semana 6 se incorpora una interfaz gráfica mediante Java Swing y un `ControladorPedidos` compartido entre las ventanas, permitiendo administrar los pedidos registrados desde la aplicación.

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
- Control de versiones mediante Git.
- Publicación del proyecto en GitHub.

---

# 🧱 Estructura del proyecto

```text
SpeedFast/
│
├── .gitignore
├── README.md
│
└── src/
    │
    ├── main/
    │   └── Main.java
    │
    ├── modelo/
    │   ├── Cancelable.java
    │   ├── ControladorPedidos.java
    │   ├── Despachable.java
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
        ├── VentanaListaPedidos.java
        ├── VentanaPrincipal.java
        └── VentanaRegistroPedido.java
```

---

# 📦 Organización mediante paquetes

Durante la Semana 6 el proyecto se organiza en tres paquetes principales.

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
- `ZonaDeCarga`.
- `EstadoPedido`.
- `Despachable`.
- `Cancelable`.
- `Rastreable`.

### `vista`

Contiene las clases relacionadas con la interfaz gráfica:

- `VentanaPrincipal`.
- `VentanaRegistroPedido`.
- `VentanaListaPedidos`.

Esta organización permite separar las responsabilidades del sistema y mantener una estructura más ordenada.

---

# 📊 Diagrama general de clases

El siguiente diagrama representa de forma simplificada la estructura principal del sistema.

```text
                              Pedido
                           <<abstracta>>
                                │
              ┌─────────────────┼─────────────────┐
              │                 │                 │
              ▼                 ▼                 ▼
        PedidoComida     PedidoEncomienda    PedidoExpress
              │                 │                 │
              └─────────────────┼─────────────────┘
                                │
                       implementan interfaces
                                │
              ┌─────────────────┼─────────────────┐
              │                 │                 │
              ▼                 ▼                 ▼
        Despachable         Cancelable        Rastreable
        <<interface>>       <<interface>>      <<interface>>


                          EstadoPedido
                             <<enum>>
                                │
                 PENDIENTE - EN_REPARTO - ENTREGADO


                          ZonaDeCarga
                                │
                         List<Pedido>
                                │
                         synchronized
                                │
                                ▼
                           Repartidor
                                │
                      implements Runnable


                       ControladorPedidos
                                │
                         List<Pedido>
                                │
             ┌──────────────────┼──────────────────┐
             │                  │                  │
             ▼                  ▼                  ▼
     VentanaPrincipal   VentanaRegistroPedido  VentanaListaPedidos
```

---

# 🧩 Abstracción

La clase `Pedido` se define como abstracta:

```java
public abstract class Pedido
```

Esto permite utilizarla como base de la jerarquía sin crear objetos `Pedido` directamente.

Además, define el método abstracto:

```java
public abstract int calcularTiempoEntrega();
```

Cada subclase implementa este método de acuerdo con sus propias reglas para calcular el tiempo estimado de entrega.

---

# ⏱️ Cálculo de tiempos de entrega

Cada tipo de pedido implementa un comportamiento diferente.

### PedidoComida

Calcula **15 minutos base más 2 minutos por kilómetro**.

```text
15 + (2 × distancia)
```

### PedidoEncomienda

Calcula **20 minutos base más 1.5 minutos por kilómetro**, ajustando el resultado a minutos enteros.

```text
20 + (1.5 × distancia)
```

### PedidoExpress

Considera **10 minutos base** y agrega **5 minutos adicionales** cuando la distancia supera los 5 kilómetros.

```text
10 minutos
+ 5 minutos si distancia > 5 km
```

---

# 🔄 Sobrecarga y sobrescritura

El sistema utiliza sobrecarga mediante dos versiones del método `asignarRepartidor()`:

```java
asignarRepartidor()
```

y:

```java
asignarRepartidor(String nombreRepartidor)
```

La primera versión permite representar una asignación automática, mientras que la segunda permite indicar manualmente el nombre del repartidor.

Las subclases sobrescriben estos comportamientos mediante `@Override` para aplicar reglas específicas según el tipo de pedido.

Por ejemplo:

- `PedidoComida` verifica una mochila térmica.
- `PedidoEncomienda` verifica peso y embalaje.
- `PedidoExpress` busca disponibilidad inmediata.

---

# 🔄 Polimorfismo

Los diferentes tipos de pedidos pueden ser administrados mediante referencias de tipo `Pedido`.

Por ejemplo:

```java
Pedido pedido;

pedido = new PedidoComida(...);
pedido = new PedidoEncomienda(...);
pedido = new PedidoExpress(...);
```

Aunque la referencia es de tipo `Pedido`, cada objeto mantiene el comportamiento correspondiente a su clase real.

Esto permite utilizar una estructura común y mantener comportamientos diferentes para cada tipo de pedido.

---

# 🔌 Interfaces

El sistema incorpora tres interfaces para representar diferentes capacidades de los pedidos.

### Despachable

Define la capacidad de despachar un pedido:

```java
void despachar();
```

### Cancelable

Define la capacidad de cancelar un pedido:

```java
void cancelar();
```

### Rastreable

Define la capacidad de consultar el historial de un pedido:

```java
void verHistorial();
```

Las clases concretas implementan estas interfaces según las capacidades definidas en el sistema.

De esta manera, la jerarquía representa qué tipo de objeto es cada pedido, mientras que las interfaces representan las capacidades que puede realizar.

---

# 📋 Historial de pedidos

Cada pedido mantiene un historial mediante un `ArrayList<String>`.

Cuando se realizan acciones sobre un pedido, estas pueden registrarse en su historial.

Entre los eventos definidos en el sistema se encuentran:

- Creación del pedido.
- Asignación de repartidor.
- Despacho del pedido.
- Cancelación del pedido.

Mediante el método:

```java
verHistorial()
```

es posible visualizar los eventos registrados para cada pedido.

---

# 🧵 Concurrencia – Semana 4

Durante la Semana 4 se incorporó la clase `Repartidor` como una tarea concurrente mediante:

```java
public class Repartidor implements Runnable
```

La ejecución de los repartidores es administrada mediante un `ExecutorService`, permitiendo que varias tareas avancen concurrentemente.

Este concepto continúa siendo utilizado en las semanas siguientes.

---

# 🔒 Sincronización – Semana 5

Durante la Semana 5 se incorpora la clase `ZonaDeCarga` como recurso compartido entre los repartidores.

La clase mantiene una lista de pedidos.

El acceso a esta lista se controla mediante métodos sincronizados:

```java
public synchronized void agregarPedido(Pedido pedido)
```

y:

```java
public synchronized Pedido retirarPedido()
```

La sincronización permite que solamente un repartidor a la vez ejecute la operación crítica de retirar un pedido.

De esta forma se evita que dos repartidores retiren el mismo pedido desde la zona de carga.

---

# 🚦 Estados de los pedidos

El sistema incorpora el enum:

```java
public enum EstadoPedido
```

con tres estados:

```text
PENDIENTE
EN_REPARTO
ENTREGADO
```

Todos los pedidos comienzan con estado:

```text
PENDIENTE
```

Cuando un repartidor retira un pedido:

```text
PENDIENTE -> EN_REPARTO
```

Después de completar la entrega:

```text
EN_REPARTO -> ENTREGADO
```

Esto permite representar el avance del pedido durante el proceso de entrega.

---

# ⏳ Simulación de entregas

Cada repartidor obtiene un pedido desde `ZonaDeCarga` y cambia su estado a `EN_REPARTO`.

Para representar el tiempo de entrega se utiliza:

```java
Thread.sleep(1000);
```

Después de la pausa, el pedido cambia su estado a `ENTREGADO`.

También se maneja `InterruptedException` para controlar una posible interrupción del hilo durante la simulación.

---

# ⚙️ ExecutorService

La ejecución concurrente se administra mediante `ExecutorService`.

El sistema utiliza un pool de tres hilos:

```java
ExecutorService executor =
        Executors.newFixedThreadPool(3);
```

Los repartidores son enviados al executor mediante:

```java
executor.submit(repartidor1);
executor.submit(repartidor2);
executor.submit(repartidor3);
```

Después de enviar las tareas se solicita el cierre:

```java
executor.shutdown();
```

De esta forma los repartidores pueden procesar los pedidos concurrentemente.

---

# 🚚 Repartidores y zona de carga

La simulación utiliza tres repartidores:

```text
Daniel
Nicole
Jaime
```

Los tres reciben la misma instancia de `ZonaDeCarga`.

Los pedidos pendientes son agregados al recurso compartido cuando el usuario selecciona la opción para iniciar las entregas.

Los pedidos no están asignados previamente a un repartidor específico.

Cada repartidor solicita el siguiente pedido disponible a `ZonaDeCarga`.

Por este motivo, la distribución de los pedidos entre Daniel, Nicole y Jaime puede cambiar entre ejecuciones.

---

# 🖥️ Interfaz gráfica – Semana 6

Durante la Semana 6 se incorpora una interfaz gráfica desarrollada mediante **Java Swing**.

La interfaz permite utilizar las principales funciones del sistema mediante ventanas y botones, sin depender exclusivamente de la interacción por consola.

La ventana principal contiene las siguientes opciones:

```text
Registrar pedido
Listar pedidos
Asignar repartidor / Iniciar entrega
Salir de la aplicacion
```

La interfaz gráfica mantiene la lógica desarrollada durante las semanas anteriores y permite acceder a ella de una forma más organizada.

---

# 🏠 Ventana principal

La clase `VentanaPrincipal` representa el menú principal de SpeedFast.

Desde esta ventana el usuario puede:

- Abrir el formulario de registro.
- Consultar los pedidos almacenados.
- Iniciar el proceso de entrega.
- Salir de la aplicación.

La ventana utiliza botones de Swing y eventos para ejecutar cada una de estas acciones.

---

# 📝 Registro de pedidos

La clase `VentanaRegistroPedido` permite ingresar los datos necesarios para crear un nuevo pedido.

El formulario solicita:

```text
ID
Direccion
Distancia (km)
Tipo
```

El tipo de pedido se selecciona mediante un `JComboBox`:

```text
Comida
Encomienda
Express
```

Dependiendo de la selección realizada se crea una instancia de:

```text
PedidoComida
PedidoEncomienda
PedidoExpress
```

El formulario también valida que los campos estén completos, que el ID sea un número entero y que la distancia ingresada sea válida y mayor que cero.

Cuando el pedido se registra correctamente, el sistema muestra un mensaje mediante `JOptionPane`.

La ventana incorpora además un botón **Volver**, que permite cerrarla y regresar a la ventana principal.

---

# 📋 Lista de pedidos

La clase `VentanaListaPedidos` permite visualizar los pedidos registrados mediante un `JTable`.

La tabla contiene las columnas:

```text
ID
Direccion
Distancia (km)
Tipo
Estado
```

La información mostrada proviene del `ControladorPedidos` compartido por las ventanas.

La tabla se utiliza solamente para visualizar información, por lo que sus celdas no pueden ser modificadas directamente por el usuario.

Esto permite proteger los datos mostrados y evita modificaciones accidentales desde la tabla.

La ventana también incorpora un botón **Volver** para regresar al menú principal.

---

# 🎮 Controlador de pedidos

La clase `ControladorPedidos` administra los pedidos utilizados por la aplicación.

El mismo controlador es compartido entre las distintas ventanas.

De esta manera, cuando un pedido es registrado desde `VentanaRegistroPedido`, posteriormente puede ser consultado desde `VentanaListaPedidos` y procesado desde `VentanaPrincipal`.

El controlador permite mantener centralizada la colección de pedidos y separar su administración de la interfaz gráfica.

---

# 🚚 Inicio del proceso de entrega

Desde `VentanaPrincipal`, el usuario puede seleccionar:

```text
Asignar repartidor / Iniciar entrega
```

El sistema obtiene los pedidos que se encuentran pendientes y los agrega a una instancia compartida de `ZonaDeCarga`.

Luego se crean tres repartidores:

```text
Daniel
Nicole
Jaime
```

Los repartidores son ejecutados mediante un `ExecutorService` con tres hilos.

Cada repartidor obtiene pedidos desde la zona de carga compartida y cambia sus estados durante el proceso:

```text
PENDIENTE
    ↓
EN_REPARTO
    ↓
ENTREGADO
```

Gracias a la sincronización de `ZonaDeCarga`, cada pedido es retirado de forma segura y no puede ser procesado simultáneamente por dos repartidores.

---

# 🚪 Salida de la aplicación

La ventana principal incorpora la opción:

```text
Salir de la aplicacion
```

Al seleccionar esta opción se muestra un cuadro de confirmación mediante `JOptionPane`.

El usuario puede seleccionar:

```text
Yes
No
```

Si selecciona **Yes**, la aplicación finaliza.

Si selecciona **No**, la aplicación continúa funcionando normalmente.

Esto evita cerrar el programa accidentalmente.

---

# ▶️ Inicio de la interfaz gráfica

La aplicación se inicia desde la clase `Main`.

La creación de la interfaz gráfica se realiza mediante:

```java
SwingUtilities.invokeLater(() -> {
    ControladorPedidos controlador =
            new ControladorPedidos();

    VentanaPrincipal ventana =
            new VentanaPrincipal(controlador);

    ventana.setVisible(true);
});
```

`SwingUtilities.invokeLater()` permite iniciar la interfaz gráfica utilizando el hilo de eventos de Swing.

Además, se crea una única instancia de `ControladorPedidos`, que posteriormente es compartida con las ventanas del sistema.

---

# 💻 Tecnologías utilizadas

- Java JDK 26.
- Java Swing.
- IntelliJ IDEA.
- Git.
- GitHub.
- Markdown.

---

# 🚀 Ejecución

1. Abrir el proyecto `SpeedFast` en IntelliJ IDEA.
2. Ejecutar la clase `Main.java` del paquete `main`.
3. Se abre la ventana principal de SpeedFast.
4. Seleccionar **Registrar pedido**.
5. Ingresar ID, dirección, distancia y tipo de pedido.
6. Presionar **Guardar**.
7. Regresar al menú mediante **Volver**.
8. Seleccionar **Listar pedidos** para consultar los registros.
9. Verificar que el pedido se encuentre inicialmente en estado `PENDIENTE`.
10. Regresar mediante **Volver**.
11. Seleccionar **Asignar repartidor / Iniciar entrega**.
12. Los pedidos pendientes son enviados a `ZonaDeCarga`.
13. Los repartidores procesan los pedidos concurrentemente.
14. Los pedidos cambian de `PENDIENTE` a `EN_REPARTO`.
15. Al finalizar la entrega cambian a `ENTREGADO`.
16. Consultar nuevamente la lista para verificar el estado.
17. Utilizar **Salir de la aplicacion** para finalizar SpeedFast.

---

# 🖥️ Ejemplo del proceso

Al registrar un pedido desde la interfaz gráfica:

```text
ID: 125
Direccion: dos sur
Distancia: 17.0
Tipo: Encomienda
```

El pedido queda inicialmente registrado como:

```text
ID     Direccion     Distancia     Tipo                Estado
125    dos sur       17.0          PedidoEncomienda    PENDIENTE
```

Después de iniciar el proceso de entrega, la consola puede mostrar:

```text
[Repartidor - Nicole] Retirando pedido #125
[Repartidor - Nicole] Estado: EN_REPARTO
[Repartidor - Nicole] Entregando pedido #125
[Repartidor - Nicole] Pedido #125 entregado.
[Repartidor - Nicole] Estado: ENTREGADO
[Repartidor - Nicole] termino sus entregas.
```

Al consultar nuevamente la lista de pedidos:

```text
ID     Direccion     Distancia     Tipo                Estado
125    dos sur       17.0          PedidoEncomienda    ENTREGADO
```

> El repartidor que procesa cada pedido puede cambiar entre ejecuciones debido al procesamiento concurrente.

---

# 📄 Funcionalidades implementadas

- Clase abstracta `Pedido`.
- Creación de pedidos de comida, encomienda y express.
- Encapsulamiento de atributos comunes.
- Herencia desde la clase `Pedido`.
- Métodos abstractos y concretos.
- Cálculo de tiempos según el tipo de pedido.
- Sobrecarga de métodos.
- Sobrescritura mediante `@Override`.
- Polimorfismo mediante referencias de tipo `Pedido`.
- Interfaces `Despachable`, `Cancelable` y `Rastreable`.
- Implementación de múltiples interfaces.
- Registro de eventos mediante `ArrayList`.
- Visualización del historial.
- Clase `Repartidor`.
- Implementación de `Runnable`.
- Clase `EstadoPedido`.
- Estados `PENDIENTE`, `EN_REPARTO` y `ENTREGADO`.
- Clase `ZonaDeCarga`.
- Lista de pedidos compartida.
- Métodos sincronizados mediante `synchronized`.
- Retiro seguro de pedidos.
- Prevención del procesamiento duplicado.
- Simulación de entregas mediante `Thread.sleep()`.
- Manejo de `InterruptedException`.
- Ejecución concurrente mediante `ExecutorService`.
- Pool de tres hilos mediante `newFixedThreadPool(3)`.
- Envío de tareas mediante `submit()`.
- Cierre del executor mediante `shutdown()`.
- Tres repartidores compartiendo la misma zona de carga.
- Organización mediante paquetes `main`, `modelo` y `vista`.
- Clase `ControladorPedidos`.
- Controlador compartido entre las ventanas.
- Interfaz gráfica mediante Java Swing.
- Ventana principal del sistema.
- Formulario para registrar pedidos.
- Validación de datos ingresados.
- Selección del tipo de pedido mediante `JComboBox`.
- Visualización de pedidos mediante `JTable`.
- Tabla de pedidos no editable.
- Visualización del estado de cada pedido.
- Botones para volver al menú principal.
- Inicio de entregas desde la interfaz gráfica.
- Confirmación para salir de la aplicación.
- Uso de `SwingUtilities.invokeLater()`.
- Documentación mediante Javadoc.
- Control de versiones mediante Git y GitHub.

---

# 📈 Reutilización y mantenibilidad

La clase abstracta `Pedido` centraliza los atributos y comportamientos comunes, evitando repetir código en las subclases.

Cada subclase contiene las reglas específicas correspondientes a su tipo de pedido.

Las interfaces permiten separar capacidades como despacho, cancelación y rastreo de la jerarquía principal.

La clase `Repartidor` representa la tarea concurrente mediante `Runnable`, mientras que `ExecutorService` administra su ejecución.

`ZonaDeCarga` separa la administración del recurso compartido de la lógica del repartidor.

La sincronización se concentra en las operaciones que acceden a la lista compartida, evitando que un mismo pedido sea retirado por más de un repartidor.

Durante la Semana 6, `ControladorPedidos` centraliza la administración de los pedidos utilizados por la interfaz gráfica.

La separación mediante los paquetes `main`, `modelo` y `vista` permite mantener organizadas las responsabilidades del sistema.

De esta manera, SpeedFast conserva la estructura desarrollada durante las semanas anteriores e incorpora una interfaz gráfica sin reemplazar la lógica existente.

---

# ✅ Conclusión

El proyecto **SpeedFast** integra los conceptos trabajados durante las primeras seis semanas de Programación Orientado a Objetos II.

La clase abstracta `Pedido` permite centralizar información y comportamientos comunes, mientras que `PedidoComida`, `PedidoEncomienda` y `PedidoExpress` especializan sus reglas mediante herencia, sobrecarga, sobrescritura y polimorfismo.

Las interfaces `Despachable`, `Cancelable` y `Rastreable` permiten representar diferentes capacidades de los pedidos y mantener organizada la estructura del sistema.

Durante la Semana 4 se incorpora concurrencia mediante la clase `Repartidor`, que implementa `Runnable`, junto con `ExecutorService` para administrar las tareas.

Durante la Semana 5 se incorpora `ZonaDeCarga` como recurso compartido, junto con métodos `synchronized` para controlar el acceso de los repartidores a los pedidos.

También se incorpora `EstadoPedido`, permitiendo representar el cambio de cada pedido desde `PENDIENTE` a `EN_REPARTO` y finalmente a `ENTREGADO`.

Durante la Semana 6 se incorpora una interfaz gráfica mediante Java Swing, permitiendo registrar pedidos, consultar los registros almacenados, iniciar el proceso de entrega y salir de la aplicación mediante una interfaz visual.

La incorporación de `ControladorPedidos` permite compartir los pedidos entre las distintas ventanas, mientras que la organización mediante paquetes separa la ejecución, el modelo y la interfaz gráfica.

De esta forma, SpeedFast evoluciona desde una aplicación ejecutada principalmente por consola hacia una aplicación con interfaz gráfica, manteniendo los conceptos de Programación Orientada a Objetos, concurrencia y sincronización desarrollados durante las semanas anteriores.

---

# 🔗 Repositorio

**GitHub**

https://github.com/sergiosandovalv/SpeedFast
