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
  * Using an enum here because it prevents invalid data
 * UserCategory Enum
 * 
 * Defines the fixed set of membership levels available in the system.
 * This ensures type safety throughout the application, preventing 
 * invalid categories from being assigned to User objects.
 */
public enum UserCategory {
    /** Standard user with basic access */
    REGULAR, 
    
    /** High-tier user with additional benefits */
    PREMIUM, 
    
    /** Elite user with maximum priority and rewards */
    VIP, 
    
    /** Temporary user with limited system access */
    GUEST
}
