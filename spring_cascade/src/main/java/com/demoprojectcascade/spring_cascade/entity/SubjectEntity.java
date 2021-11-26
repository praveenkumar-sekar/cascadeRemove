
package com.sample.persist.Cascade.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "subject")
public class Subject {
    private String s_name;
    private int s_marks;
    @Id
    private int id;

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public int getS_marks() {
        return s_marks;
    }

    public void setS_marks(int s_marks) {
        this.s_marks = s_marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    EntityManager entityManager = em.createEntityManager();
        em.getTransaction();
    Student s1 = new Student();
        s1.setId(1);
        s1.setName("praveen");
        s1.setAge(21);
    Subject sb1 = new Subject();
        sb1.setS_name("physics");
        sb1.setS_marks(90);
        sb1.setId(s1.getId());
        entityManager.persist(s1);
}
