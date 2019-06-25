package lk.kasun.app.staffmanagementservice.model;

import javax.persistence.*;
import java.util.List;

public class Staff {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;


    @OneToMany
    List<Academic> academic;
    @OneToMany
    List<NonAcademic> nonAcademic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Academic> getAcademic() {
        return academic;
    }

    public void setAcademic(List<Academic> academic) {
        this.academic = academic;
    }

    public List<NonAcademic> getNonAcademic() {
        return nonAcademic;
    }

    public void setNonAcademic(List<NonAcademic> nonAcademic) {
        this.nonAcademic = nonAcademic;
    }
}
