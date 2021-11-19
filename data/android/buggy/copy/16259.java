public void setIsActive() {
    if (!(getCurrentCharacter().isNPC())) {
        isActive = true;
    }else {
        isActive = false;
    }
}