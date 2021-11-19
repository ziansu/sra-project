@java.lang.Override
public boolean estVide() {
    boolean controle = false;
    if (((nbrCles) == 0) || ((this.cles.info()) == null)) {
        controle = true;
    }
    return controle;
}