/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bookingapp.ca2.oop;

/**
 *
 * @author breno
 */
/**
 * BookingAppSystem - The Main Entry Point
 * 
 * I designed this class to be the final demonstration of all the requirements.
 * It ties together the users, the bookings, the database logic, and the 
 * exception handling in one workflow
 */
public class BookingappCA2OOP {

    public static void main(String[] args) {
        // I initialize the DatabaseConnector first so we have a place 
        // to "save" our objects as we create them.
        DatabaseConnector db = new DatabaseConnector();
        
        try {
            // STEP 1: Setting up the Users
            // I am pulling this data directly from the CSV file provided in the assignment.
            // 8 users created as demanded 
            User u1 = new User(1, "Liam Walker", "Regular", 120, 300, 4.2, 5);
            User u2 = new User(2, "Emma Hughes", "Premium", 300, 820, 4.8, 12);
            User u3 = new User(3, "Noah Turner", "VIP", 1000, 2400, 4.9, 25);
            User u4 = new User(4, "Olivia Barnes", "Guest", 20, 50, 3.9, 1);
            User u5 = new User(5, "Elijah Foster", "Regular", 150, 430, 4.1, 6);
            User u6 = new User(6, "Ava Wood", "Premium", 350, 910, 4.7, 14);
            User u7 = new User(7, "William Harrison", "VIP", 1200, 3000, 5.0, 30);
            User u8 = new User(8, "Sophia Gibson", "Guest", 10, 20, 3.5, 0);
            
            // Saving them to my "mock database"
            db.saveUser(u1);
            db.saveUser(u2);
            db.saveUser(u3);
            db.saveUser(u4);
            db.saveUser(u5);
            db.saveUser(u6);
            db.saveUser(u7);
            db.saveUser(u8);

            // STEP 2: Creating Bookings
            // The assignment requires at least 2 bookings. 
            // Booking 201 is linked to Liam (User 1), and 202 is linked to Noah (User 3).
            Booking b1 = new Booking(201, 1); 
            Booking b2 = new Booking(202, 3); 

            // STEP 3: Testing the 5-Reservation Limit
            // This is a crucial part of the assignment. I am intentionally adding 6 
            // reservations to Booking 201 to prove my 'OverbookingException' works.
            System.out.println("\n--- Testing Reservation Limits ---");
            try {
                b1.addReservation(new Reservation(1001, 201, 1, "Hotel Room"));
                b1.addReservation(new Reservation(1002, 201, 2, "Car Rental"));
                db.saveReservation(b1.getReservations().get(0)); // Saving to DB
                
                b1.addReservation(new Reservation(1003, 201, 3, "Flight Ticket"));
                b1.addReservation(new Reservation(1004, 201, 4, "Conference Hall"));
                b1.addReservation(new Reservation(1005, 201, 5, "Restaurant Table"));
                
                // This 6th one is my "trap." It should fail and jump to the 'catch' block.
                System.out.println("Attempting to add a 6th reservation...");
                b1.addReservation(new Reservation(1006, 201, 6, "Extra Trip")); 
                
            } catch (OverbookingException e) {
                // I use System.err here so the error message stands out in red in the console.
                System.err.println("SUCCESSFUL TEST: " + e.getMessage());
            }

            // STEP 4: Demonstrating Actions (Interface methods)
            // Here I grab the first reservation and show that I can confirm and modify it.
            System.out.println("\n--- Performing Actions on Reservation 1001 ---");
            Reservation res = b1.getReservations().get(0);
            res.confirm();
            res.modify("Late check-in requested for 9 PM");

            // STEP 5: Testing Search & ReservationNotFoundException
            // I'm simulating a scenario where a user looks for a Reservation ID that doesn't exist.
            System.out.println("\n--- Testing Search Validation ---");
            int searchId = 9999; // This ID is obviously not in our list
            boolean found = false;
            
            for(Reservation r : b1.getReservations()) {
                if(r.getReservationId() == searchId) found = true;
            }
            
            if(!found) {
                try {
                    // Manually triggering the exception because the ID was not found.
                    throw new ReservationNotFoundException("Error: Reservation ID " + searchId + " does not exist.");
                } catch (ReservationNotFoundException e) {
                    System.err.println("CATCHED: " + e.getMessage());
                }
            }

            System.out.println("\n--- System Demonstration Complete ---");

        } catch (Exception e) {
            // This is my safety net. If anything else goes wrong, the program won't just crash.
            System.out.println("A general system error occurred: " + e.getMessage());
        }
    }
}