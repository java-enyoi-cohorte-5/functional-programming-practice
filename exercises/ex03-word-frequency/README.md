# ex03-word-frequency

## Enunciado

Implementa una función que reciba una frase y retorne un mapa `palabra -> frecuencia`.
La comparación debe ser **case-insensitive**.

## Reglas
- Considera que las palabras están separadas por espacios.
- Convierte palabras a minúscula antes de contar.
- Para entrada vacía, devuelve mapa vacío.

## Ejemplos
- Entrada: `"Java java FP fp fp"` → Salida: `{java=2, fp=3}`
- Entrada: `"uno uno dos"` → Salida: `{uno=2, dos=1}`
- Entrada: `""` → Salida: `{}`

## Qué practicar (FP)
- `groupingBy` + `counting`.
