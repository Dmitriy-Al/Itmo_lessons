package homework6.products;

public class MyProducts extends Product {

    //Класс МоиПродукты:
    //Свойства: максимальное количество белков / жиров / углеводов / калорий / список продуктов (массив)
    //Реализовать метод, который принимает Продукт и добавляет его в список, если характеристики продукта
    //полностью соответствуют заявленным разрешениям, в противном случае сообщить, по какой причине продукт
    //не может быть добавлен в список (например, слишком большое содержание калорий)
    //Реализовать метод, который выводит названия всех продуктов из списка

    private final Product[] dietaryProducts = new Product[10];

    protected void showAllProductsInfo(Product... product) {
        for (Product p : product)
            System.out.println(p.getProductTitle() + " contains in 100g: protein " + p.getProductProtein() + ", fat: " +
                    p.getProductFat() + ", carbohydrates: " + p.getProductCarb() + " and all calories = " + p.getProductCalories());

    }

    protected void isDietaryProduct(Product... product) {
        for (Product p : product) {
            if (p.getProductCalories() < 100 && !p.getProductTitle().equals("CocaCola")) {
                for (int i = 0; i < dietaryProducts.length; i++) {
                    if (dietaryProducts[i] == null) {
                        dietaryProducts[i] = p;
                        break;
                    }
                }
            } else {
                System.out.println("Product " + p.getProductTitle() + " is not good for dietary product list!");
            }

        }
    }

    protected void getDietaryProducts() {
        for (Product p : dietaryProducts)
            if (p != null) System.out.println("Dietary product list contains " + p.getProductTitle());
    }

}