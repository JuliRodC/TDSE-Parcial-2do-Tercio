# Parcial TDSE 2do Tercio

María Juliana Rodríguez Caicedo


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

