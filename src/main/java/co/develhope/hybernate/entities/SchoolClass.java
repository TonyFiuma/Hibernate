package co.develhope.hybernate.entities;

import javax.persistence.*;

@Entity
@Table(name = "classes")
public class SchoolClass{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;


    public Long getClassId(){
        return classId;
    }

    public void setClassId(Long classId){
        this.classId = classId;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}