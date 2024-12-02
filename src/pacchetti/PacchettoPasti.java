package pacchetti;
public class PacchettoPasti extends PacchettiViaggi{
    private boolean isMezzaPensione;

    public PacchettoPasti(String destinazione, double costo, int durata, boolean isMezzzaPensione) {
        super(destinazione, costo, durata);
        this.isMezzaPensione = isMezzaPensione;
    }

    public boolean isMezzzaPensione() {
        return isMezzaPensione;
    }

    public void setMezzzaPensione(boolean mezzzaPensione) {
        isMezzaPensione = mezzzaPensione;
    }

    public String toString() {
        return super.toString() + "è solo mezza pensione?" + isMezzaPensione;

    }
    public double getCosto() {
        if (isMezzaPensione){
            return super.getCosto()+25;
        }else{
            return super.getCosto()+35;
        }
    }

  }

