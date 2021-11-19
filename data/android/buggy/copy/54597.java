public void run() {
    if (name.equals("Musique")) {
        sound.SoundPlayer leia = new sound.SoundPlayer("res/sound/LaChevaucheeDesValkyries.wav");
        leia.start();
    }else {
        new graph.PageAccueil();
    }
}