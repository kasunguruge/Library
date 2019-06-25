package lk.kasun.app.librarysystem.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

public class BookCollection {

    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    @OneToMany
    List<LendingBook> lendingBook;
    @OneToMany
    List<RareBook> rareBook;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<LendingBook> getLendingBook() {
        return lendingBook;
    }

    public void setLendingBook(List<LendingBook> lendingBook) {
        this.lendingBook = lendingBook;
    }

    public List<RareBook> getRareBook() {
        return rareBook;
    }

    public void setRareBook(List<RareBook> rareBook) {
        this.rareBook = rareBook;
    }
}
