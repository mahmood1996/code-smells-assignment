/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nerdschool.bar;

/**
 *
 * @author Mahmoud
 */
public class Order {
    public boolean isStudent;
    public int     amount;
    public String  drink;
    
    Order(boolean isStudent, int amount, String drink) {
        this.isStudent = isStudent;
        this.amount = amount;
        this.drink = drink;
    }
}
