package lk.kasun.app.librarysystem.model;

import javax.persistence.*;

@Entity
public class Member {

    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
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
