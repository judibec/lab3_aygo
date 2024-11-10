# Lab 03 AYGO (UBER)
## Arquitectura
Se crea una maquina virtual EC2 en la cual se almacena la simulacion de una base de datos, donde tenemos el "repository" con datos quemados, permitiendonos agregar informacion y actualizar la existente.

Luego tenemos una lambda por cada metodo a usar, lo que hace esta lambda es apuntarle a la ec2 para obtener la informacion de cada entidad (Users, Rides, Drivers, Payments)

Por ultimo hay un ApiGateway que apunta a las lambdas con cada metodo Rest independiente, dandonos asi un link que podemos usar en el front, en el cual vemos al carrito moverse

![Diagrama_DemoUber drawio](https://github.com/user-attachments/assets/643c4366-a874-45e9-9512-bab877f828f2)

## Explicación
Para el despliegue se debe tener en cuenta instalar maven y git en la maquina `sudo yum install git` y `sudo yum install maven` este 2do comando instala por defecto una version de java para poder ejecutar el codigo, estos comandos son usados para linux

Luego de clonar el repositorio con `git clone <url del repo>` entramos a la carpeta root y ejecutamos el aplicativo con el comando de maven `mvn exec:java -D exec.mainClass="<ruta.de.la.clase.main>"` en este caso es `"org.example.Main"`

Dejamos corriendo el Spring, ahora en el apiGateway debemos configurar cada Recurso con su metodo respectivo, haciendo el ejemplo con el GET, tomamos el recurso `/users` y el metodo GET, lo enlazamos con la lambda, la cual empaqueta el .jar con un codigo basico que realiza peticiones http por medio de la interfaz RequestHandler

Podemos usar el link que nos da el apigateway para probar las lambdas colocandolo en el Browser que se desee

## Evidencias
Dejamos el Spring ejecutando

![image](https://github.com/user-attachments/assets/50c83a3f-231e-46ac-990b-3f7c97c98993)

Cada Lambda tiene la conexion con el ApiGateway

![image](https://github.com/user-attachments/assets/de2863b4-b4ca-45e0-aec8-20e397d16658)

El ApiGateway tiene todos los recursos y los metodos de cada crud

![image](https://github.com/user-attachments/assets/21bf4ade-788f-4830-bf1d-110ac42a8146)

vemos como obetenemos informacion de las recursos mediante el link que nos dio el apigateway, en mi caso fue este "https://q2wnv17uk2.execute-api.us-east-1.amazonaws.com/prueba"

![image](https://github.com/user-attachments/assets/f6868af1-e898-431c-953a-1d2540208e75)
![image](https://github.com/user-attachments/assets/ab70bcb9-57cf-4411-91e3-419b0068fa29)
![image](https://github.com/user-attachments/assets/ad4bef77-bfab-45cc-a445-a5a5781f9811)
![image](https://github.com/user-attachments/assets/f4fcf5b3-fc26-476f-83a5-8393e7033392)


## Video
[https://youtu.be/ptzJ5PEiKIU](https://youtu.be/a_epfsU-kWU)
