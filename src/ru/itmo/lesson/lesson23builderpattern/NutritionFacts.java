package ru.itmo.lesson.lesson23builderpattern;
// ПАТТЕРН BUILDER
public class NutritionFacts {

    // обязательные свойства
    private final int servings;
    // необязательные свойства
    private final int calories;
    private final int fat;
    private NutritionFacts(Builder builder){ // Объекты не создаются извне, поэтому конструктор private
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;

    }



    public static class Builder{
        // Экземплярам вложенного класса делегируется ответственность за создание
        // объектов внешнего класса

        // обязательные свойства
        private final int servings; // принято обязательным св-вам присваивать final
        // необязательные свойства
        private int calories = 1; // необязательным св-вам нормально присваивать значение
        private int fat = 1;  // необязательным св-вам нормально присваивать значение

        public Builder(int servings) {
            this.servings = servings;
        }

        // для остальных св-в создаются сеттеры
        // проверки входящих данных осуществляются в конструкторах и сеттерах класса-строителя

        public Builder calories (int calories){
            this.calories = calories;
            return this;
        }

        public Builder fat (int fat){
            this.fat = fat;
            return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }
}
