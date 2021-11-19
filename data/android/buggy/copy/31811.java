public void begin(int selectedIndex) {
    window = new com.team1ofus.hermes.HermesUI();
    window.humanInteractive.addListener(this);
    window.initialize(allCells.get(selectedIndex));
}