package ru.itmo.lesson.lesson22patterns.composite;
// ШАБЛОН КОМПАНОВЩИК
public class Composite {
    public static void main(String[] args) {
        Image image01 = new Image("images/house", "House");
        Image image02 = new Image("images/tree", "Tree");
        Image image03 = new Image("images/sun", "Sun");


        Image image04 = new Image("images/fox", "Fox");
        Image image05 = new Image("images/Wolf", "Wolf");

        Gallery gallery01 = new Gallery("Beasts test","Wild Animals");
        gallery01.addToGallery(image04);
        gallery01.addToGallery(image05);
        // добавить image04, image05


        Image image06 = new Image("images/cat", "Cat");
        Image image07 = new Image("images/dog", "Dog");

        Gallery gallery02 = new Gallery("Bird test","Pets");
        gallery01.addToGallery(image06);
        gallery01.addToGallery(image07);
        // добавить image06, image07


        Gallery gallery03 = new Gallery("Cows test", "Village");
        gallery01.addToGallery(image01);
        gallery01.addToGallery(image02);
        // добавить gallery01, gallery02


        GalleryEditor galleryEditor = new GalleryEditor(gallery03);
        galleryEditor.show();
    }
}