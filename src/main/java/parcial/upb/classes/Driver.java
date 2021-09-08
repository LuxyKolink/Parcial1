/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.upb.classes;

/**
 *
 * @author santi
 */
public class Driver {
    
    private int id;
    private boolean parkAffiliate;
    
    public Driver(int id, boolean parkAffiliate){
        this.id = id;
        this.parkAffiliate = parkAffiliate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isParkAffiliate() {
        return parkAffiliate;
    }

    public void setParkAffiliate(boolean parkAffiliate) {
        this.parkAffiliate = parkAffiliate;
    }
    
    
}
