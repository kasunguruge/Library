package lk.kasun.app.studentmangementservice.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
   Integer id;

    @OneToMany
    List<UndergraduateStudent> undergraduateStudent;
    @OneToMany
    List<PostgraduateStudent> postgraduateStudent;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<UndergraduateStudent> getUndergraduateStudent() {
        return undergraduateStudent;
    }

    public void setUndergraduateStudent(List<UndergraduateStudent> undergraduateStudent) {
        this.undergraduateStudent = undergraduateStudent;
    }

    public List<PostgraduateStudent> getPostgraduateStudent() {
        return postgraduateStudent;
    }

    public void setPostgraduateStudent(List<PostgraduateStudent> postgraduateStudent) {
        this.postgraduateStudent = postgraduateStudent;
    }
}
