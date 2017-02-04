/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17_4;

import java.util.Scanner;

/**
 *
 * @author ped90
 */
public class dni {
    public int dni;
    private char[]letra={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z'};
    private int[]numero={3,20,11,9,22,7,4,18,13,21,19,5,12,8,16,1,15,0,17,2,10,6,14};
    
    public void numero(){
        Scanner obx=new Scanner(System.in);
        System.out.println("Introduzca su numero de dni: ");
        dni=obx.nextInt();
    }
    public void asigletra(){
        int num=dni%23;
        for(int n=0;n<numero.length;n++){
            if(numero[n]==num){
                System.out.println("Su letra de dni es :" +letra[n]);
            }
            
        
        }   
    }
}

