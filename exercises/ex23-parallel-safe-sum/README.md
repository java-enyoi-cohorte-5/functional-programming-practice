# ex23-parallel-safe-sum

## Enunciado

Suma todos los enteros de una lista usando `parallelStream()` de forma segura y determinista.

## Reglas
- Evitar estado compartido mutable.
- Con entrada vacía, el resultado debe ser `0`.

## Ejemplos
- Entrada: `[1..10000]` → Salida: `50005000`
- Entrada: `[]` → Salida: `0`

## Qué practicar (FP)
- reducción paralela asociativa.
