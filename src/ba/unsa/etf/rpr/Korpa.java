package ba.unsa.etf.rpr;

import java.util.Objects;

public class Korpa {
    private Artikl[] artikli = new Artikl[50];
    private int brojDodatihArtikala = 0;

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for (Artikl artikal : artikli) {
            if (artikal == null) break;
            suma = suma + artikal.getCijena();
        }
        return suma;
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
            index = index + 1;
        }
        // a = Arrays.stream(this.a).filter((x) -> (x.getKod()).equals(kod)).toArray();
      //  if (izbacena != null) return izbacena;

        return izbacena;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public boolean dodajArtikl(Artikl artikal) {
        if (brojDodatihArtikala >= 50) return false;
        else artikli[brojDodatihArtikala] = artikal;
        brojDodatihArtikala++;
        return true;
    }

}
