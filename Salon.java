/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salon;


public abstract class Salon {
    protected String nama, member;
    double dis;
    public Salon(String nama, String member){
        this.nama=nama;
        this.member=member;
    }
    public void setNama(String n){
        nama=n;
    }
    public void setMember(String m){
        member=m;
    }
    public String getNama(){
        return nama;
    }
    public String getMember(){
        return member;
    }
    public void setDiskon(double d){
        dis=d;
    }
    public double getDiskon(){
        return dis;
    }
    public abstract double Total();
    public abstract double DisMember();
    public abstract double Diskon();
    public abstract void execute();
 }

    

