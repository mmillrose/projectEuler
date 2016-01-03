/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author max.millrose
 * Class with useful methods, that can be used for any kind of problem
 */

public class Helper {
    public ArrayList<Integer> createConsecutiveArray(int limit) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int x=1; x<=limit; x++) al.add(x);
        return (al);
    }
    
    public ArrayList<Integer> createMultiplesArray(int limit,int divisor1, int divisor2){
        ArrayList<Integer> al = new ArrayList<>();
        for (int x=1; x<=limit; x++) if (checkDivisible(x,3) & checkDivisible(x,5)) al.add(x);
        return (al);
    }

    private boolean checkDivisible(int target, int divisor) {
        return target % divisor ==0;
    }
    
    public Integer getSum(ArrayList<Integer> list) {
     Integer sum= 0; 
     for (Integer i:list)
         sum += i;
     return sum;
}
    
}
