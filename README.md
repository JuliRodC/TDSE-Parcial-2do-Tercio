# Parcial TDSE 2do Tercio

María Juliana Rodríguez Caicedo

Diseñe, construya y desplegue una aplicación web para investigar el problema matemático asignado. El programa debe estar desplegado en AWS. Las tecnologías usadas en la solución deben ser Maven, Git, GitHub, Spring, HTML5 y js.

Diseñe un prototipo de sistema de microservicios que tenga un servicio (En la figura se representa con el nombre Math Services) para computar las funciones numéricas.  El servicio de las funciones numéricas debe estar desplegado en al menos dos instancias virtuales de EC2. Adicionalmente, debe implementar un service proxy que reciba las solicitudes de llamado desde los clientes  y se las delegue a las dos instancias del servicio numérico usando un algoritmo de activo-pasivo. Si uno de los servicios está caido debe dirigirla al otro.  El proxy deberá estar desplegado en otra máquina EC2. Asegúrese de poder configurar las direcciones y puertos de las instancias del servicio en el proxy usando variables de entorno del sistema operativo.  Finalmente, construya un cliente Web mínimo con un formulario que reciba el valor y de manera asíncrona invoke el servicio en el PROXY. Puede hacer un formulario para cada una de las funciones. El cliente debe ser escrito en HTML y JS.



## Secuencia de Tribonacci
Sus servicios matemáticos deben incluir una función

Implementación requerida
Implemente la secuencia en forma iterativa usando la recurrencia, acumulando cada término desde 0 hasta n. No use funciones de librerías ni APIs que ya entreguen la secuencia.



## Estructura
![Capture1.png](Images%2FCapture1.png)
---


## Instancias

se crearon las instancias:
- math-service1
- math-service2
- proxy-parcial

![Capture3.png](Images%2FCapture3.png)

Y a cada una de ellas se le editaron las reglas de entrada, asi adicionando el tipo TCP, con puerto 8080 y 0.0.0.0/0

![Capture2.png](Images%2FCapture2.png)

Luego de eso empezamos con la instancia1 (math-service1)

La conectamos:
![Capture4.png](Images%2FCapture4.png)

Y luego usamos este comando:

sudo yum install java-17-amazon-corretto
![Capture5.png](Images%2FCapture5.png)

Verificamos la version y la instalacion
![Capture8.png](Images%2FCapture8.png)

Y repetimos con las demas instancias

Math-service2:
![Capture6.png](Images%2FCapture6.png)

Proxy-Parcial:
![Capture7.png](Images%2FCapture7.png)

![Capture9.png](Images%2FCapture9.png)