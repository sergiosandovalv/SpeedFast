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

Durante las primeras tres semanas, el proyecto integra conceptos de herencia, polimorfismo, abstracción e interfaces para representar diferentes tipos de pedidos y sus capacidades.

Durante la **Semana 4**, el proyecto incorpora concurrencia para simular que varios repartidores realizan entregas durante el mismo período de tiempo.

Para ello se incorpora la clase `Repartidor`, que implementa la interfaz `Runnable`, junto con el uso de `Thread.sleep()` para simular tiempos de entrega y `ExecutorService` para administrar la ejecución concurrente de los repartidores.

---

# 🎯 Propósito del proyecto

El propósito del proyecto es aplicar conceptos de Programación Orientada a Objetos mediante una jerarquía basada en la clase abstracta `Pedido`.

El sistema permite representar diferentes tipos de pedidos, reutilizar sus características comunes y definir comportamientos específicos según el tipo de pedido.

Mediante las interfaces `Despachable`, `Cancelable` y `Rastreable`, se incorporan diferentes capacidades sin modificar la estructura principal de herencia.

Durante la Semana 4, el sistema también permite simular que varios repartidores procesan sus pedidos concurrentemente mediante tareas `Runnable` administradas por un `ExecutorService`.

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
    ├── Main.java
    ├── Pedido.java
    ├── PedidoComida.java
    ├── PedidoEncomienda.java
    ├── PedidoExpress.java
    ├── Rastreable.java
    └── Repartidor.java
```

---

# 📊 Diagrama de clases

El siguiente diagrama representa la estructura principal del sistema, mostrando la herencia desde la clase abstracta `Pedido`, las interfaces implementadas por las clases concretas y la incorporación de `Repartidor` como tarea concurrente.

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
                │               │                │
                ▼               ▼                ▼
          despachar()       cancelar()      verHistorial()


                         Repartidor
                             │
                    implements Runnable
                             │
                           run()
                             │
                     List<Pedido>
```

### 📌 Leyenda del diagrama

- **`Pedido`** es la clase abstracta que contiene los atributos y comportamientos comunes.
- **`PedidoComida`**, **`PedidoEncomienda`** y **`PedidoExpress`** son clases concretas que heredan de `Pedido`.
- **`Despachable`**, **`Cancelable`** y **`Rastreable`** son interfaces que representan capacidades del sistema.
- La relación entre `Pedido` y sus subclases corresponde a **herencia (`extends`)**.
- Las clases concretas implementan las interfaces mediante **`implements`**.
- `Despachable` define el método `despachar()`.
- `Cancelable` define el método `cancelar()`.
- `Rastreable` define el método `verHistorial()`.
- **`Repartidor`** representa una tarea de entrega.
- `Repartidor` implementa la interfaz `Runnable`.
- Cada repartidor contiene una lista de pedidos que procesa secuencialmente mediante `run()`.

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

Aunque las referencias son de tipo `Pedido`, cada objeto ejecuta el comportamiento correspondiente a su clase real.

Esto permite utilizar una estructura común y mantener comportamientos diferentes para cada tipo de pedido.

---

# 🔌 Interfaces

Durante la Semana 3 se incorporan tres interfaces.

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

Cuando se realizan acciones sobre un pedido, estas se registran en su historial.

Entre los eventos registrados se encuentran:

- Creación del pedido.
- Asignación de repartidor.
- Despacho del pedido.
- Cancelación del pedido.

Posteriormente, mediante el método:

```java
verHistorial()
```

es posible visualizar los eventos que realmente fueron realizados sobre cada pedido.

---

# 🧵 Concurrencia – Semana 4

Durante la Semana 4 se incorpora la clase `Repartidor` para representar una tarea de entrega.

La clase implementa la interfaz `Runnable`:

```java
public class Repartidor implements Runnable
```

Cada repartidor contiene:

- Un nombre.
- Una lista de pedidos asignados.

El método `run()` recorre secuencialmente los pedidos correspondientes al repartidor.

```java
@Override
public void run() {
    // Procesamiento de pedidos
}
```

Esto permite que cada repartidor mantenga el orden de sus propios pedidos mientras varios repartidores pueden avanzar concurrentemente.

---

# ⏳ Simulación de entregas

Para representar el tiempo requerido por cada entrega se utiliza:

```java
Thread.sleep(tiempoEspera);
```

El tiempo de espera se obtiene utilizando valores aleatorios.

Esto provoca pausas diferentes durante el procesamiento y permite observar cómo se intercalan las tareas de los distintos repartidores.

También se maneja `InterruptedException` para controlar una posible interrupción durante la pausa.

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

# 🚚 Repartidores y pedidos

La simulación utiliza tres repartidores con dos pedidos asignados a cada uno:

```text
Daniel
├── Pedido #1
└── Pedido #2

Nicole
├── Pedido #3
└── Pedido #4

Jaime
├── Pedido #5
└── Pedido #6
```

Cada repartidor procesa sus pedidos secuencialmente, mientras los tres repartidores son ejecutados mediante `ExecutorService`.

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
3. El sistema mostrará los diferentes tipos de pedidos.
4. Se calculará el tiempo estimado de entrega.
5. Se realizará la asignación automática o manual de repartidores.
6. Se ejecutarán operaciones de despacho o cancelación.
7. Se mostrará el historial de los pedidos.
8. Se crearán tres repartidores con dos pedidos asignados a cada uno.
9. Los repartidores serán enviados al `ExecutorService`.
10. Las entregas se ejecutarán concurrentemente.
11. El programa esperará hasta que todos los repartidores finalicen.

