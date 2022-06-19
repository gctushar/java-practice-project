package designpattern.builder;

public class Book {

    private final String isbn;
    private final String title;
    private final String author;
    private final String description;

    public Book(Builder builder) {
        this.isbn = builder.icbn;
        this.title = builder.title;
        this.author = builder.author;
        this.description = builder.description;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return "Builder{" +
                "icbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", HashCode='" + this.hashCode() + '\'' +
                '}';
    }


    public static class Builder{

        private final String icbn;
        private final String title;
        private String author;
        private String description;

        public Builder(String isbn, String title) {
            this.icbn = isbn;
            this.title = title;
        }

        public Builder author(String author){
            this.author = author;
            return this;
        }

        public Builder description(String description){
            this.description = description;
            return this;
        }

        public Book build(){
            return new Book(this);
        }

    }
}

