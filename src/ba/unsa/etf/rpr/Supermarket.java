package ba.unsa.etf.rpr;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Supermarket {
    Artikl[] p = new Artikl[1000];
    int i = 0;

    void dodajArtikl(Artikl a) {
        if(i<0) i =20;
        p[i] = a;
        i++;
    }

    public Artikl[] getArtikli() {
        return p;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl izbacena = null;
        int index = 0;
        for (Artikl h : p) {
            if (Objects.equals(h.getKod(), kod)) {
                for (int j = index; j < p.length - 1; j++) {
                    p[j] = p[j + 1];
                    i--;
                }
                izbacena = h;
                break;
            }
            index++;
        }

        // a = Arrays.stream(this.a).filter((x) -> (x.getKod()).equals(kod)).toArray();
        if (izbacena != null) return izbacena;

        return null;
    }
}
