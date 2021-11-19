public static com.andela.motustracker.manager.CountDownManager getInstance() {
    if ((com.andela.motustracker.manager.CountDownManager.countDownManager) == null) {
        com.andela.motustracker.manager.CountDownManager.countDownManager = new com.andela.motustracker.manager.CountDownManager();
    }
    return com.andela.motustracker.manager.CountDownManager.countDownManager;
}