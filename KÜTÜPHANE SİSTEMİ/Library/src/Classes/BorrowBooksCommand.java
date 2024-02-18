
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cemil
 */
public class BorrowBooksCommand extends CommandAbstarct {
    @Override
    public void execute() {
        oduncAlınanKitaplar odunc = new oduncAlınanKitaplar();
        odunc.setVisible(true);
        odunc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
