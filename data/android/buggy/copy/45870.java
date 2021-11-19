@butterknife.OnClick(value = R.id.medievalRB)
public void soundMedieval() {
    if (isPlaying()) {
        stop();
        playThisTone(R.raw.medieval);
    }else {
        playThisTone(R.raw.medieval);
    }
}