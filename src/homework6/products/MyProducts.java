package homework6.products;

public class MyProducts {

    public static Product[] dietaryProduct = new Product[10];

    public static void main(String[] args) {

        //Класс МоиПродукты:
        //Свойства: максимальное количество белков / жиров / углеводов / калорий / список продуктов (массив)
        //Реализовать метод, который принимает на Продукт и добавляет его в список, если характеристики продукта
        //полностью соответствуют заявленным разрешениям, в противном случае сообщить, по какой причине продукт
        //не может быть добавлен в список (например, слишком большое содержание калорий)
        //Реализовать метод, который выводит названия всех продуктов из списка


        Product apple = new Product("Antonovka", 0, 0, 11, 48);

        Product cheese = new Product("Parmesan", 35, 25, 3, 391);

        Product sweetWater = new Product("CocaCola", 0, 0, 10, 42);

        Product chocolate = new Product("Alyonka", 7, 34, 53, 550);

        Product cake = new Product("Napoleon", 4, 21, 49, 390);

        Product mineralWater = new Product("Esentuki", 0, 0, 0, 0);

        isDietaryProduct(mineralWater);
        isDietaryProduct(cheese);
        isDietaryProduct(chocolate);
        isDietaryProduct(cake);
        isDietaryProduct(apple);
        isDietaryProduct(sweetWater);

        System.out.println("\nProducts added in the product list: \n");

        for (Product p : dietaryProduct) {
            if (p != null) System.out.println(p.getProductTitle() + " is at the product list");
        }

    }

    public static void isDietaryProduct(Product product) {
        for (int i = 0; i < dietaryProduct.length; i++) {
            if (product.getProductCalories() > 100 || product.getProductTitle().equals("CocaCola")) {
                System.out.println("Product " + product.getProductTitle() + " is not good for dietary product list!");
                return;
            } else if (dietaryProduct[i] == null && product.getProductCalories() < 100 && !product.getProductTitle().equals("CocaCola")) {
                dietaryProduct[i] = product;
                return;
            }
        }
    }

}
