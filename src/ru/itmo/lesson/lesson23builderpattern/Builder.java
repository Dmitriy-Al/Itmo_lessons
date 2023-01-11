package ru.itmo.lesson.lesson23builderpattern;

public class Builder {
    public static void main(String[] args){

       NutritionFacts fo1 = new NutritionFacts.Builder(100)
               .calories(400)
               .fat(10)
                //.....
               .build();

        NutritionFacts fo2 = new NutritionFacts.Builder(400)
                .calories(20)
                //.....
                .build();

    }
}
