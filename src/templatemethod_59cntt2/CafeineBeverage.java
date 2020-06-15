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
public abstract class CafeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourlnCup();
        addCondiments();
    }

    void boilWater() {
        System.out.println("Nau nuoc");
    }

    abstract void brew();

    void pourlnCup() {
        System.out.println("Do vao coc");
    }

    abstract void addCondiments();
}
