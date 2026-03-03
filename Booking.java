/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package bookingapp.ca2.oop;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author breno
 */

/**
 * Booking Class
 * This class acts as a manager. It tracks which user created the booking 
 * and holds a List of all the items they reserved.
 */
public class Booking {
    private int bookingId;
    private int createdByUserId;
    private List<Reservation> reservations; // Using a List to hold multiple reservations
    
    // I made this 'static final' because the limit of 5 is a system-wide rule
    private static final int MAX_RESERVATIONS = 5;

    public Booking(int bookingId, int createdByUserId) {
        this.bookingId = bookingId;
        this.createdByUserId = createdByUserId;
        this.reservations = new ArrayList<>(); // Initializing the empty list
    }

    /**
     * addReservation Method
     * This is where the 'Overbooking' logic happens. Before adding a 
     * reservation to the list, I check if we are already at the limit.
     */
    public void addReservation(Reservation res) throws OverbookingException {
        if (reservations.size() >= MAX_RESERVATIONS) {
            // Throwing custom exception if someone tries to add a 6th item
            throw new OverbookingException("Error: Booking " + bookingId + " exceeds limit of 5 reservations!");
        }
        reservations.add(res);
    }

    public List<Reservation> getReservations() { return reservations; }
    public int getBookingId() { return bookingId; }
}