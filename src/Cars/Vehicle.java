/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cars;


/**
 *
 * @author Usuario
 */
public class Vehicle {
    private String driver_name;
    private double run_way;
    private int rail;
   
    public void setKlm(double kilometers){
        this.run_way = this.run_way + kilometers;
    }
    public double getKlm(){
        return this.run_way;
    }
    public void setDriver(String name){
        this.driver_name = name;
    }
    public String getDriver(){
        return this.driver_name;
    }
    public int getRail() {
        return rail;
    }

    public void setRail(int rail) {
        this.rail = rail+1;
    }
}
