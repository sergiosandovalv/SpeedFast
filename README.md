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

Durante las primeras cuatro semanas, el proyecto integra conceptos de herencia, polimorfismo, abstracción e interfaces para representar diferentes tipos de pedidos y sus capacidades.

Durante la **Semana 4**, el proyecto incorpora concurrencia para simular que varios repartidores realizan entregas durante el mismo período de tiempo.

Durante la **Semana 5**, el sistema incorpora sincronización para controlar el acceso concurrente a una zona de carga compartida. Los repartidores obtienen pedidos desde este recurso común de forma segura, evitando que un mismo pedido sea retirado por más de un repartidor.

Para ello se incorporan `ZonaDeCarga` y `EstadoPedido`, manteniendo el uso de `Runnable`, `Thread.sleep()` y `ExecutorService` para ejecutar concurrentemente las tareas de los repartidores.

---

# 🎯 Propósito del proyecto

El propósito del proyecto es aplicar conceptos de Programación Orientada a Objetos mediante una jerarquía basada en la clase abstracta `Pedido`.

El sistema permite representar diferentes tipos de pedidos, reutilizar sus características comunes y definir comportamientos específicos según el tipo de pedido.

Mediante las interfaces `Despachable`, `Cancelable` y `Rastreable`, se incorporan diferentes capacidades sin modificar la estructura principal de herencia.

Durante la Semana 4 se incorpora la ejecución concurrente de repartidores mediante `Runnable` y `ExecutorService`.

Durante la Semana 5 se incorpora una `ZonaDeCarga` compartida y sincronizada, permitiendo que varios repartidores retiren y procesen pedidos de forma concurrente sin duplicar su procesamiento.

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
- Espera de finalización mediante `awaitTermination()`.
- Recursos compartidos.
- Secciones críticas.
- Sincronización mediante `synchronized`.
- Control de versiones mediante Git.
- Publicación del proyecto en GitHub.

---

# 🧱 Estructura del proyecto

```text
SpeedFast/
│
├── .gitignore
├── README.md
└── src/
    ├── Cancelable.java
    ├── Despachable.java
    ├── EstadoPedido.java
    ├── Main.java
    ├── Pedido.java
    ├── PedidoComida.java
    ├── PedidoEncomienda.java
    ├── PedidoExpress.java
    ├── Rastreable.java
    ├── Repartidor.java
    └── ZonaDeCarga.java
```

---

# 📊 Diagrama de clases

El siguiente diagrama representa la estructura principal del sistema, mostrando la herencia desde la clase abstracta `Pedido`, las interfaces implementadas por las clases concretas y la relación entre `Repartidor` y la zona de carga compartida.

```text
                               Pedido
                            <<abstracta>>
                                 │
                 ┌───────────────┼────────────────┐
                 │               │                │
                 ▼               ▼                ▼
           PedidoComida   PedidoEncomienda   PedidoExpress
                 │               │                │
                 └───────────────┼────────────────┘
                                 │
                     implementan las interfaces
                                 │
                 ┌───────────────┼────────────────┐
                 │               │                │
                 ▼               ▼                ▼
           Despachable       Cancelable       Rastreable
          <<interface>>     <<interface>>     <<interface>>


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
                             │
                           run()
```

### 📌 Leyenda del diagrama

- **`Pedido`** es la clase abstracta que contiene los atributos y comportamientos comunes.
- **`PedidoComida`**, **`PedidoEncomienda`** y **`PedidoExpress`** son clases concretas que heredan de `Pedido`.
- **`Despachable`**, **`Cancelable`** y **`Rastreable`** representan capacidades de los pedidos.
- **`EstadoPedido`** define los estados `PENDIENTE`, `EN_REPARTO` y `ENTREGADO`.
- **`ZonaDeCarga`** contiene la lista compartida de pedidos y utiliza métodos `synchronized` para controlar el acceso concurrente.
- **`Repartidor`** implementa `Runnable` y comparte una referencia a `ZonaDeCarga`.
- Los repartidores retiran pedidos desde la misma zona de carga.

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

En `Main`, los objetos se declaran utilizando referencias de tipo `Pedido`:

