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
 * OverbookingException
 * I created this class to enforce the business rule that a single Booking 
 * cannot have more than 5 reservations. 
 * By extending 'Exception', I am making this a "Checked Exception," which 
 * means the compiler will force me to handle it using a try-catch block.
 */
public class OverbookingException extends Exception {
    public OverbookingException(String message) { 
        // super(message) passes my custom error message to the parent Exception class
        super(message); 
    }
}