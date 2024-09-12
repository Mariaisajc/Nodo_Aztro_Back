import models.Dividir;
import models.Multiplicar;
import models.Restar;
import models.Sumar;

public class main {

        public static void main(String[] args) {

            // creamos los objetos de las clases Sumar, Restar, Multiplicar y Dividir

            Sumar sumar = new Sumar(9, 4);
            Restar restar = new Restar(9, 4);
            Multiplicar multiplicar = new Multiplicar(9, 4);
            Dividir dividir = new Dividir(9, 4);

            // imprimimos los resultados

            System.out.println("La suma de 9 + 4 es: " + sumar.operar());
            System.out.println("La resta de 9 - 4 es: " + restar.operar());
            System.out.println("La multiplicacion de 9 * 4 es: " + multiplicar.operar());
            System.out.println("La division de 9 / 4 es: " + dividir.operar());

        }}