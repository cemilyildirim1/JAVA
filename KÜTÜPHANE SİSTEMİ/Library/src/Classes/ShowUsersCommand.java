
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cemil
 */
public class ShowUsersCommand extends CommandAbstarct{
    @Override
    public void execute() {
        ShowUsers showUsers = new ShowUsers();
        showUsers.setVisible(true);
        showUsers.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
