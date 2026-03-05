# Functional Programming Practice in Java

> Curso práctico estilo Exercism con **27 ejercicios**, Gradle multi-módulo, pruebas unitarias, y teoría progresiva de programación funcional en Java 21.

![Java](https://img.shields.io/badge/Java-21-blue)
![Gradle](https://img.shields.io/badge/Gradle-Groovy%20DSL-02303A)
![Tests](https://img.shields.io/badge/Tests-JUnit%205-success)

## Tabla de contenido

- [Objetivo](#objetivo)
- [Ruta de aprendizaje](#ruta-de-aprendizaje)
- [Mini-curso de teoría FP](#mini-curso-de-teoría-fp)
- [Cómo ejecutar](#cómo-ejecutar)
- [Ejercicios](#ejercicios)
- [Referencias](#referencias)

## Objetivo

Practicar programación funcional idiomática en Java usando:

- Interfaces funcionales de `java.util.function`
- Streams y Collectors
- `Optional`
- Inmutabilidad y composición
- Paralelismo seguro con streams

> [!TIP]
> Este repo no “prohíbe” código imperativo de forma absoluta, pero el diseño de APIs y pruebas empuja a resolver con enfoque funcional.

## Ruta de aprendizaje

```mermaid
flowchart LR
  A[Fundamentos FP] --> B[Composición]
  B --> C[Streams + Collectors]
  C --> D[Optional + Inmutabilidad]
  D --> E[Paralelismo Seguro]
  E --> F[Mini motores funcionales]
```

- [ ] Fundamentos (`ex01` a `ex06`)
- [ ] Intermedio (`ex07` a `ex18`)
- [ ] Avanzado (`ex19` a `ex27`)

## Mini-curso de teoría FP

<details>
<summary><strong>1) ¿Qué es programación funcional en Java?</strong></summary>

En Java, FP significa modelar comportamiento como valores (funciones), minimizar estado mutable y usar composición.

$$
(f \circ g)(x) = f(g(x))
$$

Con Java: lambdas, method references, streams, `Optional`, `Collectors`, records inmutables.
</details>

<details>
<summary><strong>2) Interfaces funcionales clave</strong></summary>

| Interfaz | Firma | Uso típico |
|---|---|---|
| `Predicate<T>` | `T -> boolean` | filtros y validaciones |
| `Function<T,R>` | `T -> R` | transformación |
| `Consumer<T>` | `T -> void` | efectos de salida |
| `Supplier<T>` | `() -> T` | creación diferida |
| `UnaryOperator<T>` | `T -> T` | transformación homogénea |
| `BinaryOperator<T>` | `(T,T) -> T` | reducciones |
| `BiFunction<T,U,R>` | `(T,U) -> R` | combinación de dos entradas |

</details>

<details>
<summary><strong>3) Streams y Collectors</strong></summary>

Patrón típico: `fuente -> filter -> map -> collect`.

Buenas prácticas:
- lambdas sin estado compartido
- evitar efectos colaterales en `map/filter`
- preferir `collect`/`reduce` sobre mutación externa

</details>

<details>
<summary><strong>4) Optional y diseño de APIs</strong></summary>

`Optional` comunica ausencia de valor sin `null`.

- usar `map`, `flatMap`, `orElseGet`
- evitar `get()` sin comprobación

</details>

<details>
<summary><strong>5) Paralelismo funcional</strong></summary>

`parallelStream()` puede acelerar operaciones puras en colecciones grandes.

- Requiere operaciones asociativas y sin estado compartido.
- Si hay efectos colaterales, resultados pueden ser no deterministas.

</details>

## Cómo ejecutar

```bash
./gradlew test
```

Ejecutar solo un ejercicio:

```bash
./gradlew :ex01-even-sum:test
```

## Ejercicios

Los ejercicios están en [exercises/](exercises). Cada uno incluye:
- `README.md` con enunciado
- `src/main/java` con stubs y Javadoc
- `src/test/java` con pruebas

> [!NOTE]
> Todos los métodos en `src/main/java` están como TODO (`UnsupportedOperationException`) para que avances ejercicio por ejercicio guiado por tests.

| # | Ejercicio | Concepto FP principal |
|---|---|---|
| 01 | [ex01-even-sum](exercises/ex01-even-sum) | `Predicate` + `filter` + suma |
| 02 | [ex02-normalize-strings](exercises/ex02-normalize-strings) | `Function` + `map` |
| 03 | [ex03-word-frequency](exercises/ex03-word-frequency) | `groupingBy` + `counting` |
| 04 | [ex04-optional-default](exercises/ex04-optional-default) | `Optional` + `Supplier` |
| 05 | [ex05-comparator-chain](exercises/ex05-comparator-chain) | `Comparator.comparing` |
| 06 | [ex06-stable-deduplicate](exercises/ex06-stable-deduplicate) | `distinct` |
| 07 | [ex07-flatten-lists](exercises/ex07-flatten-lists) | `flatMap` |
| 08 | [ex08-partition-numbers](exercises/ex08-partition-numbers) | `partitioningBy` |
| 09 | [ex09-number-stats](exercises/ex09-number-stats) | `IntSummaryStatistics` |
| 10 | [ex10-find-first-match](exercises/ex10-find-first-match) | `findFirst` + `Optional` |
| 11 | [ex11-immutable-transform](exercises/ex11-immutable-transform) | transformación inmutable |
| 12 | [ex12-function-composition](exercises/ex12-function-composition) | `compose` / `andThen` |
| 13 | [ex13-predicate-composition](exercises/ex13-predicate-composition) | `Predicate.and/or/negate` |
| 14 | [ex14-group-by-initial](exercises/ex14-group-by-initial) | `groupingBy` |
| 15 | [ex15-top-n-scores](exercises/ex15-top-n-scores) | `sorted` + `limit` |
| 16 | [ex16-record-mapping](exercises/ex16-record-mapping) | records + `map` |
| 17 | [ex17-lines-pipeline](exercises/ex17-lines-pipeline) | pipeline declarativo |
| 18 | [ex18-parse-optional-int](exercises/ex18-parse-optional-int) | parse seguro con `Optional` |
| 19 | [ex19-custom-collector](exercises/ex19-custom-collector) | `Collector.of` |
| 20 | [ex20-teeing-summary](exercises/ex20-teeing-summary) | `Collectors.teeing` |
| 21 | [ex21-map-multi-tags](exercises/ex21-map-multi-tags) | `mapMulti` |
| 22 | [ex22-associative-reduce](exercises/ex22-associative-reduce) | `reduce` asociativo |
| 23 | [ex23-parallel-safe-sum](exercises/ex23-parallel-safe-sum) | `parallelStream` seguro |
| 24 | [ex24-grouping-concurrent](exercises/ex24-grouping-concurrent) | `groupingByConcurrent` |
| 25 | [ex25-sliding-window](exercises/ex25-sliding-window) | `IntStream.range` |
| 26 | [ex26-query-engine](exercises/ex26-query-engine) | `Predicate` + `Function` |
| 27 | [ex27-imperative-to-functional](exercises/ex27-imperative-to-functional) | refactor declarativo |

## Referencias

- Oracle `java.util.function`: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/package-summary.html
- Oracle Streams: https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/stream/package-summary.html
- JUnit 5: https://docs.junit.org/current/user-guide/
- Gradle Java Testing: https://docs.gradle.org/current/userguide/java_testing.html
