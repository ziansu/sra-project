public void begin(int selectedIndex) {
    window = new com.team1ofus.hermes.HermesUI(allCells.get(selectedIndex));
    window.humanInteractive.addListener(this);
}