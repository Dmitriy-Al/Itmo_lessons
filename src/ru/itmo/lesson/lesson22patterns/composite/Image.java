package ru.itmo.lesson.lesson22patterns.composite;

// единичное изображение
// должна быть возможность отрисовки
// Листья и составные элементы должны быть одним типом данных
public class Image implements Drawable{
    private String path;
    private String title;

    public Image(String path, String title) {
        this.path = path;
        this.title = title;
    }

    @Override
    public void draw() {
        System.out.println("Отрисовка изображения " + title);
    }
}