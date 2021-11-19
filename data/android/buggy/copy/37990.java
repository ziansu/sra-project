public void run() {
    if (name.equals("Musique")) {
        SoundPlayer leia = new SoundPlayer("res/sound/LaChevaucheeDesValkyries.wav");
        leia.start();
    }else {
        PageAccueil p = new PageAccueil();
    }
}