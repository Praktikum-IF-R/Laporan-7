/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS1;

/**
 *
 * @author Lenovo
 */
public class Silver extends Member {
    public double DiskonMember(long a,long b,int diskon){
        return (a+(b*((100-diskon)/100.0)))*(90/100.0);
    }
}
