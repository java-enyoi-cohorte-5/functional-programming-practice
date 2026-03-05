# ex25-sliding-window

## Enunciado

Genera todas las sublistas consecutivas de tamaño `windowSize` sobre una lista de enteros.

## Reglas
- Si `windowSize` es mayor que el tamaño de la lista, retorna lista vacía.

## Ejemplos
- Entrada: `[1,2,3,4], windowSize=2` → Salida: `[[1,2],[2,3],[3,4]]`
- Entrada: `[1,2], windowSize=3` → Salida: `[]`

## Qué practicar (FP)
- `IntStream.range` + mapeo de índices a sublistas.
