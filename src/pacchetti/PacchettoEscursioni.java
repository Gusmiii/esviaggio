package pacchetti;

import java.util.Objects;

public class PacchettoEscursioni extends PacchettoPasti {
    private int numeropasti;
    public PacchettoEscursioni(String destinazione, double costo, int durata, boolean isMezzzaPensione,int numeropasti) {
        super(destinazione, costo, durata, isMezzzaPensione);
        this.numeropasti=numeropasti;
    }

    public int getNumeropasti() {
        return numeropasti;
    }

    public void setNumeropasti(int numeropasti) {
        this.numeropasti = numeropasti;
    }

    public String toString() {
        return "PacchettoEscursioni{" +
                "numeropasti=" + numeropasti +
                '}';
    }
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PacchettoEscursioni that = (PacchettoEscursioni) o;
        return numeropasti == that.numeropasti;
    }
}
