public void flinch() {
    stop();
    flinchTimer = flinchDelay;
    invincibleTimer = invincibleDelay;
    flinchInvincible = true;
    setState(MovableState.FLINCH);
    java.lang.System.out.println(("Flinch! " + (getName())));
}