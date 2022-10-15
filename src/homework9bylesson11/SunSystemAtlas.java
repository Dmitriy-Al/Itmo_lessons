package homework9bylesson11;

public class SunSystemAtlas {

    public static void main(String[] args){

        Planet planet = Planet.JUPITER;

        for(Planet p : planet.values()){
            System.out.println(p.toString());
        }

        planet.setMass(3.14);
        planet.setRadius(777);

        System.out.println(planet.toString());

        switch (planet){
            case MERCURY -> System.out.println("No, Jupiter"); // Это для себя
            case JUPITER -> System.out.println("Yes, Jupiter");
            case MARS -> System.out.println("Only Jupiter");
        }

    }
}
// 1. создать enum, перечисляющий 3 любые планеты солнечной системы
//2. значения всех свойств задать через конструктор: масса, радиус и название планеты
//3. реализовать возможность изменить массу и радиус планеты
//4. в методе main перебрать массив с элементами перечисления, вывести массу, радиус и название каждой планеты
