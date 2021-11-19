public se.kth.iv1350.model.Inspection getNextInspection() {
    try {
        return inspections[((currentIndex)++)];
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
        return null;
    }
}