@java.lang.Override
public void onFinish() {
    this.end = true;
    java.lang.System.out.println("FINITO");
    java.io.File file = new java.io.File("/data/user/0/starklabs.sivodim/files/mergedAudio.wav");
    starklabs.sivodim.Drama.Model.Utilities.SpeechSound soundtrack = new starklabs.sivodim.Drama.Model.Utilities.SpeechSound(file.getAbsolutePath());
    soundtrack.play();
}