/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Common.Library;
import Control.SortProgramming;
import Model.Element;
/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Element element = new Element();
        //1. Enter a possitive number
        element.setSize_array(library.getUserInput("Enter number of array", 1, 100));
        //2. Create array by generate random integer in range
        element.setArray(library.generateRandomArray(element.getSize_array()));
        new SortProgramming(element).run();
    }
}
