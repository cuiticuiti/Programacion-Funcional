# Tp programacion funcional-Nicolas Cuitiño

# Descripción
Este proyecto demuestra el uso de **Programación Funcional en Java** utilizando **Streams** y **Lambdas**.  
Se incluyen las clases: `Alumno`, `Producto`, `Libro` y `Empleado`.

Cada bloque del `Main` realiza operaciones funcionales como:
- `filter()` → Filtra elementos por una condición  
- `map()` → Transforma datos  
- `sorted()` → Ordena elementos  
- `collect()` → Recolecta los resultados  
- `forEach()` → Muestra resultados por consola  

---

## ⚙️ Ejecución

### Desde IntelliJ IDEA
1. Abrir el proyecto Maven.
2. Abrir la clase `Main` en `src/main/java/org/example/Main.java`.
3. Ejecutar con el botón **Run ▶️**.

### Desde terminal
En la raíz del proyecto (donde está `pom.xml`):

```bash
mvn compile
mvn exec:java
