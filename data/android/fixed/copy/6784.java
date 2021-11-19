@org.junit.Before
public void setUp() throws java.lang.Exception {
    indicator = new hu.oe.nik.szfmv17t.automatedcar.hmi.DirectionIndicator();
    steeringWheel = new hu.oe.nik.szfmv17t.automatedcar.hmi.SteeringWheel(indicator);
}