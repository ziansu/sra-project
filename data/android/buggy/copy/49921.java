public static void saveAll() throws java.io.IOException {
    for (java.lang.String playerName : com.talesdev.talesz.thirst.Thirst.thirst.keySet()) {
        com.talesdev.talesz.thirst.Thirst.saveDataToDisk(playerName);
    }
}