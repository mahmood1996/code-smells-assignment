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
public class BacardiSpecial implements payable {
    public BacardiSpecial() {}

    @Override
    public int getCost() {
        return 85 / 2 + 65 + 10 + 10;
    }
    
}
