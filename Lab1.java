package com.mycompany.punisher11;

import java.util.Scanner;

/**
 *
 * @author Gcl
 */



class Box {
    private double height;
    private double width;
    private double length;
    private double volume;
    Box(double height ,double width , double length)
    {
        this.height = height;
        this.width = width;
        this.length = length ;
    }
    double calculate_volume()
    {
        volume = height * width * length ;
        return volume ;
    }   
}
public class Punisher11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] ar = new int [n];
        for(int i=0;i<n;++i)
        {
            ar[i]= sc.nextInt();
        }
        for(int i=0;i<n;++i)
        {
            System.out.println(ar[i]);
        }
    }
    
}
    
