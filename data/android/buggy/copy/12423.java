@java.lang.Override
public void awakAtNight() {
    java.lang.String p = playerChoose("Would you like to kill someone");
    pl.giveResponse(this, ("n " + p));
    java.lang.System.out.println(p);
}