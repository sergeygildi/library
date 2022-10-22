package ua.hildi.custom.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class Book {
    private int id;

    @NotEmpty(message = "Book should must not be empty")
    @Size(min = 2, max = 100, message = "Book title should be between 2 and 100 characters long")
    private String title;

    @NotEmpty(message = "Author should not be empty")
    @Size(min = 2, max = 100, message = "Author name should be between 2 and 100 characters long")
    private String author;

    @Min(value = 1500, message = "Year should be greater than 1500")
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

}
