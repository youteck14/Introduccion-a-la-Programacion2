package com.company;
/*Por último, para el Switch, deberás crear la variable estacion, y
distintos case para las cuatro estaciones del año. Dependiendo del valor
de la variable estacion se deberá mandar un mensaje por consola informando
de la estación en la que está. También habrá que poner un default para
cuando el valor de la variable no sea una estación.*/
public class Ejercicio5 {
    public static void main(String[] args) {

        var estacion = "CARRO";

        switch(estacion){
            case "PRIMAVERA":
                System.out.println("Estamos en primavera");
                break;
            case "OTOÑO":
                System.out.println("Estamos en otoño");
                break;
            case "VERANO":
                System.out.println("Estamos en verano");
                break;
            case "INVIERNO":
                System.out.println("Estamos en invierno");
            default:
                System.out.println("Error,No es una estacion");
        }

    }
}
