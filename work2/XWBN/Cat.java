/**
 *@Date：2023/10/18
 *@Author：XWBN
 */

package XWBN2;

import XWBN2.Animal;
public class Cat extends Animal {
    public Cat(String name, int age, String sex, double aniPurPrice) {
        super(name, age, sex, 200, aniPurPrice);
    }

    @Override
    public String toString() {
        return '\n' + "[动物名:" + getAnimalName() + "]" + '\n' + "[动物年龄:" + getAnimalAge() + "]" + '\n' + "[动物性别:" + getAnimalSex() + "]" + '\n' + "[动物进价:" + getAnimalPurPrice() + "]" + '\n' + "[动物售价:" + getAnimalSellPrice() + "]" + '\n';
    }
}
