package pacchetti;

import java.util.Objects;

public class PacchettoVolo extends PacchettiViaggi {
    private boolean isAndata;

    public PacchettoVolo(String destinazione, double costo, int durata, boolean isAndata) {
        super(destinazione, costo, durata);
        this.isAndata = isAndata;
    }

    public boolean isAndata() {
        return isAndata;
    }

    public void setAndata(boolean andata) {
        isAndata = andata;
    }

    public String toString() {
        return super.toString() + "è solo andata?" + isAndata;

    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PacchettoVolo that = (PacchettoVolo) o;
        return isAndata == that.isAndata;
    }

    public double getCosto() {
        if (isAndata){
            return super.getCosto()+super.getCosto() /100 *50;
        }else{
            return super.getCosto()+super.getCosto() /100 *85;
        }
    }
}
