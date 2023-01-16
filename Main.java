
package org.example;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Suma suma = new Suma();
        System.out.println("Ingrese numero: ");
        int num1 = Integer.parseInt(in.nextLine());
        System.out.println("Ingrese numero: ");
        int num2 = Integer.parseInt(in.nextLine());
        suma.setNum1(num1);
        suma.setNum2(num2);
        suma.suma(num1,num2);
    }
}