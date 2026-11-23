# Backend-Parcial

Necesitas Java 21, Maven, Git y Docker Desktop.

## Ejecutar

1. Abre Docker Desktop y espera a que termine de iniciar.
2. Abre una terminal y descarga el proyecto:

   ```bash
   git clone https://github.com/SebastianNeme/Backend-Parcial.git
   cd Backend-Parcial
   ```

3. Inicia MySQL:

   ```bash
   docker compose up -d --wait
   ```

4. Inicia el backend y deja esa terminal abierta:

   ```bash
   mvn spring-boot:run
   ```

## Probar

1. Abre http://localhost:8080/bibliotecas en el navegador. Deben aparecer las bibliotecas con sus libros.
2. Para registrar una biblioteca desde Postman, selecciona POST y usa esa misma dirección.
3. En Body selecciona raw, elige JSON y escribe:

   ```json
   {
     "nombre": "Biblioteca Sur",
     "direccion": "Calle 20",
     "ciudad": "Bogotá"
   }
   ```

4. Pulsa Send. La respuesta debe tener estado 201 y los datos de la biblioteca creada.
5. Abre de nuevo http://localhost:8080/bibliotecas y busca el nombre que registraste.

La primera vez se guardan las bibliotecas y los libros de ejemplo. Los datos quedan en MySQL y se conservan al reiniciar.

Para detener el backend, pulsa Ctrl + C en su terminal.
