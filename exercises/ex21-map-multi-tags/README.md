# ex21-map-multi-tags

## Enunciado

Extrae hashtags de una lista de posts.
Cada hashtag debe devolverse sin el prefijo `#`.

## Reglas
- Ignorar tokens que no sean hashtags válidos.
- Mantener orden de aparición.

## Ejemplos
- Entrada: `["hola #java #fp", "sin tags", "#clean"]` → Salida: `["java","fp","clean"]`
- Entrada: `["#", "##", "#ok"]` → Salida: `["ok"]`

## Qué practicar (FP)
- `mapMulti` (o equivalente) + filtrado declarativo.
