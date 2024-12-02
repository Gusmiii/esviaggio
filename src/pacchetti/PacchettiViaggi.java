package pacchetti;
import java.util.Objects;


public class PacchettiViaggi {
        private String destinazione;
        private double costo;
        private int duarata;

        public PacchettiViaggi (){
            this.destinazione = "";
            this.duarata = 0;
            this.costo=0.0;
        }
        public PacchettiViaggi (String destinazione,double costo,int durata){
            this.costo= costo;
            this.duarata=durata;
            this.destinazione=destinazione;
        }

    public double getCosto() {
        return costo;
    }

    public int getDuarata() {
        return duarata;
    }

    public String getDestinazione() {
        return destinazione;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setDuarata(int duarata) {
        this.duarata = duarata;
    }

    public void setDestinazione(String destinazione) {
        this.destinazione = destinazione;
    }

    public String toString() {
        return "PacchettiViaggi{" +
                "destinazione='" + destinazione + '\'' +
                ", costo=" + costo +
                ", duarata=" + duarata +
                '}';
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PacchettiViaggi that = (PacchettiViaggi) o;
        return Double.compare(costo, that.costo) == 0 && duarata == that.duarata && Objects.equals(destinazione, that.destinazione);
    }
}