# CrudHuesped

Aplicación Java para gestionar huéspedes mediante operaciones CRUD (Crear, Leer, Actualizar y Eliminar).  
El proyecto está desarrollado en **Eclipse** y utiliza **MySQL** como base de datos.

---

## 📌 Características del proyecto

- Registro de huéspedes  
- Consulta de huéspedes  
- Actualización de datos  
- Eliminación de registros  
- Conexión a MySQL utilizando **MySQL Connector/J**  
- Organización en paquetes y clases Java

---

## 🧱 Estructura del proyecto

CrudHuesped/
│
├── src/
│ └── crud/
│ ├── Huesped.java # Clase modelo
│ ├── PantallaHuesped.java # Lógica / GUI
│ ├── Conexion.java # Clase recomendada para conexión MySQL
│ └── ... otras clases
│
├── Referenced Libraries/
│ └── mysql-connector-j-9.0.0.jar # Driver JDBC de MySQL
│
