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
public class SpecialOfferHandler implements iSpecialOfferHandler{

    @Override
    public boolean isSpecialOrder(Order order) {
        return (order.isStudent && isSpecialOfferedDrinksForStudents(order));
    }

    @Override
    public double getDiscount() {
        return 0.1;
    }
    
    private boolean isSpecialOfferedDrinksForStudents(Order order) {
        return (order.drink.equals(Pub.ONE_CIDER) || order.drink.equals(Pub.ONE_BEER) || order.drink.equals(Pub.A_PROPER_CIDER));
    }
}
