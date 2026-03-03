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
 * Reservation Class
 * This class implements 'ReservationActions'. By doing this, I am 
 * promising that every Reservation will have confirm, cancel, and modify logic.
 */
public class Reservation implements ReservationActions {
    private int reservationId;
    private int bookingId;
    private int userId;
    private String type;

    public Reservation(int reservationId, int bookingId, int userId, String type) {
        this.reservationId = reservationId;
        this.bookingId = bookingId;
        this.userId = userId;
        this.type = type;
    }

    public int getReservationId() { return reservationId; }

    // These methods fulfill the "Interface" contract
    @Override
    public void confirm() {
        System.out.println("CONFIRMATION: Reservation " + reservationId + " (" + type + ") has been confirmed.");
    }

    @Override
    public void cancel() {
        System.out.println("CANCELLATION: Reservation " + reservationId + " has been cancelled.");
    }

    @Override
    public void modify(String newDetails) {
        System.out.println("MODIFICATION: Reservation " + reservationId + " updated to: " + newDetails);
    }
}