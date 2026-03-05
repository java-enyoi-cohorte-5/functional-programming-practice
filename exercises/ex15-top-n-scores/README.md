# ex15-top-n-scores

## Enunciado

Recibe una lista de puntajes y un entero `n`.
Retorna los `n` valores más altos en orden descendente.

## Reglas
- Si `n` es mayor que el tamaño de la lista, retorna todos los elementos ordenados.
- No mutar la entrada.

## Ejemplos
- Entrada: `[5,20,1,9,20], n=3` → Salida: `[20,20,9]`
- Entrada: `[3,1], n=10` → Salida: `[3,1]`

## Qué practicar (FP)
- `sorted(reverseOrder)` + `limit`.
