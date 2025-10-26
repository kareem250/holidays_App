/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holidays_app;

import com.formdev.flatlaf.FlatLightLaf;
import holidays_app.screens.sign_screen;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author wika
 */
public class Holidays_App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println(ex.getMessage());
        }
 sign_screen s=new sign_screen();
 s.setVisible(true);

        System.out.println("Kareem Ahmed Salama");
        System.out.println("Adel Reda Adel");
        System.out.println("Abd El Rahman");
        System.out.println("Ziad Mohamed Khalaf");
        System.out.println("Seif Ashraf Shawky");
        System.out.println("ناقص اربعة كمان");
        System.out.println("هيبقو سته ");
        System.out.println("احلي مسا عليكو يولاد المت***");
    }
    
}
