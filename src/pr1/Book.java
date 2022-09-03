package pr1;

public class Book {
    private String name;
    private String color;
    private int pages;

    public Book(String name, String color, int pages) {
        this.name = name;
        this.color = color;
        this.pages = pages;
    }
    public Book() {
        this.name = "Teremok";
        this.color = "Brown";
        this.pages = 100;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "This book's name is " + name + " and color is " + color + ", number of pages is " + pages;
    }

}
