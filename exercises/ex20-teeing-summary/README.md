# ex20-teeing-summary

## Enunciado

Calcula mínimo y máximo de una lista de enteros usando un collector con `teeing`.

## Resultado esperado
Retorna un `record MinMax(int min, int max)`.

## Ejemplos
- Entrada: `[5,2,9]` → Salida: `MinMax(2, 9)`
- Entrada: `[-7,-1,-9]` → Salida: `MinMax(-9, -1)`

## Qué practicar (FP)
- `Collectors.teeing`.
