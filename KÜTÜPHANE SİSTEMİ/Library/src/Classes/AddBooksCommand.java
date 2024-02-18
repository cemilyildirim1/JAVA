
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cemil
 */
public class AddBooksCommand extends CommandAbstarct{
    @Override
    public void execute() {
        AddBooks kitapEklemeEkrani = new AddBooks();
        kitapEklemeEkrani.setVisible(true);
        kitapEklemeEkrani.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
