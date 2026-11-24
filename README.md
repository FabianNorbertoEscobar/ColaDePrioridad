# Cola de prioridad

Implementación didáctica de una cola de prioridad de capacidad fija, construida sobre un montículo binario mínimo. El proyecto sirve para practicar estructuras de datos, abstracción, herencia y pruebas unitarias en Java.

## ¿Qué es una cola de prioridad?

Es una estructura en la que cada elemento tiene una prioridad y se atiende según ella, en lugar de seguir necesariamente el orden de llegada. En esta implementación, los elementos son números enteros y el valor menor tiene mayor prioridad: al eliminar, siempre se obtiene el mínimo disponible.

## Tecnologías y herramientas

- **Java 8** (JavaSE-1.8).
- **JUnit 4** para las pruebas unitarias.
- **Eclipse IDE**: el proyecto incluye los metadatos `.project` y `.classpath` de Eclipse.
- No se utiliza una herramienta de construcción como Maven o Gradle.

## Funcionalidades

La clase `cola.ColaDePrioridad` ofrece:

| Método | Descripción |
| --- | --- |
| `insertar(int)` | Agrega un entero. Lanza `IllegalStateException` si la cola está llena. |
| `eliminar()` | Elimina y devuelve el elemento de menor valor. Lanza `IllegalStateException` si está vacía. |
| `pispear()` | Devuelve el elemento de menor valor sin eliminarlo. Lanza `IllegalStateException` si está vacía. |
| `estaVacia()` | Indica si no hay elementos. |
| `estaLlena()` | Indica si se alcanzó la capacidad máxima. |
| `getTamañoMaximo()` | Devuelve la capacidad configurada. |
| `getCantidadDeElementos()` | Devuelve la cantidad actual de elementos. |

La capacidad se establece al crear la cola y no cambia durante su vida útil.

## Estructura del proyecto

```text
src/
├── cola/
│   └── ColaDePrioridad.java
└── monticulo/
    ├── Monticulo.java
    └── MonticuloMinimo.java
test/
└── cola/
    └── ColaDePrioridadTest.java
```

- **`Monticulo`** define las operaciones y la organización común de un montículo binario almacenado en un arreglo.
- **`MonticuloMinimo`** especializa el montículo para mantener el menor valor en la raíz.
- **`ColaDePrioridad`** expone la interfaz de la cola y delega el almacenamiento y el ordenamiento al montículo.
- **`ColaDePrioridadTest`** verifica el estado inicial, inserción, eliminación, consulta del mínimo, orden de prioridad y errores por capacidad o cola vacía.

El arreglo del montículo usa índices desde `1`; para un nodo en la posición `i`, sus hijos están en `2 * i` y `2 * i + 1`.

## Ejemplo de uso

```java
import cola.ColaDePrioridad;

ColaDePrioridad cola = new ColaDePrioridad(5);
cola.insertar(5);
cola.insertar(2);
cola.insertar(4);

System.out.println(cola.pispear()); // 2; no se elimina
System.out.println(cola.eliminar()); // 2
System.out.println(cola.eliminar()); // 4
System.out.println(cola.eliminar()); // 5
```

`insertar`, `eliminar` y `pispear` señalan los estados inválidos mediante `IllegalStateException`; el ejemplo supone que las operaciones se realizan con espacio disponible y elementos en la cola, respectivamente.

## Complejidad

Un montículo binario permite consultar la raíz en **O(1)** y, con las operaciones habituales de flotar o hundir, insertar y eliminar en **O(log n)**. En esta implementación, `eliminar` hunde la nueva raíz, pero `insertar` también llama a `montar()`, que recorre el montículo completo. Por eso, la inserción tal como está escrita tiene costo **O(n)**, aunque la operación de flotación por sí sola sea **O(log n)**.

## Ejecutar las pruebas

En Eclipse:

1. Importa el directorio como **Existing Projects into Workspace**.
2. Verifica que el proyecto use un JDK compatible con Java 8 y tenga disponible la biblioteca **JUnit 4**.
3. Ejecuta `test/cola/ColaDePrioridadTest.java` con **Run As → JUnit Test**.

Las dependencias de JUnit no están incluidas como archivos en el repositorio; Eclipse las resuelve mediante la biblioteca JUnit configurada en `.classpath`.
