package Generics;

public class GenericsExemple {
    public static void main(String[] args){

        Printer<Integer> printer = new Printer<>(40);
        printer.print();

        Printer<Double> printer1 = new Printer<>(15.5);
        printer1.print();

        Printer<String> printer2 = new Printer<>("Hello");
        printer2.print();
    }
}
