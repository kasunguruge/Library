package lk.kasun.app.staffmanagementservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Academic {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;


    @OneToMany
    List<Permenent> permenents;
    @OneToMany
    List<Temporary> temporaries;

    @ManyToOne
            @JsonIgnore
    Staff staff;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Permenent> getPermenents() {
        return permenents;
    }

    public void setPermenents(List<Permenent> permenents) {
        this.permenents = permenents;
    }

    public List<Temporary> getTemporaries() {
        return temporaries;
    }

    public void setTemporaries(List<Temporary> temporaries) {
        this.temporaries = temporaries;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
}
