public void aggiungiFornitoreArticolo(com.depvin.pps.business.ArticoloMagazzino articoloMagazzino, java.lang.String nomeFornitore) {
    com.depvin.pps.business.Fornitore fornitore = new com.depvin.pps.business.Fornitore(nomeFornitore);
    com.depvin.pps.business.Sistema.getInstance().aggiungiFornitoreArticolo(articoloMagazzino, fornitore);
}