public static double GetZComponent(java.lang.String sMarker) {
    eng.eval((("Position = RBPosition(" + sMarker) + ", Client)"));
    eng.eval("z = Position(3)");
    double zComp = eng.getVariable("z");
    return zComp;
}