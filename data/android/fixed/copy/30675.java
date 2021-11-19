public void addAbsence(de.sp.database.model.Absence absence) {
    if (!(absences.contains(absence))) {
        absences.add(absence);
    }
}