---

# 🖥️ Ejemplo de salida

```text
========================================
          SISTEMA SPEEDFAST
========================================

PEDIDO 1
----------------------------------------
PedidoComida #1
Direccion: Av. Italia 456
Distancia: 4.5 km
Tiempo estimado de entrega: 24 minutos
[Pedido Comida]
Asignando repartidor...
Verificando mochila termica... OK
Repartidor asignado automaticamente: Carlos Soto
Pedido de comida despachado correctamente.

PEDIDO 2
----------------------------------------
PedidoEncomienda #2
Direccion: Av. Independencia 123
Distancia: 6.0 km
Tiempo estimado de entrega: 29 minutos
[Pedido Encomienda]
Asignando repartidor...
Verificando peso y embalaje... OK
Pedido asignado a Daniela Tapia
Pedido de encomienda despachado correctamente.

PEDIDO 3
----------------------------------------
PedidoExpress #3
Direccion: Av. Apoquindo 1500
Distancia: 7.0 km
Tiempo estimado de entrega: 15 minutos
[Pedido Express]
Asignando repartidor...
Buscando repartidor mas cercano con disponibilidad inmediata... OK
Pedido asignado a Luis Diaz
Pedido express cancelado correctamente.

========================================
              HISTORIALES
========================================

Historial del PedidoComida #1:
- Pedido creado.
- Repartidor asignado automaticamente: Carlos Soto
- Pedido de comida despachado.

Historial del PedidoEncomienda #2:
- Pedido creado.
- Repartidor asignado: Daniela Tapia
- Pedido de encomienda despachado.

Historial del PedidoExpress #3:
- Pedido creado.
- Repartidor asignado: Luis Diaz
- Pedido express cancelado.

========================================
        ENTREGAS CONCURRENTES
========================================

Repartidor Daniel inicia sus entregas.
Repartidor Daniel procesando pedido #1
Repartidor Nicole inicia sus entregas.
Repartidor Jaime inicia sus entregas.
Repartidor Jaime procesando pedido #5
Repartidor Nicole procesando pedido #3
Repartidor Jaime completo el pedido #5
Repartidor Jaime procesando pedido #6
Repartidor Daniel completo el pedido #1
Repartidor Daniel procesando pedido #2
Repartidor Nicole completo el pedido #3
Repartidor Nicole procesando pedido #4
Repartidor Daniel completo el pedido #2
Repartidor Daniel termino sus entregas.
Repartidor Jaime completo el pedido #6
Repartidor Jaime termino sus entregas.
Repartidor Nicole completo el pedido #4
Repartidor Nicole termino sus entregas.

Todos los repartidores finalizaron sus entregas.
========================================
```

> El orden de los mensajes de los repartidores puede cambiar entre ejecuciones debido a la ejecución concurrente.

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
- Despacho de pedidos.
- Cancelación de pedidos.
- Registro de eventos mediante `ArrayList`.
- Visualización del historial.
- Clase `Repartidor`.
- Implementación de `Runnable`.
- Procesamiento secuencial de pedidos por repartidor.
- Simulación de entregas mediante `Thread.sleep()`.
- Uso de tiempos aleatorios.
- Manejo de `InterruptedException`.
- Ejecución concurrente de repartidores.
- Administración de tareas mediante `ExecutorService`.
- Pool de tres hilos mediante `newFixedThreadPool(3)`.
- Envío de tareas mediante `submit()`.
- Cierre del executor mediante `shutdown()`.
- Espera de finalización mediante `awaitTermination()`.
- Tres repartidores con dos pedidos cada uno.
- Reutilización de código.
- Salida ordenada y comprensible por consola.
- Documentación mediante Javadoc.
- Control de versiones mediante Git y GitHub.

---

# 📈 Reutilización y mantenibilidad

La clase abstracta `Pedido` centraliza los atributos y comportamientos comunes, evitando repetir código en las subclases.

Cada subclase contiene las reglas específicas correspondientes a su tipo de pedido.

Las interfaces permiten separar capacidades como despacho, cancelación y rastreo de la jerarquía principal.

Durante la Semana 4, la clase `Repartidor` permite separar la tarea de entrega de la administración de los hilos. `Repartidor` representa la tarea mediante `Runnable`, mientras que `ExecutorService` administra su ejecución.

De esta manera, el proyecto conserva la estructura desarrollada durante las semanas anteriores e incorpora la ejecución concurrente sin reemplazar el modelo existente.

---

# ✅ Conclusión

El proyecto **SpeedFast** integra los conceptos trabajados durante las primeras cuatro semanas de Programación Orientado a Objetos II.

La clase abstracta `Pedido` permite centralizar información y comportamientos comunes, mientras que `PedidoComida`, `PedidoEncomienda` y `PedidoExpress` especializan sus reglas mediante herencia, sobrecarga, sobrescritura y polimorfismo.

Las interfaces `Despachable`, `Cancelable` y `Rastreable` permiten representar diferentes capacidades de los pedidos y mantener organizada la estructura del sistema.

Durante la Semana 4 se incorpora concurrencia mediante la clase `Repartidor`, que implementa `Runnable` y procesa secuencialmente los pedidos asignados.

La utilización de `Thread.sleep()` permite simular tiempos de entrega, mientras que `ExecutorService` administra la ejecución concurrente de tres repartidores.

Finalmente, el programa espera la finalización de todas las tareas y muestra por consola el avance de las entregas, permitiendo observar el funcionamiento concurrente del sistema.

---

# 🔗 Repositorio

**GitHub**

https://github.com/sergiosandovalv/SpeedFast
