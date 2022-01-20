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

public class Java_8_Lambda_intro {
    public static void main(String[]args){
        System.out.println("=== Início do teste===");
        
        //Implementação da classe anónima runnable
        Runnable r1 = new Runnable(){
           @Override
           public void run(){
            System.out.println("Estudando a expressão lambda 1.");
        }
        };
        Runnable r2;
        r2 =()//Lista de argumentos
            ->//indica a utilzação de expressão lambda
            System.out.println("Estudando a expressão lambda 2.");
        r1.run();
        r2.run();
  
        
      
        
}}
