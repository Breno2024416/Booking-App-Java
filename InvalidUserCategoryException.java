/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingapp.ca2.oop;

/**
 *
 * @author breno
 */
/**
 * InvalidUserCategoryException
 * This is a data-integrity check I built. 
 * Since our dataset only allows specific categories (VIP, Premium, etc.), 
 * I use this exception to stop the program if the CSV file contains 
 * a category that doesn't exist in our Enum.
 */
public class InvalidUserCategoryException extends Exception {
    public InvalidUserCategoryException(String message) { 
        super(message); 
    }
}