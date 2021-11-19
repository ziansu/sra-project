private void zieheMitKI() {
    spielstandAnzeigen();
    java.util.List<ConsoleUI.Zug> zuege = _spiel.getMoeglicheZuege();
    _spiel.zieheKI();
}