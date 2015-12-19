# Chutlulu
Chutlulu es un programa que encripta mensajes para luego poder enviarlos
y desencriptarlos. No es una encriptación extremadamente compleja,
pero es muy difícil de descifrarla si contar con el programa, ya que cuenta
con un buen algoritmo.

Aqui está el listado de versiones con unas screenshots :

# Versión Android :

Versión básica, cuenta con el sistema de encriptación, un botón para borrar 
lo que has escrito(útil para no gastar tiempo en borrar mensajes largos),
y un easter egg MUY difícil de encontrar(PISTA : SETTINGS).

Cuenta también con una voz de loquendo que te va indicando
lo que haces, y al traducir un mensaje, copia el resultado al
portapapeles automáticamente.

![alt tag](https://raw.github.com/Bolito2/Chutlulu/master/imagenAndroid.png)


# Versión Java :

Esta versión no tiene voz de loquendo por ahora, ni el boton de borrar,
ya que en ordenador es mucho más fácil borrar un mensaje largo.

![alt tag](https://raw.github.com/Bolito2/Chutlulu/master/imagenJava.png)

# Algoritmo

e - letra encriptada;
x - letra sin encriptar;
p - posición de la letra en el mensaje;
l - longitud del mensaje;
d - letra desencriptada;
array - {C,H,U,T,L,U,L,U};

# Encriptación
# e = x + log(p^4) + (cos((p * l)*PI) * 3 + array * 69

# Desencriptación
# d = e - log(p^4) - (cos((p * l)*PI) * 3 - array * 69


# Descargas

[Versión Android](https://github.com/Bolito2/Chutlulu/blob/master/Android/app/chutlulu.apk?raw=true)

[Versión Java](https://github.com/Bolito2/Chutlulu/blob/master/Java/ChutluluPC.jar?raw=true)

Version C# en desarrollo
