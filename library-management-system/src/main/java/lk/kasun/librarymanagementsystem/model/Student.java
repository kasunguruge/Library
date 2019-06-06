package lk.kasun.librarymanagementsystem.model;



import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Students")
public class Student {

    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String name;

    @OneToMany(cascade = CascadeType.ALL)

    List<Book> books;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
