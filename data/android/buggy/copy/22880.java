public java.lang.String getCrimeScene() {
    java.lang.String[] options = ((java.lang.String[]) (game.allRoomNames().toArray()));
    return view.guessDialog("Choose a room", "Scene of the crime?", options);
}