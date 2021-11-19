public static data.GameData initGameData(java.lang.String inputFile) {
    data.GameData.readFile(inputFile);
    return data.GameData.currentGame;
}