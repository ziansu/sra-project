public void setHint(int number) {
    if ((secret) > number) {
        hint = "Sorry, your guess is too small.\n";
    }else {
        hint = "Sorry, you\'re guess is too large.\n";
    }
}