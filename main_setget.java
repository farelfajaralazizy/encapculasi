/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setget;

/**
 *
 * @author farelfajar
 */
public class main_setget {
    public static void main(String[] args) {
         Setget dian = new Setget();

// menggunakan method setter
dian.setUsername("dian");
dian.setPassword("kopiJava");
//
// menggunakan method getter
System.out.println("Username: " + dian.getUsername());
System.out.println("Password: " + dian.getPassword());  
    }
}
