# ex02-normalize-strings

## Enunciado

Recibe una lista de textos y normalízala aplicando este pipeline:
1. `trim` (quitar espacios externos)
2. `toLowerCase`
3. eliminar elementos vacíos/blancos

## Reglas
- Mantener el orden original de los elementos válidos.
- No modificar la colección de entrada.

## Ejemplos
- Entrada: `["  Hola ", "", " MUNDO "]` → Salida: `["hola", "mundo"]`
- Entrada: `[" B ", " a "]` → Salida: `["b", "a"]`

## Qué practicar (FP)
- `Function<String, String>` + `map` + `filter`.
