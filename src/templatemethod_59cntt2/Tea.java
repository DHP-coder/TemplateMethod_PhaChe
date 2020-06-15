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
public class Tea extends CafeineBeverage {

    @Override
    void brew() {
        System.out.println("Bo tra vao am");
    }

    @Override
    void addCondiments() {
        System.out.println("Them chanh");
    }

}
