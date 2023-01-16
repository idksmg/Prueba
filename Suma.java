package org.example;

public class Suma {

    int num1;
    int num2;

    public Suma(){
         num1 = 0;
         num2 = 0;
    }

    public Suma(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public int getNum1(){
        return num1;
    }

    public int getNum2(){
        return num2;
    }

    public void setNum1(int num1){
        this.num1=num1;

    }

    public void setNum2(int num2){
        this.num2=num2;
    }

    public void suma(int num1, int num2){
        int resultado = num1 + num2;
        System.out.println("El resultado es: "+resultado);

    }

}
