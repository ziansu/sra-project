@java.lang.Override
public void write(org.jtrfp.jfdt.EndianAwareDataOutputStream os, org.jtrfp.jfdt.ThirdPartyParseable bean) throws java.io.IOException {
    os.writeInt(((int) ((dest.get(bean)) + (java.lang.Integer.MIN_VALUE))));
}