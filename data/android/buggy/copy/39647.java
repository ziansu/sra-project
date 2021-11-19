@org.junit.Before
public void setUp() {
    this.instance = new xyz.meunier.wav2pzx.PZXPilotBlock(this.firstPulseLevel, this.newPulses, this.sync1Length, this.sync2Length);
}