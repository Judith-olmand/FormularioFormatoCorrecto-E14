# Validación de Patrones con Expresiones Regulares (Ejercicio 14)

Este proyecto implementa una validación técnica avanzada que garantiza que los datos introducidos por el usuario (números de teléfono) sigan un formato numérico y una longitud específica mediante el uso de Regex.

## 🚀 Funcionalidades
* **Validación mediante Regex:** Utiliza el método `.matches("\\d{9}")` para asegurar que la entrada consista exactamente en 9 caracteres numéricos.
* **Control de Formato:** Impide el registro de números con longitud incorrecta o que contengan caracteres alfabéticos/especiales.
* **Feedback de Error Contextual:** En caso de fallo, una ventana de tipo `Alert` informa al usuario sobre el requisito exacto (9 dígitos), mejorando la usabilidad.
* **Organización en Rejilla:** Emplea un `GridPane` para mantener la etiqueta y el campo de texto perfectamente alineados.

## 🛠️ Estructura técnica
El código demuestra el manejo de lógica de strings aplicada a la interfaz de usuario:
* **`String.matches()`**: Método de Java que evalúa si una cadena coincide con una expresión regular.
* **Patrón `\\d{9}`**:
    * `\\d`: Representa cualquier dígito numérico (0-9).
    * `{9}`: Indica que el patrón anterior debe repetirse exactamente nueve veces.
* **Arquitectura de BorderPane**: Mantiene la coherencia visual con los ejercicios anteriores, situando el botón de acción principal en la zona de mayor flujo de interacción (esquina inferior derecha).
* **Limpieza de Resultados**: El programa garantiza que, si hay un error en el segundo intento, el texto de éxito anterior sea eliminado de la vista (`mostrarTexto.setText(null)`).