public void setPoruka(java.lang.String poruka) {
    if ((poruka == null) || ((this.poruka.length()) > 140))
        throw new java.lang.RuntimeException("Poruka mora biti uneta i mora imati najvise 140 znakova");
    
    this.poruka = poruka;
}