package lk.kasun.app.librarysystem.model;

import javax.persistence.OneToOne;

public class Member {

    Integer id;




    @OneToOne
    BookCollection bookCollection;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
