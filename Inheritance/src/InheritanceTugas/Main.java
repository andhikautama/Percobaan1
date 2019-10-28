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
public class Main {
    public static void main(String[] args) {
        Mac mc = new Mac("Apple", 1080,8,"Intel Core i5","Tanam", "SMADAV");
        mc.tampilMac();
        
        Windows ws = new Windows("ACER Predator",1080,8,"Intel Core i9","Tanam","Keyboard kedap kedip");
        ws.tampilWindows();
    }
}