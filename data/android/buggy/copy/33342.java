public static data.GameData initGameData(java.lang.String inputFile) {
    data.GameData.readFile(inputFile);
    java.lang.System.out.println(data.GameData.currentGame.weeksLeft());
    return data.GameData.currentGame;
}