package lk.kasun.app.staffmanagementservice.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Permenent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    String name;

    @ManyToOne
    @JsonIgnore
    Academic academic;

    @ManyToOne
    @JsonIgnore
    NonAcademic nonAcademic;

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

    public Academic getAcademic() {
        return academic;
    }

    public void setAcademic(Academic academic) {
        this.academic = academic;
    }

    public NonAcademic getNonAcademic() {
        return nonAcademic;
    }

    public void setNonAcademic(NonAcademic nonAcademic) {
        this.nonAcademic = nonAcademic;
    }
}
