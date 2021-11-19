public void initializeArray(java.lang.Character[] array) {
    for (int i = 0; i < (array.length); i++) {
        array[i] = new java.lang.Character(randomXCoord(), randomYCoord());
    }
}