package ru.itmo.lesson.lesson22patterns.composite;


import java.util.ArrayList;

// может хранить изображения и другие галереи с изображениями
// должна быть возможность отрисовки
import java.util.ArrayList;

// должна быть возможность отрисовки
public class Gallery implements Drawable{
    private String title;
    private String path;
    private ArrayList<Drawable> elements;

    public Gallery(String path, String title) {
        this.title = title;
        this.path = path;
    }

    public void addToGallery(Drawable drawable){
        elements.add(drawable);
    }

    public void removeFromGallery(Drawable drawable){
        elements.remove(drawable);
    }

    @Override
    public void draw() {
        elements.forEach(element -> element.draw());
    }
}