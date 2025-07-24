# 📝 Gestor de Tareas en Consola - Java

Este proyecto es un **gestor de tareas (To-Do List) ejecutado desde consola**, desarrollado en Java como parte de un proceso de formación técnica.

> 📌 **Este proyecto forma parte de la etapa productiva del programa de formación del SENA**, realizado durante el proceso de entrenamiento en **CGI ISMC Colombia S.A.S.**.

---

## 🚀 Características

✅ Agregar tareas  
📋 Listar tareas  
✔️ Marcar tareas como completadas  
🗑️ Eliminar tareas  
💾 Guardar y cargar tareas desde archivo `.txt` automáticamente  

---

## 🧠 ¿Qué aprendí con este proyecto?

- Uso de clases, objetos y listas en Java  
- Lectura y escritura de archivos (`FileReader`, `FileWriter`)  
- Interacción con el usuario en consola (`Scanner`)  
- Buenas prácticas de programación orientada a objetos (POO)  

---

## 🛠️ Cómo ejecutar el proyecto

### 📌 Requisitos

- Tener instalado **Java JDK** (versión 8 o superior)
- Estar familiarizado con la consola de comandos

### ▶️ Pasos

1. Clona el repositorio o descarga el ZIP

```bash
git clone https://github.com/tu-usuario/java-console-todo-list.git
cd java-console-todo-list
```

2. Compila los archivos Java:

```bash
javac *.java
```

3. Ejecuta el programa:
   
```bash
javac *.java
```
---
## 🗂️ Estructura del proyecto

```bash
java-console-todo-list/
├── Main.java         # Clase principal con el menú
├── Task.java         # Clase que representa una tarea individual
├── TaskManager.java  # Lógica del gestor: agregar, borrar, guardar, etc.
└── tasks.txt         # Archivo generado automáticamente para guardar tareas
```

---

## 🧩 Ejemplo en ejecución

```bash
--- GESTOR DE TAREAS ---
1. Agregar tarea
2. Listar tareas
3. Marcar tarea como completada
4. Eliminar tarea
0. Salir
Elige una opción: 1
Descripción de la tarea: Terminar proyecto Java

Tarea agregada con éxito ✔
```

---

## 💡 Posibles mejoras futuras

- Usar archivos (`.json`) en lugar de (`.txt`)
- Añadir fecha límite o prioridad a cada tarea
- Crear una interfaz gráfica con JavaFX
- Convertirlo en una app web usando Spring Boot

---

## 📚 Créditos
Proyecto desarrollado por Deivison Ortega como práctica de Java desde consola.
Inspirado en la idea de mantener simples las cosas mientras se aprenden fundamentos.

---

## 📃 Licencia
Este proyecto está bajo la licencia MIT. ¡Úsalo, modifícalo y comparte como quieras!
