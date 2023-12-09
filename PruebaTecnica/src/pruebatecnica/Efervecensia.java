package pruebatecnica;

public class Efervecensia {

    /*Dado un numero n para cada entero i en el rango de 1 a n inclusive 
    imprima un valor por linea de la siguiente manera.
    
    si i es multiplo de 3 y 5 imprima FizzBuzz
    si i es un multiplo de  3(pero no de 5) imprima Fizz
    si i es un multiplo de 5 (pero no de 3 )imprima Buzz
    si i no es un multiplo de 3 o5 imprima valor i
     */
    public static void fizzBuzz(int n) {
        //recorro rango de numeros
        for (int i = 1; i <= n; i++) {
            if (i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");
            }else if(i%3==0){
               System.out.println("Fizz"); 
            }else if(i%5==0){
                System.out.println("Buzz");
            }else 
            {
                System.out.println(i); 
            }
        }

    }
}
