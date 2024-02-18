
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cemil
 */
public class Ekleme implements KitapIslemler{
    
    @Override
    public void islem(){
        JOptionPane.showMessageDialog(null, "Başarıyla eklendi.", "", JOptionPane.INFORMATION_MESSAGE);
    }
}
