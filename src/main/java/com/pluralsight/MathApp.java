package com.pluralsight;

public class MathApp {
    public static void main(String[] args){
        //1. Create two variables to represent the salary for Rob and Gary, name them bobSalary and garySalary.
        //   Create a new variable named highestSalary.
        //   Determine which salary is greater using Math.max() and store the answer in highestSalary.
        //   Set the initial salary variables to any value you want.
        //   Print the answer (ie "The highest salary is...")

        double bobSalary = 180000;
        double garySalary = 92000;
        double highestSalary = Math.max(bobSalary,garySalary);
        System.out.println("The higher salary is " + highestSalary);

        //2. Find and display the smallest of two variables named carPrice and truckPrice.
        //   Set the variables to any value you want.

        int carPrice = 32000;
        int truckPrice = 50000;
        System.out.println("The car is priced at " + carPrice + ", while the truck is priced at " + truckPrice + ".");

        //3. Find and display the area of a circle whose radius is 7.25

        double r = 7.25;
        double area = Math.PI * Math.pow(r,2);
        System.out.println("The area of the circle is " + area + ".");

        //4. Find and display the square root of a variable after it is set to 5.0

        double value = 5.0;
        double sqrt = Math.sqrt(value);
        System.out.println("The square root of " + value + " is " + sqrt + ".");

        //5. Find and display the distance between the points (5, 10) and (85, 50)

        int x1 = 5;
        int x = 85;
        int y1 = 10;
        int y = 50;
        double distance = Math.sqrt(Math.pow(x-x1,2) + Math.pow(y-y1,2));
        System.out.println("The distance between the two points is " + distance + ".");

        //6. Find and display the absolute positive value of a variable after it is set to -3.8

        double negativeNumber = -3.8;
        double absoluteValue = Math.abs(negativeNumber);
        System.out.println("The absolute value of " + negativeNumber + " is " + absoluteValue + ".");

        //7. Find and display a random number between 0 and 1.

        double randomNumber = Math.random();
        System.out.println("A random number between 0 and 1 is " + randomNumber + ".");

        //8. Calculate how many minutes are in 24 days, use a variable for each value you calculate with.

        int days = 24;
        int hrs = 24;
        int mins = 60;
        int hours = days * hrs;
        int minutes = mins * hours;

        System.out.println("There are " + minutes + " minutes in " + days + " days.");

        //BONUS: How many milliseconds are in 24 days?

        int secs = 60;
        int millisecs = 1000;
        int seconds = Math.multiplyExact(minutes,secs);
        long milliseconds = Math.multiplyExact(seconds, millisecs);
        System.out.println("There are " + milliseconds + " milliseconds in " + days + " days.");
    }
}