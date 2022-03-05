package com.company;

import java.util.Scanner;

class XYZ
{
    private double x;
    private double y;
    public void Z()
    {
        if ((y+1)==0)
        {
            System.out.println("Деление на ноль");
        }
        else
        {
            System.out.println((x+y)/(y+1));
        }
    }
    XYZ(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        XYZ xyz = new XYZ(scanner.nextDouble(),scanner.nextDouble());
        xyz.Z();
    }
}
