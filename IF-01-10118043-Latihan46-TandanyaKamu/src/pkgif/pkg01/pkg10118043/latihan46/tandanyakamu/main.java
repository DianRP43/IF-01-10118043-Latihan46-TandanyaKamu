/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg01.pkg10118043.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Tahun Lahir : ");
        Scanner input = new Scanner(System.in);
        int umur = input.nextInt();
        Age A = new Age(2019);
        A.setYearBirth(umur);
        
        System.out.println("Umur mu: "+ A.hitungUmur());
        System.out.println("Tandanya Kamu : "+ A.TandanyaKamu());
    }
    
}
