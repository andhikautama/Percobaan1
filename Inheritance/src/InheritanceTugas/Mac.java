/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceTugas;

/**
 *
 * @author ASUS
 */
public class Mac extends Laptop{

    public String security;
    public Mac(){
        
    }
    public Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String security){
        super( merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.security=security;
    }
    public void tampilMac(){
        System.out.println("===============MAC===============");
        super.tampilLaptop();
        System.out.println("Security            : "+security);
    }
}