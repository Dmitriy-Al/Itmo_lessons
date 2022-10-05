package homework6.products;

public class Product {

    //Класс Продукт:
    //Свойства: название продукта / белки / жиры / углеводы / калории
    //Минимум 4 конструктора
    //Реализовать необходимые проверки входящих данных
    //Создать не менее 4 экземпляров данного класса (объектов)

    private String title;
    private int protein;
    private int fat;
    private int carbohydrates;
    private int calories;

    public Product() {
    }

    public Product(String title, int protein, int fat, int carb, int calories) {
        setProductsInfo(title, protein, fat, carb, calories);
    }

    public Product(int protein, int fat, int carb, int calories) {
    }

    public Product(String title) {
        this.title = title;
    }

    private void setProductsInfo(String title, int protein, int fat, int carb, int calories) {
        if (title.length() == 0 || protein < 0 || protein > 100 || carb < 0 || carb > 100 || fat < 0 || fat > 100 || calories < 0) {
            throw new IllegalArgumentException("Info is wrong!");
        } else {
            this.title = title;
            this.protein = protein;
            this.fat = fat;
            this.calories = calories;
            carbohydrates = carb;
        }
    }

    public String getProductTitle() {
        return title;
    }

    public int getProductProtein() {
        return protein;
    }

    public int getProductFat() {
        return fat;
    }

    public int getProductCarb() {
        return carbohydrates;
    }

    public int getProductCalories() {
        return calories;
    }

}
