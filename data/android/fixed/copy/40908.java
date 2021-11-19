@org.junit.Before
public void setUp() throws java.lang.Exception {
    setView = new GUI.SetView(null, null);
    set = new Interval.Set();
    setView.createSidePanel();
    setView.createInputFields();
    setView.displayInterval(set);
}