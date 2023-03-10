<h1>Microservicio Marvel API</h1>

<h2>Descripción del proyecto</h2>
<p>El microservicio Marvel API proporciona información de los héroes de Marvel. Para ello, el microservicio
provee de una simple interfaz web en el que el usuario podrá elegir de qué heroe desea obtener la información más detallada del héroe en cuestión.</p>

<h2>Requisitos</h2>
<ul>
  <li>Java 17 o superior</li>
  <li>Spring Boot 3.0.4 o superior</li>
  <li>Maven 3.9.0 o superior</li>
</ul>

<h2>Instalación</h2>
<ol>
  <li>Clonar este repositorio. Code > Download ZIP. Descomprimir el fichero, ésta será la carpeta del proyecto.</li>
  <li>Configurar la conexión a la base de datos en 'application.properties'. Se puede utilizar el puerto que se prefiera modificando la variable 'server.port'.</li>
  <li>Acceder a la carpeta raíz del proyecto 'marvel-api-main' a través del terminal y ejecutar 'mvn clean package'. En caso de fallo conviene asegurarse de la versión de Maven instalada ejecutando 'mvn -version'.</li>
  <li>Ejecutar 'java -jar target/marvel-api-0.0.1-SNAPSHOT.jar'. En caso de fallo asegurarse de la versión del Java Development Kit instalado (deber ser 17 o superior). Ejecutar 'java -version'.</li>
</ol>

<h2>Configuración</h2>
<ul>
  <li>server.port=8080 puerto utilizado para las conexiones web del microservicio.</li>
  <li>spring.h2.console.enabled=true - habilita la consola del sistema gestor de base de datos H2 en http://localhost:8080/h2-console/</li>
  <li>spring.datasource.url=jdbc:h2:mem:marveldb - La base de datos es h2, se denomina 'marveldb' y está activa sólo mientras se ejecuta el microservicio.</li>
  <li>spring.datasource.username=marvel - Usuario para acceder a la base de datos.</li>
  <li>spring.datasource.password=marvel - Contraseña para acceder a la base de datos.</li>
  <li>spring.jpa.defer-datasource-initialization=true - Si es true, ejecuta las instrucciones del fichero 'data.sql' de la carpeta 'resources'.</li>
</ul>

<h2>Uso</h2>
<p>Una vez iniciado el microservicio se podrán hacer peticiones GET de los héroes por ID o por nombre del héroe. Para ello
se debe abrir un navegador y acceder a http://localhost:8080/heroes/. El puerto 8080 puede variar en función del puerto
que configuremos en la variable 'server.port'. En esta aplicación, se puede seleccionar el ID o el nombre del héroe que
se desee. La aplicación automáticamente mostrará la información relacionada con el héroe seleccionado en formato JSON.</p>

<h2>Endpoints</h2>
<p>A continuación se muestran los endpoints disponibles en este microservicio:</p>
<ul>
  <li>GET /heroes: Devuelve una lista de todos los héroes la base de datos</li>
  <li>GET /heroes/{id}: Devuelve información sobre un héroe específico dado su id.</li>
  <li>GET /heroes?nombre={nombre}: Devuelve información sobre un héroe específico dado su nombre</li>
</ul>

<h2>Pruebas</h2>
<p>Ejecutar 'mvn test' para ejecutar las pruebas unitarias.</p>
<ol>
  <li>Test 1: Test general de la aplicación. Comprueba que se crea el controlador de la aplicación.</li>
  <li>Test 2: Test que comprueba que la interfaz repositorio no es nula.</li>
  <li>Test 3: Test que comprueba que los métodos para obtener de la base de datos H2 por ID y por nombre concuerdan.</li>
</ol>

<h2>Contribución</h2>
<p>Si deseas contribuir a este proyecto, ¡serás bienvenido!</p>

