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

Durante la **Semana 2**, el proyecto evoluciona incorporando clases y métodos abstractos para representar distintos tipos de pedidos y calcular sus tiempos estimados de entrega.

---

# 🎯 Propósito del proyecto

El propósito del proyecto es aplicar conceptos de Programación Orientada a Objetos mediante una jerarquía basada en la clase abstracta `Pedido`.

El sistema permite representar diferentes tipos de pedidos, reutilizar sus características comunes y definir un comportamiento específico para calcular el tiempo estimado de entrega según el tipo de pedido y la distancia recorrida.

---

# 📘 Conceptos aplicados

- Encapsulamiento.
- Herencia.
- Clases abstractas.
- Métodos abstractos.
- Métodos concretos.
- Polimorfismo.
- Sobrescritura mediante `@Override`.
- Constructores.
- Getters y Setters.
- Uso de `super()`.
- Reutilización de código.
- Documentación mediante Javadoc.
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
    ├── Main.java
    ├── Pedido.java
    ├── PedidoComida.java
    ├── PedidoEncomienda.java
    └── PedidoExpress.java
```

---

# 🏗️ Estructura de herencia

```text
                    Pedido
                  (abstracta)
                       │
        ┌──────────────┼──────────────┐
        │              │              │
  PedidoComida   PedidoEncomienda  PedidoExpress
```

La clase abstracta `Pedido` contiene los atributos y comportamientos comunes de todos los pedidos:

- `idPedido`
- `direccionEntrega`
- `distanciaKm`

También implementa el método concreto `mostrarResumen()` y declara el método abstracto `calcularTiempoEntrega()`.

Las clases `PedidoComida`, `PedidoEncomienda` y `PedidoExpress` heredan de `Pedido` e implementan su propia lógica para calcular el tiempo estimado de entrega.

---

# 🧩 Abstracción

La clase `Pedido` se define como abstracta:

```java
public abstract class Pedido
```

Esto permite utilizarla como base de la jerarquía sin crear objetos `Pedido` directamente.

Además, define el siguiente método abstracto:

```java
public abstract int calcularTiempoEntrega();
```

Cada subclase debe implementar este método de acuerdo con sus propias reglas de cálculo.

---

# ⏱️ Cálculo de tiempos de entrega

Cada tipo de pedido implementa un comportamiento diferente:

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

# 🔄 Sobrescritura y polimorfismo

Las tres subclases sobrescriben mediante `@Override` el método:

```java
calcularTiempoEntrega()
```

Cada una implementa una lógica diferente manteniendo el mismo método definido por la clase abstracta.

En `Main`, los objetos se declaran utilizando referencias de tipo `Pedido`:

```java
Pedido pedido1 = new PedidoComida(...);
Pedido pedido2 = new PedidoEncomienda(...);
Pedido pedido3 = new PedidoExpress(...);
```

Al ejecutar:

```java
pedido1.calcularTiempoEntrega();
pedido2.calcularTiempoEntrega();
pedido3.calcularTiempoEntrega();
```

Java ejecuta automáticamente la implementación correspondiente al tipo real de cada objeto, demostrando el uso de polimorfismo.

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
3. El sistema mostrará el resumen de cada pedido.
4. Se calculará y mostrará el tiempo estimado de entrega según el tipo de pedido y su distancia.

---

# 🖥️ Ejemplo de salida

```text
PedidoComida #1
Direccion: Av. Italia 456
Distancia: 4.5 km
Tiempo estimado de entrega: 24 minutos

PedidoEncomienda #2
Direccion: Av. Independencia 123
Distancia: 6.0 km
Tiempo estimado de entrega: 29 minutos

PedidoExpress #3
Direccion: Av. Apoquindo 1500
Distancia: 7.0 km
Tiempo estimado de entrega: 15 minutos
```

---

# 📄 Funcionalidades implementadas

- Clase abstracta `Pedido`.
- Creación de diferentes tipos de pedidos.
- Encapsulamiento de atributos comunes.
- Herencia desde la clase `Pedido`.
- Método concreto `mostrarResumen()`.
- Método abstracto `calcularTiempoEntrega()`.
- Sobrescritura del cálculo según el tipo de pedido.
- Cálculo de tiempos utilizando la distancia de entrega.
- Manejo de distancias decimales.
- Uso de polimorfismo.
- Reutilización de código.
- Salida de resultados por consola.
- Documentación mediante Javadoc.
- Control de versiones mediante Git y GitHub.

---

# ✅ Conclusión

El proyecto **SpeedFast** permite aplicar de forma práctica el uso de clases abstractas dentro de una jerarquía de herencia.

La clase `Pedido` centraliza los atributos y comportamientos comunes, mientras que `PedidoComida`, `PedidoEncomienda` y `PedidoExpress` implementan sus propias reglas para calcular los tiempos estimados de entrega.

Esta estructura permite reutilizar código, mantener responsabilidades claras y aplicar abstracción, herencia, sobrescritura y polimorfismo de forma organizada.

---

# 🔗 Repositorio

**GitHub**

https://github.com/sergiosandovalv/SpeedFast
