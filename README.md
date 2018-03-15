<h2>Aplicación con Animación </h2>
En este minijuego nosotros debemos pinchar en el monstruo hasta que la vida le llegue a cero, pero al monstruo no le gusta que le clickes asi que escapara cuando la vida del monstruo llegue a cero lo habras vencido y obtendras un punto. Y aparecera otro monstruo para que lo derrotes.

Mi aplicacion es bastante simple, consta de dos activitys (el menu principal y el contenedor) y dos fragments (el juego y la puntuacion)

![alt text](https://github.com/ChristianSantamaria/AppAnimation/blob/master/FotosReadme/Captura.PNG)
![alt text](https://github.com/ChristianSantamaria/AppAnimation/blob/master/FotosReadme/Captura2.PNG)

Cuando derrotamos a un monstruo la clase FragmentHome envia el valor al Main2Activity en el que la guarda en una clase que llame Data
hay desde cualquier fragment podra modificar o recoger el valor

![alt text](https://github.com/ChristianSantamaria/AppAnimation/blob/master/FotosReadme/Captura3.PNG)

![alt text](https://github.com/ChristianSantamaria/AppAnimation/blob/master/FotosReadme/Captura4.PNG)

Para el cambio entre fragments desde el Main2Activity utilizo el metodo addfragment que recibe el fragment que queremos mostrar y lo carga en el
contenedor FrameLayout

![alt text](https://github.com/ChristianSantamaria/AppAnimation/blob/master/FotosReadme/Captura5.PNG)

Y por ultimo en el juego, la imagen del monstruo es un listener, es decir, que al clickar entra en el evento. Aqui coloque un contador que empieza en 100 y se va restando uno a uno
y que elija una animacion aleatoria entre horizontal o vertical y se mueva. Al llegar la barra a cero manda el valor a datos de Main2Activity y se resetea el monstruo

![alt text](https://github.com/ChristianSantamaria/AppAnimation/blob/master/FotosReadme/Captura6.PNG)
