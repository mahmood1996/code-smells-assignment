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
public class OneBeer implements payable{
    public OneBeer(){}
    
    @Override
    public int getCost() {
        return 74;
    }
}