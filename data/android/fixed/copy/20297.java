public void setAdsr(int attack, int decay, int sustain, int release) {
    org.puredata.core.PdBase.sendList("soundfount", "adsr", attack, decay, sustain, release);
}