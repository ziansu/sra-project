public int getComputerCardNumber() {
    for (int i = 0; i < 26; i++) {
        if ((fieldDeck[0][i]) == null) {
            return i;
        }
    }
    return 0;
}