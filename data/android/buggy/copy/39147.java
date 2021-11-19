@org.junit.Before
public void SetUp() {
    t1 = new fontys.time.Time(2014, 10, 10, 20, 20);
    t2 = new fontys.time.Time(2015, 5, 5, 5, 10);
    tsTest = new fontys.time.TimeSpan(t1, t2);
}