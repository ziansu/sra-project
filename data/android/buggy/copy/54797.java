public void run() {
    if (!(gameIsActive))
        openMainMenu();
    else
        new com.example.yosef.finalproject.GameScreen.refresh().execute();
    
}