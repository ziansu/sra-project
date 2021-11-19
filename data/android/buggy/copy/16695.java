@java.lang.Override
public boolean isColdFusionTag(java.lang.String tagName) {
    boolean isColdFusion = tagName.toLowerCase().startsWith("cf");
    java.lang.System.out.println(((("isColdFusionTag: " + tagName) + ":") + isColdFusion));
    return isColdFusion;
}