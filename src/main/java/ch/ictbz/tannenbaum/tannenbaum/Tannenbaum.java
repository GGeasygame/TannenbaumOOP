package ch.ictbz.tannenbaum.tannenbaum;

public class Tannenbaum {
    private int stammbreite;
    private int stammhoehe;
    private int kronenhoehe;
    private String zeichnung = "";

    public Tannenbaum(int stammbreite, int stammhoehe, int kronenhoehe) {
        this.stammbreite = stammbreite;
        this.stammhoehe = stammhoehe;
        this.kronenhoehe = kronenhoehe;
    }


    public void setStammbreite(int breite) {
        stammbreite = breite;
    }
    public void setStammhoehe(int hoehe) {
        stammhoehe = hoehe;
    }
    public void setKronenhoehe(int hoehe) {
        kronenhoehe = hoehe;
    }

    public void zeichne() {
        zeichneKrone();
        zeichneBaumstamm();

    }

    private void zeichneKrone() {
        for (int i = 1; i < kronenhoehe+1; i++) {
            for (int j = 0; j < (kronenhoehe - i)/2; j++) {
                zeichnung += " ";
            }
            for (int j = 0; j < i; j++) {
                zeichnung += "*";
            }
            zeichnung += "\n";
        }
    }

    private void zeichneBaumstamm() {
        int ansatzBaumstamm = kronenhoehe / 2 - stammbreite / 2;
        for (int i = 0; i < stammhoehe; i++) {
            for (int j = 0; j < ansatzBaumstamm; j++) {
                zeichnung += " ";
            }
            for (int j = 0; j < stammbreite; j++) {
                zeichnung += "*";
            }
            zeichnung += "\n";
        }
    }

    public String getZeichnung() {
        return zeichnung;
    }
}
