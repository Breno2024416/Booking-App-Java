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
 * User Class
 * This class represents the people in our system (like Liam or Emma from the CSV).
 * I used private variables here to follow the 'Encapsulation' principle, 
 * meaning the data is protected and only accessible via methods.
 */
public class User {
    private int userId;
    private String name;
    private UserCategory category; // Uses the Enum we created
    private int credits;
    private int loyaltyPoints;
    private double rating;
    private int reservationsMade;

    /**
     * The Constructor
     * When I create a user, I'm taking the raw String from the dataset 
     * and trying to turn it into a formal Enum. If the dataset has a 
     * category that doesn't exist, I throw my custom exception.
     */
    public User(int userId, String name, String categoryStr, int credits, int loyaltyPoints, double rating, int reservationsMade) throws InvalidUserCategoryException {
        this.userId = userId;
        this.name = name;
        
        try {
            // Converting String to Enum safely
            this.category = UserCategory.valueOf(categoryStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            // If the category in the CSV is wrong, this triggers our custom error
            throw new InvalidUserCategoryException("Invalid category: " + categoryStr);
        }
        
        this.credits = credits;
        this.loyaltyPoints = loyaltyPoints;
        this.rating = rating;
        this.reservationsMade = reservationsMade;
    }

    // Standard getters to retrieve data without modifying the original fields
    public int getUserId() { return userId; }
    public String getName() { return name; }

    /**
     * Overriding toString so that if I print a User object, 
     * it looks like "Liam Walker (REGULAR)" instead of a memory address.
     */
    @Override
    public String toString() { return name + " (" + category + ")"; }
}