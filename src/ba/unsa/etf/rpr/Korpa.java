package ba.unsa.etf.rpr;

import java.util.Objects;

public class Korpa {
    int ukupnaCijenaArtikala, artiklSaKodom;
    Artikl[] a = new Artikl[50];
    int i = 0;

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for (Artikl x : a) {
            if (x == null) break;
            suma = suma + x.getCijena();
        }
        return suma;
    }


    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl izbacena = null;
        int index = 0;
        for (Artikl h : a) {
            if (Objects.equals(h.getKod(), kod)) {
                for (int j = index; j < a.length - 1; j++) {
                    a[j] = a[j + 1];
                    i--;
                }
                izbacena = h;
                break;
            }
            index = index + 1;
        }
        // a = Arrays.stream(this.a).filter((x) -> (x.getKod()).equals(kod)).toArray();
        if (izbacena != null) return izbacena;

        return null;
    }

    public Artikl[] getArtikli() {
        return a;
    }

    public boolean dodajArtikl(Artikl k) {
        if (i > 50) return false;
        else a[i] = k;
        i++;
        return true;
    }

}
