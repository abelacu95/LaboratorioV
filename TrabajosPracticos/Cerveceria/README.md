# Cerveceria 🍺

_Sistema Productor/Consumidor_

### Consumidores
_Se necesitan 3 Consumidores para que el stock llegue a 0._


### Synchronized  

_Los metodos synchronized se utilizan para que 2 o mas 
threads no accedan al mismo tiempo al area de datos donde se esta trabajando.._

### Recurso Compartido 

_ Recurso compartido es el area donde se encuentran los datos o recursos a utilizar,
 el problema es que 2 o màs procesos no pueden acceder al recurso al mismo tiempo._

_Se denomina exclusión mutua al acceso concurrente de varios procesos a un dato 
o recurso compartido. En un determinado instante, únicamente uno de estos procesos 
será capaz de ejecutar la sección crítica del código, que es la sección donde se accede 
al recurso compartido o se modifica el mismo._


### 2 Formas de instanciar un Thread 

_- Si la clase declarada no tiene que ser subclase de otra superclase , se declara como subclase de Thread._
```
Ejemplo  :  class Productor extends Thread {...}
```

_- Si la clase declarada es una subclase de otra superclase , se declara la interface Runnable._
```
Ejemplo :  class Student extends Person implements Runnable {...}
```




