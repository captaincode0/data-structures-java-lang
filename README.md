#Estructuras de datos en Java

![main banner](https://raw.githubusercontent.com/captaincode0/data-structures-java-lang/master/src/assets/banner-ds-repo.jpg)

Este repositorio tiene la finalidad de mostrar mi proceso de reaprendizaje de estructuras de datos en general, ya que considero que son de gran utilidad para cualquier lenguaje de programación; por ejemplo que sería LISP sin las listas, mapas, vectores, no se podrían usar las mayorías de las funciones propias del lenguaje, tampoco se podría implementar para la realización de algoritmos de Inteligencia Artificial, ya que las estructuras anteriormente mencionadas son de gran utilidad para la persistencia, reducción y mapeo de los datos.

Las estructuras de datos tratadas en este repositorio son de memoria dinámica, lo que implica que pueden crecer en tiempo de ejecución sin dejar lagunas de memoria, tal como pasa con los arreglos, vectores y otras estructuras tradicionales.

##Tipos de estructuras de datos

1. Listas enlazadas: Son un conjunto de nodos, conectados entre si, por lo tanto contiene un valor --de cualquier tipo de dato--, y una referencia en memoria.
2. Pilas: Este tipo de estructura es de clase LIFO --Last In, First Out (Último en Entrar, Primero en Salir) --en la cual al igual que las listas, pero solamente se puede obtener el último elemento agregado.
3. Colas: Es el caso inverso de las pilas, es una estructura de clase FIFO --First In, First Out (Primero en Entrar, Primero en Salir).
4. Árboles: Son un conjunto de nodos relacionados entre si, pero con múltiples punteros llamados hijos y un nodo llamado raiz.
5. Grafos: Son un conjunto de nodos relacionados entre si, al igual que los árboles pero cerrados, se pueden considerar las relaciones hijo-hijo, o cualquier enlace dentro del mismo.
6. Montículos: Al igual que los árboles, son estructuras que contiene un orden dentro de su composición.

##Listas enlazadas

Las listas enlazadas que trataré en este apartado serán:

    1. Simplemente enlazadas:
    2. Dobliemente enlazadas.
    3. circulares.

###Proceso para copiar objetos

El copiado de los objetos, fue uno de los principales problemas con los cuales me encontré, ya que los objetos preservan sus referencias al pasarse como argumentos, o al igualarse `node = this.headernode` (se pasa la referencia del objeto headernode), por lo tanto se ocupa de un mecanismo que se encarge de definir el proceso del copiado de objetos para cada tipo en el cual la interfaz Copyable sea implementada, --este proceso es demasiado util para copiar nodos.

```java
    package interfaces;
    
    public interface Copyable{
        public Copyable copy();
    }
    
    //en otra clase
    package mypackage;
    
    import interfaces.Copyable;
    
    class MyClass implements Copyable{
          private int x;
          private int y;
     
          public MyClass(){
     
          }
     
          public MyClass(int x, int y){
              this.x = x;
              this.y = y;
          }
     
          public void setX(int x){
               this.x = x;
          }
     
          public int getX(){
              return this.x;
          }
     
          public void setY(int y){
              this.y = y;
          }
     
          public int getY(){
               return this.y;
          }
     
          @Override
          public Copyable copy(){
               //initialize with the empty constructor
               MyClass tmpobject = new MyClass();
     
               //set all values of new object with the current object
               tmpobject.setX(tmpobject.getX());
               tmpobject.setY(tmpobject.getY());
     
               return tmpobject;
          }
      }
```

###Diseño y análisis



##Pilas

##Colas

##Árboles

##Grafos

##Montículos

##Aplicaciones de las estructuras de datos