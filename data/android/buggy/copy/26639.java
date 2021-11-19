private void endTurn() {
    characterTurn = (((characterTurn)++) % (characterList.size())) + 1;
}