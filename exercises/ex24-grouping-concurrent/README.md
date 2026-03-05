# ex24-grouping-concurrent

## Enunciado

Cuenta cuántas palabras comienzan con cada letra inicial utilizando agrupación concurrente.

## Reglas
- La clave debe estar en minúscula.
- Retorna `ConcurrentMap<Character, Long>`.

## Ejemplos
- Entrada: `["apple","ant","banana"]` → Salida: `{a=2, b=1}`
- Entrada: `["Apple","Ant"]` → Salida: `{a=2}`

## Qué practicar (FP)
- `groupingByConcurrent` + normalización funcional.