```java
Pedido pedido1 = new PedidoComida(...);
Pedido pedido2 = new PedidoEncomienda(...);
Pedido pedido3 = new PedidoExpress(...);
```

Aunque las referencias son de tipo `Pedido`, cada objeto mantiene el comportamiento correspondiente a su clase real.

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

Las clases `PedidoComida`, `PedidoEncomienda` y `PedidoExpress` implementan estas interfaces y proporcionan su propio comportamiento.

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

Este concepto se mantiene durante la Semana 5, pero se modifica la forma en que los repartidores obtienen los pedidos.

---

# 🔒 Sincronización – Semana 5

Durante la Semana 5 se incorpora la clase `ZonaDeCarga` como recurso compartido entre los repartidores.

La clase mantiene una lista de pedidos:

```java
private List<Pedido> pedidos;
```

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

Se incorpora el enum:

```java
public enum EstadoPedido
```

con tres estados:

```text
PENDIENTE
EN_REPARTO
ENTREGADO
```

Todos los pedidos comienzan en:

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

Esto permite representar el avance del pedido durante la simulación concurrente.

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

En `Main` se crea un pool de tres hilos:

```java
ExecutorService executor = Executors.newFixedThreadPool(3);
```

Se envían los tres repartidores al executor:

```java
executor.submit(repartidorDaniel);
executor.submit(repartidorNicole);
executor.submit(repartidorJaime);
```

Después de enviar las tareas se solicita el cierre:

```java
executor.shutdown();
```

Finalmente, el programa espera que las tareas terminen mediante:

```java
executor.awaitTermination(30, TimeUnit.SECONDS);
```

De esta forma, el mensaje final se muestra después de que los repartidores hayan completado sus entregas.

---

# 🚚 Repartidores y zona de carga

La simulación utiliza tres repartidores:

```text
Daniel
Nicole
Jaime
```

Los tres reciben la **misma instancia de `ZonaDeCarga`**.

Antes de iniciar las tareas se agregan seis pedidos al recurso compartido:

```text
Pedido #1
Pedido #2
Pedido #3
Pedido #4
Pedido #5
Pedido #6
```

Los pedidos **no están asignados previamente a un repartidor específico**.

Cada repartidor solicita el siguiente pedido disponible a `ZonaDeCarga`. Por este motivo, la distribución de pedidos entre Daniel, Nicole y Jaime puede cambiar entre ejecuciones.

---

# 💻 Tecnologías utilizadas

- Java JDK 26.
- IntelliJ IDEA.
- Git.
- GitHub.
- Markdown.

---

# 🚀 Ejecución

1. Abrir el proyecto `SpeedFast` en IntelliJ IDEA.
2. Ejecutar la clase `Main.java`.
3. El sistema crea seis pedidos.
4. Los pedidos comienzan con estado `PENDIENTE`.
5. Se crea una instancia compartida de `ZonaDeCarga`.
6. Los seis pedidos son agregados a la zona de carga.
7. Se crean tres repartidores.
8. Los tres repartidores comparten la misma zona de carga.
9. Los repartidores son enviados al `ExecutorService`.
10. Cada repartidor retira pedidos de forma sincronizada.
11. Los pedidos cambian a `EN_REPARTO`.
12. Se simula el tiempo de entrega mediante `Thread.sleep()`.
13. Los pedidos cambian a `ENTREGADO`.
14. El programa espera hasta que todos los repartidores finalicen.

---

# 🖥️ Ejemplo de salida

