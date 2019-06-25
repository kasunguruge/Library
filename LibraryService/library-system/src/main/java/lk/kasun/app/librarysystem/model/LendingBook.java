package lk.kasun.app.librarysystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class LendingBook {

    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    @NotNull
    String name;
    Integer bookCount;

    BookCollection bookCollection;

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

    public BookCollection getBookCollection() {
        return bookCollection;
    }

    public void setBookCollection(BookCollection bookCollection) {
        this.bookCollection = bookCollection;
    }
}
