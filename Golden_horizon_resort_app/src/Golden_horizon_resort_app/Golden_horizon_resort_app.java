/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Golden_horizon_resort_app;
/**
 *
 * @author ASUS
 */
public class Golden_horizon_resort_app {
    public static void main(String[] args) {

        Login_frame LoginFrame = new Login_frame();
        LoginFrame.setVisible(false);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); 
        
        RESERVATION_FRAME reservationFrame = new RESERVATION_FRAME();
        reservationFrame.setVisible(true);
        reservationFrame.pack();
        reservationFrame.setLocationRelativeTo(null); 
    }
    
    
}
