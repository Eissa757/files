/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure1;

import java.util.Arrays;

/**
 *
 * @author Eissa
 */

public class DATASTRUCTURE1 {

    
    
        public static  void rev(int[] x)
        {
            int j=0;
            int[] z=new int[x.length];
            for (int i=x.length-1;i>=0;i--)
            {
                z[j]=x[i];
                System.out.println(z[j]);
                j++;
            }
        }
        
   
    public static void backup(int[] x)
        {
            int[] y= new int[x.length];
            
            for(int i=0;i<x.length;i++){
                y[i]=x[i];
                System.out.println(y[i]);
            }
        }
    
    public static void remove(int[] x,int index){
        for(int i=0;i<x.length;i++)
        {
            if(index<x.length)
            {
                x[index]=0;
               
            }
              
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[] x={1,2,3};
       // rev(x);
      //  backup(x);
        remove(x,1);
                        System.out.println(Arrays.toString(x));

    }
    
}