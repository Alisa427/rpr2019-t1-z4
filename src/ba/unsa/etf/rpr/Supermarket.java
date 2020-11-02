package ba.unsa.etf.rpr;

import java.util.Objects;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000];
    private int brojDodatihArtikala = 0;

    void dodajArtikl(Artikl a) {
        if (brojDodatihArtikala >= 1000) return;
        if(brojDodatihArtikala<0) brojDodatihArtikala=20;
        artikli[brojDodatihArtikala] = a;
        brojDodatihArtikala++;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl izbacena = null;
        int index = 0;
        for (Artikl artikal : artikli) {
            if (Objects.equals(artikal.getKod(), kod)) {
                for (int j = index; j < artikli.length - 1; j++) {
                    artikli[j] = artikli[j + 1];
                    brojDodatihArtikala--;
                }
                izbacena = artikal;
                break;
            }
            index++;
        }
        return izbacena;
    }
}
