/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Java8;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author PC
 */
public class Lambda_streams {
    public static void main (String args []){
    List <String> lista1 =Arrays.asList(
                "Maputo",
                "Pemba",
                "Inhambane",
                "Tete",
                "Gaza");
        //podem ser impressas de três formas
        //for(String s: lista1)
          //  System.out.println(s);
        //lista1.forEach(x->System.out.println(x));
        lista1.forEach(System.out::println);
        
}
}