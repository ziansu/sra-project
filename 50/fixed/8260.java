public java.math.BigDecimal calculateAverage(org.fenixedu.academic.domain.student.curriculum.Curriculum curriculum) {
    if ((sumPiCi) == null) {
        doCalculus(curriculum);
    }
    return calculateAverage();
}