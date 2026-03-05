# ex26-query-engine

## Enunciado

Implementa un mini motor de consultas para strings:
1. filtrar con `Predicate<String>`
2. transformar con `Function<String, String>`
3. devolver resultado en el mismo orden

## Ejemplos
- Entrada: `values=["java","fp","stream"]`, filtro `len>3`, mapper `toUpperCase`
- Salida: `["JAVA","STREAM"]`

- Entrada: `values=["a","b"]`, filtro `len>3`, mapper `toUpperCase`
- Salida: `[]`

## Qué practicar (FP)
- composición de operaciones con `Predicate` + `Function` + `stream`.
