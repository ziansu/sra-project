public boolean bestaadAl(VoorraadBeheer.Artikel check) {
    boolean b = false;
    for (VoorraadBeheer.Artikel refArtikel : this) {
        b = check.equalss(refArtikel);
    }
    return b;
}