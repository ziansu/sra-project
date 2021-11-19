@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    try {
        ba.unsa.etf.si.app.SIDEVS.View.Menadzer.DodajKupca dk = new ba.unsa.etf.si.app.SIDEVS.View.Menadzer.DodajKupca(s);
        dk.frmDodajKupca.setVisible(true);
    } catch (java.lang.Exception c) {
        ba.unsa.etf.si.app.SIDEVS.View.Menadzer.PocetniEkran.logger.error(c);
    }
}