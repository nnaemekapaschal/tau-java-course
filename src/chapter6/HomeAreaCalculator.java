package chapter6;

public class HomeAreaCalculator {

    public static void main (String[] args){

        /******************************
         * RECTANGLE 1
         *****************************/

        //Create an instance of 'Rectangle' class
        Rectangle room1 = new Rectangle();
        room1.setLength(25);
        room1.setWidth(50);
        double areaRoom1 = room1.calculateArea();

        /******************************
         * RECTANGLE 2
         *****************************/

        //Create an instance of rectangle class
        Rectangle room2 = new Rectangle(30, 75);
        double areaRoom2 = room2.calculateArea();

        double totalArea = areaRoom1 + areaRoom2;

        System.out.println("Area of both rooms: "+totalArea);



    }
}
