# ex01-even-sum

## Enunciado

Implementa una función que reciba una lista de enteros y retorne la suma de **solo** los números pares.

## Reglas
- No mutar la lista de entrada.
- Si la lista está vacía o no hay pares, el resultado es `0`.

## Ejemplos
- Entrada: `[1, 2, 3, 4, 5, 6]` → Salida: `12`
- Entrada: `[1, 3, 5]` → Salida: `0`
- Entrada: `[-4, -3, 2, 7]` → Salida: `-2`

## Qué practicar (FP)
- `Predicate<Integer>` + `Stream.filter` + `sum/reduce`.
