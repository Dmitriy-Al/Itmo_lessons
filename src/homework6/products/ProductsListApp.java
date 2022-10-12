package homework6.products;

public class ProductsListApp {

    public static void main(String[] args) {

        Product apple = new Product("Antonovka", 0, 0, 11, 48);      //Создать не менее 4 экземпляров класса Product
        Product cheese = new Product("Parmesan", 35, 25, 3, 391);
        Product sweetWater = new Product("CocaCola", 0, 0, 10, 42);
        Product chocolate = new Product("Alyonka", 7, 34, 53, 550);
        Product cake = new Product("Napoleon", 4, 21, 49, 390);
        Product mineralWater = new Product("Esentuki", 0, 0, 0, 0);


        MyProducts choseProduct = new MyProducts();

        System.out.println("\nInfo about products: ");
        choseProduct.showAllProductsInfo(mineralWater, cake, chocolate, apple, cheese, sweetWater);  //Свойства: максимальное количество белков / жиров / углеводов / калорий


        System.out.println("\nCheck all products and show not dietary: ");
        choseProduct.isDietaryProduct(mineralWater, cake, chocolate, apple, cheese, sweetWater);    //Реализовать метод, который принимает Продукт и добавляет его в список, если характеристики продукта
                                                                                                    //полностью соответствуют заявленным разрешениям, в противном случае сообщить, по какой причине продукт
                                                                                                    //не может быть добавлен в список (например, слишком большое содержание калорий)

        System.out.println("\nShow dietary products list: ");  //Реализовать метод, который выводит названия всех продуктов из списка
        choseProduct.getDietaryProducts();

    }
}
