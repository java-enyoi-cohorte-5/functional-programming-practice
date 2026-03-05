# ex08-partition-numbers

## Enunciado

Implementa una función que particione enteros en pares e impares y devuelva un mapa:
- `true` → pares
- `false` → impares

## Reglas
- Para entrada vacía, ambas listas deben existir y estar vacías.

## Ejemplos
- Entrada: `[1,2,3,4]` → Salida: `{true:[2,4], false:[1,3]}`
- Entrada: `[]` → Salida: `{true:[], false:[]}`

## Qué practicar (FP)
- `Collectors.partitioningBy` con predicado de paridad.
