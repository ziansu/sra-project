private void chooseBracket() {
    btoolBar.setDisable(false);
    bracketPane = new BracketPane(selectedBracket);
    btoolBar.setPickOnBounds(false);
    displayPane(bracketPane);
}