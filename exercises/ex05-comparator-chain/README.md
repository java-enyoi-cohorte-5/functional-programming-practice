# ex05-comparator-chain

## Enunciado

Dada una lista de personas (`name`, `age`), retorna una nueva lista ordenada por:
1. edad ascendente
2. nombre ascendente (desempate)

## Reglas
- No mutar la lista original.

## Ejemplos
- Entrada: `[("Zoe",30), ("Ana",20), ("Bob",20)]`
- Salida: `[("Ana",20), ("Bob",20), ("Zoe",30)]`

## Qué practicar (FP)
- `Comparator.comparing` + `thenComparing` + `stream().sorted()`.
