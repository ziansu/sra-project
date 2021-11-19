protected double getComboValue(int playerIndex) {
    if (playerIndex == 1) {
        return comboPlayer1;
    }else
        if (playerIndex == 2) {
            return comboPlayer2;
        }else {
            java.lang.System.err.println("Fehler! \nUnzul\ufffdssiger playerIndex. \n1 oder 2 erlaubt.");
            return 0.0;
        }
    
}