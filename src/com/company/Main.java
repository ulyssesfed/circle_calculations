package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double pi = Math.PI;
    double angle = GetInput("Enter an angle in f0r sectors and chords degrees: ");
    double radius = GetInput("radius of circle");
    double diameter = radius*2;
    double volume = (4/3)*(pi)*(radius*radius*radius);

    System.out.println("|circumference = " + circum(radius) + "| area = " + area(radius) + "| diameter = " + diameter + "| volume = " + volume + "|" + " arc length = " + arcLength(radius, angle)+ "| sector perimeter = " + SectorPerimeter(radius, angle) + "| sector area = " + SectorArea(radius, angle) + "| chord length = " + chordLength(radius, angle) + "| segment perimeter = " + segmentPerimeter(radius, angle) + "| segment area = " + segmentArea(radius, angle));

    }
    public static double GetInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextDouble();
    }
    public static double area (double radius){
        return Math.PI*(radius*radius);
    }
    
    public static double circum(double radius){
        return (2*Math.PI)*radius;
    }
    public static double arcLength(double radius, double angle){
        return (2*Math.PI)*radius*(angle/360);
    }
    public static double SectorPerimeter(double radius, double angle){
        return ((2*Math.PI)*radius*(angle/360)+2*radius);
    }
    public static double SectorArea(double radius, double angle){
        return ((Math.PI*radius*radius)*(angle/360));
    }
    public static double chordLength(double radius, double angle){
        return (2*radius)*Math.sin(angle/2);
    }
    public static double segmentPerimeter(double radius, double angle){
        return (2*Math.PI)*radius*(angle/360)+2*radius*Math.sin(angle/2);
    }
    public static double segmentArea(double radius, double angle){
        return (radius*radius)*(Math.PI*(angle/360)-1/2*Math.sin(angle));
    }
}
