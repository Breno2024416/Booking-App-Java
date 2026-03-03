/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookingapp.ca2.oop;

/**
 *
 * @author breno
    /**
 * ReservationActions Interface
 * It defines what a reservation should do without dictating how it does it. It is an abstraction 
 * 
 * This interface acts as a contract for any class representing a reservation.
 * It ensures that regardless of the reservation type (Hotel, Flight, etc.), 
 * the object will consistently implement these three core business behaviors.
 */
public interface ReservationActions {

    /**
     * Executes the logic to finalize and confirm a reservation.
     */
    void confirm();

    /**
     * Executes the logic to void an existing reservation.
     */
    void cancel();

    /**
     * Updates the existing reservation details with new information provided.
     * 
     * @param newDetails A string describing the changes to be made (e.g., "Change to 2pm").
     */
    void modify(String newDetails);
}

