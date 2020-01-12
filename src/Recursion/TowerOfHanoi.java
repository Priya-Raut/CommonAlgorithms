/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author piya
 */
public class TowerOfHanoi {
    
    public void move(int discsToBeMoved, char from, char to, char medium){
        if(discsToBeMoved == 1){
            System.out.println("Moving disc 1 from " + from + " to " + to);
        }
        else{
            move(discsToBeMoved-1, from , medium, to);
            System.out.println("Moving " + discsToBeMoved + " from " + from + " to " + to);
            move(discsToBeMoved-1,medium, to, from);
        }
    }
    
    public static void main(String[] args) {
        TowerOfHanoi tower = new TowerOfHanoi();
        tower.move(3, 'A', 'C', 'B');
    }
}
