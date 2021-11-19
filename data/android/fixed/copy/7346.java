public void setModAtaque(int arma) {
    if (arma < 0) {
        this.modAtaque = 0;
    }else
        if (arma > 100) {
            this.modAtaque = 100;
        }else {
            this.modAtaque = arma;
        }
    
}