@org.junit.runners.Parameterized.Parameters(name = "{0}")
public static java.util.List<java.lang.String> recordFormats() {
    return java.util.Arrays.asList(Standard.LATEST_NAME, HighLimit.NAME);
}