/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laporan7;

/**
 *
 * @author Lenovo
 */
public class Premium extends Salon {


    public double Diskon() {
        return super.TotalSementara()*0.2;
    }
    public double Total() {
        return super.TotalSementara() - Diskon(); 
    }
    public double Diskon1(){
        return super.TotalSementara1()*0.2;
    }
    public double Total1() {
        return super.TotalSementara1() - Diskon1(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
