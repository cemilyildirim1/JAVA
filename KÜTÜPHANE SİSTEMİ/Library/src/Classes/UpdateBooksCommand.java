
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cemil
 */
public class UpdateBooksCommand extends CommandAbstarct {
    @Override
    public void execute() {
        kitapGuncelleme kGuncelleme = new kitapGuncelleme();
        kGuncelleme.setVisible(true);
        kGuncelleme.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}