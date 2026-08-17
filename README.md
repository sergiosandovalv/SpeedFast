![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# 🧠 Evaluación – Desarrollo Orientado a Objetos II

## 👨‍💻 Autor del proyecto

**Nombre:** Sergio Sandoval Valenzuela

**Carrera:** Analista Programador

**Sede:** Santiago Online

---

# 📖 Introducción

Este repositorio contiene el desarrollo del proyecto **SpeedFast**, realizado para la asignatura **Desarrollo Orientado a Objetos II**.

El proyecto representa un sistema de asignación de repartidores para distintos tipos de pedidos, aplicando conceptos de Programación Orientada a Objetos mediante una estructura simple de clases.

---

# 🎯 Propósito del proyecto

El propósito del proyecto es aplicar los principales conceptos de Programación Orientada a Objetos mediante la creación de una clase base `Pedido` y diferentes tipos de pedidos que heredan su comportamiento.

El sistema permite demostrar el uso de herencia, sobrescritura, sobrecarga y polimorfismo durante la asignación de repartidores.

---

# 📘 Conceptos aplicados

- Encapsulamiento.
- Herencia.
- Polimorfismo.
- Constructores.
- Getters y Setters.
- Sobrescritura de métodos mediante `@Override`.
- Sobrecarga de métodos.
- Uso de `super()`.
- Documentación mediante Javadoc.
- Control de versiones mediante Git.
- Publicación del proyecto en GitHub.

---

# 🧱 Estructura del proyecto

```text
SpeedFast/
│
├── .gitignore
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
                       │
        ┌──────────────┼──────────────┐
        │              │              │
  PedidoComida   PedidoEncomienda  PedidoExpress
```

La clase `Pedido` contiene los atributos y comportamientos generales del sistema.

Las clases `PedidoComida`, `PedidoEncomienda` y `PedidoExpress` heredan de `Pedido` y sobrescriben el método `asignarRepartidor()` para implementar un comportamiento específico según el tipo de pedido.

---

# 🔄 Sobrescritura y sobrecarga

El proyecto utiliza **sobrescritura** mediante `@Override`, permitiendo que cada tipo de pedido implemente su propia lógica para asignar un repartidor.

También utiliza **sobrecarga** mediante dos versiones del método:

```java
asignarRepartidor();

asignarRepartidor(String nombreRepartidor);
```

De esta forma, el sistema puede realizar una asignación general o recibir directamente el nombre de un repartidor.

---

# 🔄 Polimorfismo

En la clase `Main` los objetos son declarados utilizando la clase base `Pedido`:

```java
Pedido pedido1 = new PedidoComida(...);
Pedido pedido2 = new PedidoEncomienda(...);
Pedido pedido3 = new PedidoExpress(...);
```

Cada objeto ejecuta el comportamiento correspondiente a su clase real al utilizar el método `asignarRepartidor()`, demostrando el uso de polimorfismo.

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
3. El sistema mostrará por consola la asignación de repartidores para cada tipo de pedido.
4. Se ejecutarán ejemplos utilizando sobrescritura, sobrecarga y polimorfismo.

---

# 📄 Funcionalidades implementadas

- Creación de diferentes tipos de pedidos.
- Encapsulamiento de atributos.
- Herencia desde la clase `Pedido`.
- Asignación de repartidores.
- Comportamiento específico según el tipo de pedido.
- Sobrescritura de métodos.
- Sobrecarga de métodos.
- Uso de polimorfismo.
- Salida de resultados por consola.
- Documentación mediante Javadoc.
- Control de versiones mediante Git y GitHub.

---

# ✅ Conclusión

El proyecto **SpeedFast** permite aplicar de forma práctica los principales conceptos de Programación Orientada a Objetos.

La implementación utiliza una clase base y diferentes subclases para representar los tipos de pedidos, aplicando herencia, polimorfismo, sobrescritura y sobrecarga de métodos.

El proyecto mantiene una estructura simple y organizada, permitiendo identificar claramente el comportamiento específico de cada tipo de pedido.

---

# 🔗 Repositorio

**GitHub**

https://github.com/sergiosandovalv/SpeedFast