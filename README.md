# Backend-Parcial

Necesitas Java 21, Maven, Git y Docker Desktop.

## Ejecutar

1. Abre Docker Desktop y espera a que termine de iniciar.
2. Abre una terminal y descarga el proyecto:

  
   git clone https://github.com/SebastianNeme/Backend-Parcial.git
   cd Backend-Parcial
   

3. Inicia MySQL:

   
   docker compose up -d --wait
   

4. Inicia el backend y deja esa terminal abierta:

   
   mvn spring-boot:run


5. Las bibliotecas y sus libros se pueden consultar en http://localhost:8080/bibliotecas.

También se puede registrar una biblioteca por Postman con POST a esa misma dirección, enviando nombre, direccion y ciudad en JSON.

La primera vez se guardan las bibliotecas y los libros de ejemplo. Los datos quedan en MySQL y se conservan al reiniciar.

Para detener el backend, pulsa Ctrl + C en su terminal.
