@java.lang.Override
protected org.apache.commons.cli.Options getOptions() {
    org.apache.commons.cli.Options opts = new org.apache.commons.cli.Options();
    opts.addOption("t", "type", true, "Map type [default: openstreetmap|osm, googlemaps|google]");
    return null;
}