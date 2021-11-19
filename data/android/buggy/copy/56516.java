public void setDOB(java.lang.String DOB) {
    if ((org.ucl.medicaldb.Patient.checker.completedObligatoryField(DOB)) && (!(org.ucl.medicaldb.Patient.checker.isDateinFuture(DOB)))) {
        this.DOB = DOB;
    }
}