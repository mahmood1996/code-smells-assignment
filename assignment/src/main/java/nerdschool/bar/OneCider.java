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
public class OneCider implements payable{
    public OneCider() {}
    
    @Override
    public int getCost() {
        return 103;
    }
    
}
