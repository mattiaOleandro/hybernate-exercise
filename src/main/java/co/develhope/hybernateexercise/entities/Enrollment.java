package co.develhope.hybernateexercise.entities;

import javax.persistence.*;

@Entity
@Table(name = "enrollments")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "class_id")
    private Class aClass;

    public Class getAClass() {
        return aClass;
    }

    public void setAClass(Class aClass) {
        this.aClass = aClass;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
