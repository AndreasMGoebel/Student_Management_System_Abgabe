package net.java.management.entity;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "module")
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "moduleName", nullable = false)
    public String moduleName;

    @Column(name = "grade")
    public int participants;


    public Module() {

    }

    public Module(String moduleName, int participants) {
        super();
        this.moduleName = moduleName;
        this.participants = participants;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getmoduleName() {
        return moduleName;
    }
    public void setmoduleName(String moduleName) {
        this.moduleName = moduleName;
    }
    public int getParticipants() { return participants; }
    public void setParticipants(int participants) {
        this.participants = participants;
    }

}