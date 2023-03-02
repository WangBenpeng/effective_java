package com.pengo.effective_java.chapter01.tips02;

/**
 * @author Benpeng
 * @date 2023/1/13
 */
public class BuilderTest {
    public static void main(String[] args) {
        testPizza();
    }

    static void testPizza() {
        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE).addTopping(Pizza.Topping.ONION).build();
        Calzone calzone = new Calzone.Builder()
                .addTopping(Pizza.Topping.HAM).sauceInside().build();
        System.out.println(nyPizza);
        System.out.println(calzone);
    }

    static void test1() {
        NutritionFacts build = new NutritionFacts.Builder(10, 20).calories(30).fat(40).sodium(50).carbohydrate(60).build();
        System.out.println(build);
    }
}
