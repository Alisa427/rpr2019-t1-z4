package ba.unsa.etf.rpr;

public class Artikl {
    int cijena;
    String naziv = new String();
    String kod = new String();

    public Artikl(String n, int c, String k) {
        cijena = c;
        naziv = n;
        kod = k;
    }

    public int getCijena() {
        return cijena;
    }

    public String getKod() {
        return kod;
    }

    public String getNaziv() {
        return naziv;
    }

}
