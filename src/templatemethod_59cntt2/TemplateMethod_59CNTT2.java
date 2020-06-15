/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod_59cntt2;

/**
 *
 * @author DangHoaiPhong
 */
public class TemplateMethod_59CNTT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Pha che coffee:");
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
        System.out.println("Pha che tra:");
        Tea tea = new Tea();
        tea.prepareRecipe();
    }

}
