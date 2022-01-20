/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Java8;

/**
 *
 * @author PC
 */
interface Num {
    double getValue();
}
interface ValorNumerico{
    boolean teste(int n);
}
interface ValorNumerico2{
    boolean teste(int n, int m);
}
public class Lambda_Interface_funcionais {
    public static void main(String args []){
              /*para trabalhar com funções lambda é necessario uma interface
        funcional
        pode ser utilizada como uma costante*/
        Num n;
        n = ()-> 333.11;
        System.out.println("1"+n.getValue());
        //utilização da classe math com a classe Math.random
        Num n2 = () -> Math.random() * 100;
        System.out.println("2"+n2.getValue());
        
        ValorNumerico isPar = (i) -> (i%2)==0;
        System.out.println("3"+isPar.teste(10));
        System.out.println("4"+isPar.teste(115));
        
        ValorNumerico2 isDiv =(x,y) -> (x%y)==0;
        System.out.println("5"+isDiv.teste(10,5));
        System.out.println("6"+isDiv.teste(10,3));
        
        //Para toda expressão lambda que tenha mais que uma instruçao deve
        //estar contida dentro de parénteses e ter o comando return no fim
        ValorNumerico2 expressao = (x,y) -> {
            int i =x+y;
            return i>10;
        };
        System.out.println(expressao.teste(5, 10));
        
    }
}
