# ex13-predicate-composition

## Enunciado

Implementa una función que filtre una lista de enteros usando un `Predicate<Integer>` recibido por parámetro.

## Reglas
- Debe funcionar con predicados compuestos (`and`, `or`, `negate`).
- Mantener el orden de entrada.

## Ejemplos
- Regla: `n > 2 AND n % 2 == 0`, entrada `[1,2,3,4,5,6]` → salida `[4,6]`
- Regla: `NOT par`, entrada `[1,2,3,4]` → salida `[1,3]`

## Qué practicar (FP)
- `Predicate.and` / `or` / `negate` + `filter`.
