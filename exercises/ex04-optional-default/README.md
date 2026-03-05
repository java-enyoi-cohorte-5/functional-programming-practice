# ex04-optional-default

## Enunciado

Recibe un `Optional<String>` y un `Supplier<String>` de respaldo.
Debes retornar:
- el valor contenido, si existe;
- el valor del `fallback`, si está vacío.

## Regla clave
- El fallback debe evaluarse **solo** cuando el `Optional` esté vacío.

## Ejemplos
- Entrada: `Optional.of("ok"), () -> "fallback"` → Salida: `"ok"`
- Entrada: `Optional.empty(), () -> "fallback"` → Salida: `"fallback"`

## Qué practicar (FP)
- `Optional` + `Supplier` + `orElseGet`.
