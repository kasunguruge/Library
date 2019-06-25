package lk.kasun.app.staffmanagementservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;


@Entity
public class NonAcademic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    List<Permenent> permenents;

}
