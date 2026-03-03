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
 * DatabaseConnector Class
 * 
 * I designed this class to act as the "bridge" between our application and our data. 
 * Since we aren't using an external SQL server, I am using ArrayLists to simulate 
 * database tables. This allows us to persist data while the program is running.
 */
public class DatabaseConnector {
    
    // These lists act as my virtual database tables for Users and Reservations
    private List<User> userDB = new ArrayList<>();
    private List<Reservation> reservationDB = new ArrayList<>();

    /**
     * saveUser Method
     * This simulates an "INSERT" operation. It takes a User object 
     * and adds it to our local storage.
     */
    public void saveUser(User user) {
        userDB.add(user);
        // I added a print statement here so we can see the "database" 
        // working in the console during the demo.
        System.out.println("DB: User " + user.getName() + " saved to the database.");
    }

    /**
     * saveReservation Method
     * Similar to saveUser, this stores a reservation record.
     */
    public void saveReservation(Reservation res) {
        reservationDB.add(res);
        System.out.println("DB: Reservation " + res.getReservationId() + " successfully recorded.");
    }

    /**
     * fetchUsers Method
     * This simulates a "SELECT * FROM Users" query. 
     * It returns the entire list of users currently in the system.
     */
    public List<User> fetchUsers() { 
        return userDB; 
    }

    /**
     * fetchReservations Method
     * This retrieves all the reservation records we have saved so far.
     */
    public List<Reservation> fetchReservations() { 
        return reservationDB; 
    }
}