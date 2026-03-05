# ex10-find-first-match

## Enunciado

Recibe una lista de strings y un umbral (`threshold`).
Retorna el primer elemento cuya longitud sea mayor al umbral, dentro de un `Optional`.

## Reglas
- Respetar el orden de encounter.
- Si no hay coincidencias, retornar `Optional.empty()`.

## Ejemplos
- Entrada: `["a","abcd","abcdef"], 3` → Salida: `Optional["abcd"]`
- Entrada: `["a","bb"], 3` → Salida: `Optional.empty`

## Qué practicar (FP)
- `filter` + `findFirst` + `Optional`.
