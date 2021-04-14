# Data Structures and Algorithms Cheat Sheet 

El objetivo de este documento es condensar los aspectos más importantes de algoritmos y estructuras de datos, fundamentales para afrontar las entrevistas técnicas de desarrollador software.

# Índice
- [Estructuras de Datos](#estructuras)
  - [Array](#array)
  - [Linked List](#linkedlist)
  - [Hash Table o Hash Map](#hash)
  - [Árbol Binario](#binario)
- [Complejidad Computacional](#complejidad)
- [Algoritmos](#algoritmos)
  - [Fundamentos de los Algoritmos](#fundamentosalgoritmos)
  - [Algoritmos de Búsqueda](#busqueda)
    - [Búsqueda en Anchura](#anchura)
    - [Búsqueda en Profundidad](#profundidad)
  - [Algoritmos de Ordenación](#ordenacion)
    - [Burbuja](#bubble)
    - [Selección](#seleccion)
    - [Inserción](#insercion)
    - [Merge Sort](#merge)
    - [Quick Sort](#quick)
    - [Heap Sort](#heap)
    - [Bucket Sort](#bucket)
    - [Radix Sort](#radix)
    - [Counting Sort](#counting)


# <a id="complejidad"></a>Complejidad Computacional
### Definición:
Antes de entrar a analizar y comparar los algoritmos, debemos tener una manera de medir su rendimiento independientemente de la máquina o lenguaje en los que los ejecutemos/implementemos.
De esta necesidad surge la notación Big O (Og(x)), que nos sirve para representar la cantidad de recursos computacionales o temporales necesarios para resolver un problema. En resumen, **la notación Big O nos dirá cuánta memoria o tiempo necesita un algoritmo para resolver un problema dada una input.**

#### Complejidades
Los diferentes órdenes más habituales son los siguientes, ordenados de mejor a peor:
- Constante - ``O(1)`` El coste (temporal o espacial) es constante independientemente de la input.
- Logaritmico – ``O(log n)`` El coste crece de manera logaritmica con `n`.
- Lineal – ``O(n)`` El coste crece de manera lineal con `n`.
- Lineal logaritmica – ``O(n log n)`` El coste crece de manera más rápida que en el caso lineal `n`.
- Exponencial – `O(c^n)` El coste crece de manera exponencial con `n`.
- Factorial – `O(n!)` El coste crece de manera factorial, haciendo que sea casi imposible de ejecutar hasta para pequeños valores de `n`.

En esta gráfica podemos observar la diferencia entre los órdenes mencionados, relancionando la input con el número de pasos que nos llevará el problema:

![#](https://upload.wikimedia.org/wikipedia/commons/thumb/7/7e/Comparison_computational_complexity.svg/400px-Comparison_computational_complexity.svg.png)

[(source: Wikipedia, _Computational Complexity of Mathematical Operations_)](https://en.wikipedia.org/wiki/Computational_complexity_of_mathematical_operations)


#### Algunos apuntes importantes
- La notación Big O no implica que se esté analizando el peor escenario posible, sólo nos dice cómo será su rendimiento dado un escenario en particular, asegurándonos cómo se comportará según el valor de `n` (elementos) de la input vaya creciendo.
- Los escenarios más útiles para analizar con el **peor caso posible**, en el que la input será lo menos adecuada posible, y el **caso estándar** en el que la input será lo que nos encontraremos habitualmente.
- No se utiliza el mejor caso posible ya que no nos orienta hacia el rendimiento real del algoritmo.

# <a id="estructuras"></a>Estructuras de Datos
### <a id="array"></a> Array
#### Definición
- Almancena elementos de un sólo tipo (String, Object, int...) con la ayuda de un índice secuencial.
- Son una estructura fija, una vez creados podremos modificar su contenido, pero no su longitud.
- Un array es almacenado como un bloque contiguo en memoria, en el que cada elemento ocupa el mismo espacio.

#### Lo más importante
- Si conocemos el índice de un elemento del array, el tiempo para acceder a él será siempre ``O(1)``, independientemente de cuál sea el valor de ese índice.
- Si no conocemos el índice de un elemento del array, la complejidad de la operación que queramos hacer con ese elemento será de ``O(n)``.
- Existe un tipo especial de Arrays, los **Arrays Dinámicos**, que nos permiten variar su tamaño en tiempo de ejecución. Si se queda sin espacio para añadir elementos, copia su contenido a otro array dinámico más grande.
- Los arrays pueden tener más de una dimensión, permitiéndonos crear matrices.


### <a id="linkedlist"></a> Linked List

**TBD**

### <a id="hash"></a> Hash Table o Hash Map

**TBD**


### <a id="binario"></a> Árbol Binario

**TBD**


# <a id="algoritmos"></a> Algoritmos
## <a id="fundamentosalgoritmos"></a> Fundamentos de los Algoritmos

### Definición de Algoritmo
Un algoritmo es un conjunto de instrucciones o reglas definidas y no ambiguas, ordenadas y finitas, que permite solucionar un problema. Dados un estado inicial y una entrada de datos, obtendremos la salida o el resultado, que será la solución al problema.

### Algoritmos Iterativos
#### Definición
- Un algoritmo que se caracteriza por repetir una secuencia n veces.
- Usados habitualmente para recorrer un conjunto de datos.
- Pueden ser implementados recursivamente, lo que suele mejorar su comprensión y reducir el código necesario.

### Algoritmos Recursivos
#### Definición
- Un algoritmo que se llama a sí mismo en su definición.
- **Caso Base**: Estos algoritmos poseen un caso que rompe la recursividad y devuelve una respuesta.

### Algoritmos Estables
#### Definición
- Un algoritmo que mantiene el orden de aparición de los elementos repetidos.

### Algoritmos Inestables
#### Definición
- Un algoritmo que no mantiene el orden de aparición de los elementos repetidos.

### Algoritmos Estables
#### Definición
- Un algoritmo que mantiene el orden de aparición de los elementos repetidos.

#### Qué necesitas tener en cuenta
**Stack overflow**. Si este error aparece en tiempo de ejecución, es que han podido suceder dos cosas:
- No has alcanzado el caso base ya que **el problema es tan grande que no dispones de más memoria**, con lo cuál habría que buscar alguna alternativa.
- No has alcanzado el caso base ya que **tu algoritmo está mal definido**. Esto es fundamental y hay que tener muy claras las condiciones que rompen la recursividad, y saber si se cumplen en algún momento o estamos haciendo algo mal.


## <a id="#busqueda"></a>Algoritmos de Búsqueda

### <a id="anchura"></a>Búsqueda en Anchura

**TBD**

### <a id="profundidad"></a>Búsqueda en Profundidad

**TBD**

## <a id="#ordenacion"></a>Algoritmos de Ordenación

### <a id="bubble"></a>Burbuja

#### Definición y aspectos más importantes
- Este algoritmo recorre el array iterativamente de izquierda a derecha comparando elementos adyacentes e intercambiádolos de posición si el de la izquierda es mayor que el de la derecha.
- Divide el array de manera lógica en una parte desordenada y otra ordenada. En la parte ordenada se va colocando uno a uno el elemento mayor de la parte desordenada gracias a los intercambios de elementos de las iteraciones.
- La parte ordenada irá creciendo de derecha a izquierda, hasta acabar con el array completamente ordenado.
- No vuelve a iterar por la parte ordenada.
- Algoritmo In Situ.
- Estable (elementos del mismo valor mantendrán el orden de aparición).
- Su rendimiento degrada muy rápido con arrays grandes.

#### Complejidad Temporal
- Caso Estándar: `O(n^2)`
- Caso Peor: `O(n^2)`

#### Complejidad Espacial
- Caso Peor: `O(1)`

#### Ejemplo Gráfico
![#](https://upload.wikimedia.org/wikipedia/commons/c/c8/Bubble-sort-example-300px.gif)

[(source: Wikipedia, _Insertion Sort_)](https://en.wikipedia.org/wiki/Bubble_sort)

### <a id="#seleccion"></a>Selección

#### Definición y aspectos más importantes
- Este algoritmo recorre el array iterativamente de izquierda a derecha, comparando los elementos de la parte desordenada buscando el mayor de ellos, que será colocado en la parte ordenada una vez acabemos la iteración, intercambiándolo por el de la posición que va a ocupar.
- La parte ordenada irá creciendo de derecha a izquierda, hasta acabar con el array completamente ordenado.
- Sólo se realiza el intercambio cuando se ha recorrido toda la parte desordenada del array.
- Algoritmo In-place.
- No estable.
- No es eficiente para arrays grandes.

#### Complejidad Temporal
- Caso Estándar: `O(n^2)`
- Caso Peor: `O(n^2)`

#### Complejidad Espacial
- Worst Case: `O(1)`

#### Ejemplo Gráfico
![#](https://upload.wikimedia.org/wikipedia/commons/9/94/Selection-Sort-Animation.gif)

[(source: Wikipedia, _Selection Sort_)](https://en.wikipedia.org/wiki/Selection_sort)

### <a id="insercion"></a>Inserción

#### Definición y aspectos más importantes
- Este algoritmo recorre el array de izquierda a derecha, comparando los elementos de la parte desordenada con el elemento a ordenar de derecha a izquierda, y si son mayores que este, desplaza su posición en 1 hacia la derecha. Este proceso se repite hasta encontrar la posición correcta para el elemento.
- La parte ordenada irá creciendo de izquierda a derecha.
- No vuelve a iterar por la parte ordenada.
- Algoritmo In-place.
- Estable.
- No eficiente para arrays grandes, aunque puede ser **más rápido que otros algoritmos para arrays pequeños**.
- Más eficiente que burbuja ya que realiza menos intercambios.

#### Complejidad Temporal
- Caso Estándar: `O(n^2)`
- Caso Peor: `O(n^2)`

#### Complejidad Espacial
- Caso Peor: `O(1)`

#### Ejemplo Gráfico
![#](https://upload.wikimedia.org/wikipedia/commons/0/0f/Insertion-sort-example-300px.gif)

[(source: Wikipedia, _Insertion Sort_)](https://en.wikipedia.org/wiki/Insertion_sort)

### <a id="merge"></a>Merge Sort

#### Definición y aspectos más importantes
- Algoritmo basado en el paradigma divide y vencerás.
- Divide recursivamente el array a la mitad, creando dos arrays auxiliares, hasta que sean de un solo elemento, llegando al caso base.
- Cuando alcanzamos el caso base, se devuelven los resultados ordenados ascendiendo desde la izquierda a la derecha.
- Las llamadas recursivas van obtienendo los arrays ordenados, que van doblando su tamaño hasta que el array entero está ordenado.
- **NO** es un algoritmo In-place.
- Estable.

#### Complejidad Temporal
- Caso Estándar: `O(n log n)`
- Caso Peor: `O(n log n)`

#### Complejidad Espacial
- Caso Peor: `O(n)`

#### Ejemplo Gráfico
![#](https://upload.wikimedia.org/wikipedia/commons/thumb/e/e6/Merge_sort_algorithm_diagram.svg/400px-Merge_sort_algorithm_diagram.svg.png)

[(source: Wikipedia, _Merge Sort_)](https://en.wikipedia.org/wiki/Merge_sort)

### <a id="quick"></a>Quicksort

#### Definición y aspectos más importantes
- Algoritmo basado en el paradigma divide y vencerás.
- Divide el array en dos partes con la ayuda de un pivote, situando a la izquierda los valores menores que este y a la derecha los valores mayores que este.
- La selección más común para este pivote suele ser el primer elemento del array.
- Cuando termine de reordenar los elementos en torno al pivote, este se encontrará en su posición final.
- Repite este proceso para la parte derecha e izquierda del pivote, hasta que compare sólo dos elementos, lo que significa que el array estará ordenado.
- Cuando el lado izquierdo del pivote esté ordenado, se ordena el lado derecho.
- Algoritmo In-place.
- No estable.
- Aunque tenga la misma Big O (o algo peor) que otros algoritmos de ordenación de arrays, en la práctica es más rápida que otros algoritmos (como por ejemplo Merge Sort).
- Otra de sus ventajas es la complejidad espacial frente a Merge Sort.

#### Complejidad Temporal
- Caso Estándar: `O(n log n)`
- Caso Peor: `O(n^2)`

#### Complejidad Espacial
- Caso Peor: `O(log n)`

#### Visualization
![#](https://upload.wikimedia.org/wikipedia/commons/6/6a/Sorting_quicksort_anim.gif)

[(source: Wikipedia, _Quicksort_)](https://en.wikipedia.org/wiki/Quicksort)

### <a id="heap"></a>Heap Sort

**TBD**

### <a id="bucket"></a>Bucket Sort

**TBD**

### <a id="radix"></a>Radix Sort

**TBD**

### <a id="counting"></a>Counting Sort

**TBD**

