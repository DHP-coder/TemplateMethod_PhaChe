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
public class Coffee extends CafeineBeverage {

    @Override
    void brew() {
        System.out.println("Cho coffee vao phin");
    }

    @Override
    void addCondiments() {
        System.out.println("Them duong");
    }

}
