package com.uglyOrgan.jsonToDB.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name="discs")
public class Disc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NonNull
    private String discName;

    @NonNull
    private String discType;

    private Integer discSpeed;

    private Integer discGlide;

    private Integer discTurn;

    private Integer discFade;

    private Integer plasticType;

    public Disc(){} //for JPA bish

    public Disc(String discName, String discType, Integer discSpeed, Integer discGlide, Integer discTurn,
                Integer discFade, Integer plasticType){
        this.discName = discName;
        this.discType = discType;
        this.discSpeed = discSpeed;
        this.discGlide = discGlide;
        this.discTurn = discTurn;
        this.discFade = discFade;
        this.plasticType = plasticType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDiscName() {
        return discName;
    }

    public void setDiscName(String discName) {
        this.discName = discName;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public Integer getDiscSpeed() {
        return discSpeed;
    }

    public void setDiscSpeed(Integer discSpeed) {
        this.discSpeed = discSpeed;
    }

    public Integer getDiscGlide() {
        return discGlide;
    }

    public void setDiscGlide(Integer discGlide) {
        this.discGlide = discGlide;
    }

    public Integer getDiscTurn() {
        return discTurn;
    }

    public void setDiscTurn(Integer discTurn) {
        this.discTurn = discTurn;
    }

    public Integer getDiscFade() {
        return discFade;
    }

    public void setDiscFade(Integer discFade) {
        this.discFade = discFade;
    }

    public Integer getPlasticType() {
        return plasticType;
    }

    public void setPlasticType(Integer plasticType) {
        this.plasticType = plasticType;
    }

    @Override
    public String toString() {
        return "Disc{" +
                "id=" + id +
                ", discName='" + discName + '\'' +
                ", discType='" + discType + '\'' +
                ", discSpeed=" + discSpeed +
                ", discGlide=" + discGlide +
                ", discTurn=" + discTurn +
                ", discFade=" + discFade +
                ", plasticType=" + plasticType +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if (o == this)
            return true;
        if(!this.getClass().equals(o.getClass()))
            return false;

        Disc d = (Disc) o;
        if (d.getDiscName().equals(this.getDiscName())){
            if (d.getPlasticType()==this.getPlasticType()){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode(){
        int result = 18;

        result = 31 * result + discName.hashCode();
        result = 31 * result + (int) id;
        result = 31 * result + discType.hashCode();
        result = 31 * result + discSpeed;
        result = 31 * result + discGlide;
        result = 31 * result + discTurn;
        result = 31 * result + discFade;
        result = 31 * result + plasticType;
        return result;
    }
}
