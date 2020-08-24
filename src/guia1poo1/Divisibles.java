package guia1poo1;
import java.util.*;
public class Divisibles {
public static void main(String[] args){
Scanner reader = new Scanner(System.in);
String nombre = "";
int numero1, numero2;
System.out.print("Ingrese primer numero: ");
numero1=reader.nextInt();
System.out.print("Ingrese segundo numero: ");
numero2=reader.nextInt();
if (numero1 % numero2 == 0){
    System.out.println("El numero " + numero1 + " es divisible con " + numero2);
}
else
{
    System.out.println ("El numero " + numero1 + " no es divisible");
}
}
}



