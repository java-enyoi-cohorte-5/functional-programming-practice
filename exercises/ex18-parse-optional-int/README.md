# ex18-parse-optional-int

## Enunciado

Parsea un string a entero positivo y retorna `Optional<Integer>`.

## Reglas
- Válido: números enteros positivos (`1`, `42`, ...)
- Inválido: `0`, negativos, texto no numérico o formatos no permitidos
- No propagar excepción al consumidor de la función

## Ejemplos
- Entrada: `"42"` → Salida: `Optional[42]`
- Entrada: `"-2"` → Salida: `Optional.empty`
- Entrada: `"abc"` → Salida: `Optional.empty`

## Qué practicar (FP)
- Parse funcional con `Optional`.
