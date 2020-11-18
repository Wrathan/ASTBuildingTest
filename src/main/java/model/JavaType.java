package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="\"JavaType\"")
public class JavaType {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "\"isAbstract\"")
    private boolean isAbstract;

    @Column(name = "\"isPOD\"")
    private boolean isPOD;

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getIsAbstract() {
        return isAbstract;
    }

    public void setIsAbstract(boolean isAbstract) {
        this.isAbstract = isAbstract;
    }

    public boolean getIsPOD() {
        return isPOD;
    }

    public void setIsPOD(boolean isPOD) {
        this.isPOD = isPOD;
    }
}
