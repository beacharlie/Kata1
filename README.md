# Conversión de String a CamelCase

Este código proporciona una implementación de un método que convierte una cadena de texto en formato `camelCase`. La conversión sigue las siguientes reglas:

- La primera palabra se mantiene tal cual (en minúsculas o mayúsculas según corresponda, siguiendo la convención de Upper Camel Case o Pascal Case).
- Las palabras posteriores tendrán la primera letra en mayúscula y el resto en minúscula.

## Descripción

El método `toCamelCase` recibe una cadena de texto que puede contener guiones (`-`) o guiones bajos (`_`) como separadores entre palabras. El método realiza las siguientes transformaciones:

- Convierte todos los caracteres en un solo formato sin separadores, donde cada palabra después de la primera tiene la primera letra en mayúscula.
- Si el texto está vacío o es nulo, retorna una cadena vacía.

### Ejemplos

- `"the-stealth-warrior"` se convierte en `"theStealthWarrior"`.
- `"The_Stealth_Warrior"` se convierte en `"TheStealthWarrior"`.
- `"The_Stealth-Warrior"` se convierte en `"TheStealthWarrior"`.

## Método

```java
public static String toCamelCase(String text);
