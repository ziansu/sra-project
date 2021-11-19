public void addAbsence(de.sp.database.model.Absence absence) {
    if ((absences) == null) {
        absences = new java.util.ArrayList<>();
    }
    if (!(absences.contains(absence))) {
        absences.add(absence);
    }
}