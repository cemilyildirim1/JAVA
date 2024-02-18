/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cemil
 */
public class YurutGenel implements IslemleriYurut{
     @Override
    public void yurutIslem(KitapIslemler kitapIslem) {
        System.out.println("İşlemi Yürüt: ");
        kitapIslem.islem();
    }
}
