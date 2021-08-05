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
public interface iSpecialOfferHandler {
    public boolean isSpecialOrder(Order order);
    public double  getDiscount();
}
