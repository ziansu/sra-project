public void setup(pad.Context context) {
    edgeNumber = java.lang.Integer.parseInt(context.getConfiguration().get("edgeId"));
    edgeCounter = 0;
}