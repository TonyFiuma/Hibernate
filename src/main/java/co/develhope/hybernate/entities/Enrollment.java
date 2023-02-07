package co.develhope.hybernate.entities;

import javax.persistence.*;

@Entity
@Table(name = "enrollments")
public class Enrollment{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "studentId", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "classId", nullable = false)
    private SchoolClass schoolClass;

}