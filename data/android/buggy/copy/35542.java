@org.junit.Test(expected = joptsimple.OptionException.class)
public void testEmpty() {
    testRead("", org.zavodnikov.cli.JOptSimple.cli("-r"));
}