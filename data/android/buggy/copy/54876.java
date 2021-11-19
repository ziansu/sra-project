@java.lang.Override
public void thumbsDown() {
    validateRadioState();
    pandoraRadio.rate(station, song, false);
    next();
}