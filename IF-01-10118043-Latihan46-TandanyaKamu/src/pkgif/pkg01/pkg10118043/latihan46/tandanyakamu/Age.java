/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg01.pkg10118043.latihan46.tandanyakamu;

/**
 *
 * @author user
 */
public class Age {
    private int yearBirth, yearNow;
    private String red;
    private int hitungUmur;

    public Age(int yearNow) {
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }
    public int hitungUmur(){
    return yearNow - yearBirth; 
        
    }
    
    
    public String TandanyaKamu(){       
    if ((hitungUmur() > 0 )&& (hitungUmur() <=5)) {
        return "A";
        } else if ((hitungUmur() > 0 )&& (hitungUmur() <=5)){
            return "B";
        } else if ((hitungUmur() > 5 )&& (hitungUmur() <=10)){
            return "C";
        } else if ((hitungUmur() > 10 )&& (hitungUmur() <=13)){
            return "D";
        } else if ((hitungUmur() > 13 )&& (hitungUmur() <=19)){
            return "E";
        } else if ((hitungUmur() > 19 )&& (hitungUmur() <=29)){
            return "F";
        } else if ((hitungUmur() > 29 )&& (hitungUmur() <=35)){
            return "G";
        } else if ((hitungUmur() > 35 )&& (hitungUmur() <=150)){
            return "H";
        }    
        return null;
    }
}
