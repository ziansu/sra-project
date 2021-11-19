public void setKursevi(java.util.LinkedList<menjacnica.Kurs> kursevi) {
    if ((kursevi == null) || (kursevi.isEmpty()))
        throw new java.lang.RuntimeException("Greska! Kursevi moraju biti uneti!");
    
    this.kursevi = kursevi;
}