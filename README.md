# Sistema de Administración de Citas

## Instalación y configuración

### Prerrequisitos:
- Java JDK 11 o superior
- IDE como IntelliJ IDEA o Eclipse
- Git para clonar el repositorio

### Instalación:
1. Clona el repositorio:
   ```bash
   git clone https://github.com/tuusuario/Sistema-Administracion-Citas.git

Uso del programa
Ejecuta el archivo FAT JAR con el siguiente comando:

bash
Copiar código
java -jar SistemaCitas.jar
Funcionalidades disponibles:

Alta de Doctores: Ingresa el nombre completo, especialidad e identificador único.
Alta de Pacientes: Registra el nombre completo y su identificador.
Crear Cita: Define fecha, hora y motivo de la cita.
Relacionar Cita: Relaciona la cita creada con un doctor y un paciente.
Acceso Controlado: Solo administradores con credenciales válidas podrán acceder.

Créditos
Este programa fue desarrollado por [Tu Nombre].

Licencia
Este proyecto está bajo la licencia MIT. Para más información, consulta el archivo LICENSE.

php
Copiar código

### 3. Requerimientos del programa:
- **Clases Java recomendadas**:
  1. `Doctor.java`: Manejar la información de los doctores.
  2. `Paciente.java`: Registrar la información de los pacientes.
  3. `Cita.java`: Gestionar las citas.
  4. `Administrador.java`: Controlar el acceso de usuarios con privilegios.
  5. `SistemaCitas.java`: Contendrá la lógica para crear, asociar y almacenar las citas.

- **Almacenamiento**:
  - Utiliza archivos CSV, JSON o XML para guardar los datos de doctores, pacientes y citas. Puedes usar bibliotecas como `Jackson` para JSON o `SimpleXML` para XML.

### 4. Creación del FAT JAR:
Configura el `pom.xml` de Maven para empaquetar un FAT JAR, asegurando que incluya todas las dependencias.

```xml
<build>
  <plugins>
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-assembly-plugin</artifactId>
      <configuration>
        <archive>
          <manifest>
            <mainClass>com.tuempresa.SistemaCitas</mainClass>
          </manifest>
        </archive>
        <descriptorRefs>
          <descriptorRef>jar-with-dependencies</descriptorRef>
        </descriptorRefs>
      </configuration>
    </plugin>
  </plugins>
</build>

### 5. Manejo de excepciones:
Asegúrate de que el programa maneje las excepciones correctamente usando bloques try-catch para evitar interrupciones.
