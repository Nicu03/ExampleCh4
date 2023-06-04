package spring.impl.pojo;

public class Comment {
    private String author;
    private String message;

    public Comment(String author, String message) {
        this.author = author;
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "author='" + author + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
