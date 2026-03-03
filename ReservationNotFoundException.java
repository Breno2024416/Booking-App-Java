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
 * ReservationNotFoundException
 * I developed this to handle searching errors. 
 * If a user tries to 'Modify' or 'Cancel' a reservation ID that isn't 
 * in our list, this exception lets us give the user a clear explanation 
 * instead of the program just crashing with a generic error.
 */
public class ReservationNotFoundException extends Exception {
    public ReservationNotFoundException(String message) { 
        super(message); 
    }
}