@java.lang.Override
public int compareTo(test.unitTesting.DS o) {
    java.lang.Double oD = new java.lang.Double(o.TFIDFScore);
    java.lang.Double thisD = new java.lang.Double(this.TFIDFScore);
    return thisD.compareTo(oD);
}