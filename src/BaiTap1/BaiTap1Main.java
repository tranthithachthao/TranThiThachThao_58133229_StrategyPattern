/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Dell
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Context c = new Context();
        c.setTinhToan(new Cong());
        System.out.println("75 + 12 = " + c.tinh(75, 12));
        
        c.setTinhToan( new Tru());
        System.out.println("\n");
        System.out.println("54 - 87 = " + c.tinh(54, 78));
    }
    
}
