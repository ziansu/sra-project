public static com.waterball.life_simulator2.User.LevelManager getLevelManager(com.waterball.life_simulator2.User.User user) {
    if ((com.waterball.life_simulator2.User.LevelManager.levelManager) == null)
        com.waterball.life_simulator2.User.LevelManager.levelManager = new com.waterball.life_simulator2.User.LevelManager(user);
    
    return com.waterball.life_simulator2.User.LevelManager.levelManager;
}