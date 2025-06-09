## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
# Estructuras Lineales – Ejercicios

### Versión: 2.0.2  
**Mensaje de versión:** “Estructuras Lineales – Ejercicios”

---

## 🧾 Descripción de esta versión

Esta versión contiene la implementación de dos ejercicios clave para el manejo de estructuras lineales en Java:

### 🧪 Ejercicio 01: Validación de Signos (`SignValidator`)
Este ejercicio verifica si una cadena que contiene únicamente los caracteres `()`, `{}`, `[]` es válida en términos de apertura y cierre de signos. El método `isValid(String s)`:
- Utiliza una pila (`Stack`) para almacenar los signos de apertura.
- Comprueba que cada cierre tenga su par correspondiente y en el orden correcto.
- Devuelve `true` si todos los signos están balanceados correctamente, `false` en caso contrario.

### 🧪 Ejercicio 02: Ordenar un Stack (`StackSorter`)
Este ejercicio implementa un algoritmo para ordenar una pila (`Stack<Integer>`) sin usar estructuras externas (solo otra pila auxiliar es permitida). El método `sortStack(Stack<Integer> stack)`:
- Extrae los elementos uno a uno.
- Los inserta en orden dentro de una pila auxiliar.
- Finalmente, vuelve a colocar los elementos en la pila original ordenados de menor a mayor (el menor queda en el tope).

### 🎯 App.java
Esta clase principal ejecuta ambos ejercicios con casos de prueba simples para comprobar su correcto funcionamiento.

---

## 🗂️ Estructura del Proyecto

```
src/
├── App.java
├── Ejercicio_01_sign/
│   └── SignValidator.java
└── Ejercicio_02_sorting/
    └── StackSorter.java
```

---

## ▶️ Cómo compilar y ejecutar

### Desde la terminal:

```bash
cd src
javac App.java Ejercicio_01_sign/SignValidator.java Ejercicio_02_sorting/StackSorter.java
java App
```

### Desde Visual Studio Code:
1. Abre la carpeta `src/`.
2. Asegúrate de tener la extensión de Java instalada.
3. Haz clic derecho en `App.java` → `Run Java`.

---

## ✅ Resultado esperado

```
Validación de signos para '([]){}': true
Stack antes de ordenar: [5, 1, 4, 2]
Stack después de ordenar: [1, 2, 4, 5]
```
