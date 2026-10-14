object Clase5 {
/*
 * retorna el doble del entero si existe
 */
def duplicar(valor: Option[Int]): Option[Int] = ???

/*
 * retorna el largo de una cadena si existe
 */
def largo(texto: Option[String]): Option[Int] = ???

/*
 * retorna el entero incrementado en uno si existe
 */
def incrementar(valor: Option[Int]): Option[Int] = ???

/*
 * retorna la cadena convertida a mayúsculas si existe
 */
def mayusculas(texto: Option[String]): Option[String] = ???

/*
 * retorna el cuadrado del entero si existe
 */
def cuadrado(valor: Option[Int]): Option[Int] = ???

/*
 * retorna el entero solo si es positivo
 */
def positivo(valor: Option[Int]): Option[Int] = ???

/*
 * retorna el primer carácter de una cadena si existe y no está vacía
 */
def primerCaracter(texto: Option[String]): Option[Char] = ???

/*
 * retorna el resultado de dividir dos enteros si ambos existen y
 * el divisor es distinto de cero
 */
def dividir(dividendo: Option[Int], divisor: Option[Int]): Option[Double] = ???

/*
 * retorna la suma de dos enteros si ambos existen
 */
def sumar(a: Option[Int], b: Option[Int]): Option[Int] = ???

/*
 * retorna el nombre de un usuario si existe su identificador
 * y el usuario está registrado
 */
def nombreUsuario(id: Option[Int]): Option[String] = ???

/*
 * retorna la edad de una persona si existe su nombre y la persona
 * está registrada
 */
def edadPersona(nombre: Option[String]): Option[Int] = ???

/*
 * retorna el precio de un producto si existe su identificador
 * y el producto está registrado
 */
def precioProducto(id: Option[Int]): Option[Double] = ???

/*
 * retorna el resultado de duplicar un entero y luego incrementarlo,
 * si el entero existe
 */
def duplicarEIncrementar(valor: Option[Int]): Option[Int] = ???

/*
 * retorna el nombre del usuario en mayúsculas si existe su identificador
 * y el usuario está registrado
 */
def nombreEnMayusculas(id: Option[Int]): Option[String] = ???

/*
 * retorna el promedio de dos notas si ambas existen
 */
def promedio(a: Option[Double], b: Option[Double]): Option[Double] = ???

/*
 * retorna la ciudad de una persona si existe su identificador,
 * la persona está registrada y tiene una ciudad asignada
 */
def ciudadPersona(id: Option[Int]): Option[String] = ???

/*
 * retorna el resultado de dividir dos enteros y luego duplicarlo,
 * si ambos existen y el divisor es distinto de cero
 */
def dividirYDuplicar(a: Option[Int], b: Option[Int]): Option[Double] = ???

/*
 * retorna la cantidad de caracteres del nombre de un usuario
 * si existe su identificador y el usuario está registrado
 */
def largoNombreUsuario(id: Option[Int]): Option[Int] = ???

/*
 * retorna el nombre del gerente de un departamento si existe
 * el identificador del departamento, el departamento está registrado
 * y tiene un gerente asignado
 */
def gerenteDepartamento(id: Option[Int]): Option[String] = ???

/*
 * retorna el precio final de un producto aplicando un descuento,
 * si existen el precio y el porcentaje de descuento
 */
def precioConDescuento(
    precio: Option[Double],
    descuento: Option[Double]
): Option[Double] = ???

/*
 * retorna el resultado de convertir una cadena a entero y luego
 * calcular su doble. Si la cadena no representa un entero válido,
 * retorna None
 */
def dobleDesdeTexto(texto: String): Option[Int] = ???

/*
 * retorna la edad de una persona a partir de su identificador,
 * solo si la persona existe y es mayor de edad
 */
def edadMayorDeEdad(id: Int): Option[Int] = ???

/*
 * retorna el nombre del gerente de un departamento a partir
 * del identificador de un empleado, si el empleado existe,
 * pertenece a un departamento y el departamento tiene gerente
 */
def gerenteDeEmpleado(idEmpleado: Int): Option[String] = ???

/*
 * retorna el resultado de dividir dos cadenas que representan
 * números. Si alguna conversión falla o el divisor es cero,
 * retorna None
 */
def dividirTextos(a: String, b: String): Option[Double] = ???

/*
 * retorna el nombre del país de una persona a partir de su
 * identificador, si la persona existe, tiene una dirección
 * registrada y la dirección tiene un país asignado
 */
def paisPersona(id: Int): Option[String] = ???

}