```text
========================================
          SISTEMA SPEEDFAST
========================================

      ZONA DE CARGA COMPARTIDA
----------------------------------------
Pedido #1 agregado a la zona de carga.
Pedido #2 agregado a la zona de carga.
Pedido #3 agregado a la zona de carga.
Pedido #4 agregado a la zona de carga.
Pedido #5 agregado a la zona de carga.
Pedido #6 agregado a la zona de carga.

========================================
        ENTREGAS CONCURRENTES
========================================

[Repartidor - Daniel] inicia sus entregas.
[Repartidor - Nicole] inicia sus entregas.
[Repartidor - Jaime] inicia sus entregas.

[Repartidor - Daniel] Retirando pedido #1
[Repartidor - Daniel] Estado: EN_REPARTO
[Repartidor - Nicole] Retirando pedido #2
[Repartidor - Nicole] Estado: EN_REPARTO
[Repartidor - Jaime] Retirando pedido #3
[Repartidor - Jaime] Estado: EN_REPARTO

...

[Repartidor - Daniel] Pedido #4 entregado.
[Repartidor - Daniel] Estado: ENTREGADO
[Repartidor - Nicole] Pedido #5 entregado.
[Repartidor - Nicole] Estado: ENTREGADO
[Repartidor - Jaime] Pedido #6 entregado.
[Repartidor - Jaime] Estado: ENTREGADO

========================================
Todos los pedidos han sido entregados correctamente
========================================
```

> El orden de los repartidores y la distribución de los pedidos puede cambiar entre ejecuciones debido al procesamiento concurrente.

---

# 📄 Funcionalidades implementadas

- Clase abstracta `Pedido`.
- Creación de pedidos de comida, encomienda y express.
- Encapsulamiento de atributos comunes.
- Herencia desde la clase `Pedido`.
- Método concreto `mostrarResumen()`.
- Método abstracto `calcularTiempoEntrega()`.
- Cálculo de tiempos según el tipo de pedido.
- Sobrecarga de `asignarRepartidor()`.
- Sobrescritura mediante `@Override`.
- Asignación automática de repartidor.
- Asignación manual de repartidor.
- Polimorfismo mediante referencias de tipo `Pedido`.
- Interfaz `Despachable`.
- Interfaz `Cancelable`.
- Interfaz `Rastreable`.
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
- Espera de finalización mediante `awaitTermination()`.
- Tres repartidores compartiendo la misma zona de carga.
- Seis pedidos procesados concurrentemente.
- Reutilización de código.
- Salida ordenada y comprensible por consola.
- Documentación mediante Javadoc.
- Control de versiones mediante Git y GitHub.

---

# 📈 Reutilización y mantenibilidad

La clase abstracta `Pedido` centraliza los atributos y comportamientos comunes, evitando repetir código en las subclases.

Cada subclase contiene las reglas específicas correspondientes a su tipo de pedido.

Las interfaces permiten separar capacidades como despacho, cancelación y rastreo de la jerarquía principal.

La clase `Repartidor` representa la tarea concurrente mediante `Runnable`, mientras que `ExecutorService` administra su ejecución.

Durante la Semana 5, `ZonaDeCarga` separa la administración del recurso compartido de la lógica del repartidor.

La sincronización se concentra en las operaciones que acceden a la lista compartida, manteniendo separadas las responsabilidades de las clases.

De esta manera, el proyecto conserva la estructura desarrollada durante las semanas anteriores e incorpora sincronización sin reemplazar el modelo existente.

---

# ✅ Conclusión

El proyecto **SpeedFast** integra los conceptos trabajados durante las primeras cinco semanas de Programación Orientado a Objetos II.

La clase abstracta `Pedido` permite centralizar información y comportamientos comunes, mientras que `PedidoComida`, `PedidoEncomienda` y `PedidoExpress` especializan sus reglas mediante herencia, sobrecarga, sobrescritura y polimorfismo.

Las interfaces `Despachable`, `Cancelable` y `Rastreable` permiten representar diferentes capacidades de los pedidos y mantener organizada la estructura del sistema.

Durante la Semana 4 se incorpora concurrencia mediante la clase `Repartidor`, que implementa `Runnable`, junto con `ExecutorService` para administrar las tareas.

Durante la Semana 5 se incorpora `ZonaDeCarga` como recurso compartido, junto con métodos `synchronized` para controlar el acceso de los repartidores a los pedidos.

También se incorpora `EstadoPedido`, permitiendo representar el cambio de cada pedido desde `PENDIENTE` a `EN_REPARTO` y finalmente a `ENTREGADO`.

De esta forma, varios repartidores pueden procesar pedidos concurrentemente manteniendo un acceso controlado al recurso compartido y evitando retiros duplicados.

---

# 🔗 Repositorio

**GitHub**

https://github.com/sergiosandovalv/SpeedFast
