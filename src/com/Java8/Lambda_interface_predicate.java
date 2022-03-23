/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author PC
 */

public class Lambda_interface_predicate {
public static void filtro(List<String> lista, Predicate<String> condicao){
    for (String s: lista)
        if(condicao.test(s))
            System.out.println(s);
}
    public static void main (String args []){
     List <String> lista1 =Arrys.asList(
        "Maputo","Pemba","Inhambane",
        "Tete","Gaza","Manica");
        System.out.println("Estados que iniciam com a letra M");
        filtro(lista1, (s)->s.startsWith("M"));
        System.out.println("Estados que iniciam com a letra A");
        filtro(lista1, (s)->s.endsWith("a"));
        
        System.out.println("Toda a lista");
        filtro(lista1, (s)->true);
        
        System.out.println("Não imprimir a lista");
        filtro(lista1, (s)->false);
        
        System.out.println("Lista com mais de 4 caracteres");
        filtro(lista1, (s)->s.length()>4);
}
}
