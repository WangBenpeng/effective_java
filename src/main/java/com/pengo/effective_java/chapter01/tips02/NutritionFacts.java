package com.pengo.effective_java.chapter01.tips02;

/**
 * 建造者（Builder）模式
 * @author Benpeng
 * @date 2023/1/13
 */
public class NutritionFacts {
    private final int serviceSize;
    private final int servings;
    private final int calorie;
    private final int fat;
    private final int sodium;
    private final int carbohydrat;

    private NutritionFacts(Builder builder) {
        this.serviceSize = builder.serviceSize;
        this.servings = builder.servings;
        this.calorie = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrat = builder.carbohydrate;
    }

    public static class Builder{
        //required
        private final int serviceSize;
        private final int servings;

        //optional
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int serviceSize, int servings) {
            this.serviceSize = serviceSize;
            this.servings = servings;
        }

        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public Builder carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "serviceSize=" + serviceSize +
                ", servings=" + servings +
                ", calorie=" + calorie +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrat=" + carbohydrat +
                '}';
    }
}
