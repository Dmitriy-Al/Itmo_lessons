package homework8;

public class ApplicationSchool {

    public static void main(String[] args) {


        Student ron = new Student("Ron Weasley", 14, 40);
        Student harry = new Student("Harry Potter", 14, 50);
        Student hermione = new Student("Hermione Granger", 14, 100);

        Teacher umbrige = new Teacher("Dolores Umbrige", 50, School.LESSON1, 1);
        Teacher snape = new Teacher("Severus Snape", 36, School.LESSON2, 5);
        Teacher mcGonagall = new Teacher("Minerva McGonagall", 60, School.LESSON3, 5);

        Director dumbledore = new Director("Albus Dumbledore", 114);


        School school = new School(3, dumbledore, new Teacher[]{umbrige, snape, mcGonagall}, new Student[]{ron, harry, hermione});

    }
}
//ДОПОЛНИТЕЛЬНАЯ задача 'Школа'
//Класс Ученик создается со следующими характеристиками:
//
//имя (тип String)
//возраст (тип int)
//название изучаемого предмета (тип String)
//уровень знаний (тип int)
//методом:
//
//учиться(навык_учителя) - уровень знаний ученика повышается на рандомное значение в диапазоне [0, навык_учителя]
//Класс Учитель создается со следующими характеристиками:
//
//имя (тип String)
//возраст (тип int)
//название преподаваемого предмета (тип String)
//навык учителя (тип int) - максисмум, на который может быть увеличен уровень значний ученика
//методом:
//
//учить(обучаемого)
//Класс Директор создается со следующими характеристиками:
//
//имя (тип String)
//возраст (тип int)
//методами:
//
//объявить начало занятий() - вывод информации в косоль
//объявить окончание занятий занятий() - вывод информации в косоль
//Класс Школа создается со следующими характеристиками:
//
//название - задается при создании объекта и не может быть изменено в последствии
//директор - школа не может функционировать без директора
//учителя[] - массив
//ученики[] - массив
//методом:
//
//день в школе():
//директор объявляет начало занятий
//учителя учат учеников (предмет учителя и ученика должны совпадать, уровень знаний ученика в процессе обучения должен увеличиваться)
//директор объявляет окончание занятий
//Общие свойства необходимо вынести в родительские классы (какие определить самостоятельно) В классах можно добавлять методы и свойства при необходимости