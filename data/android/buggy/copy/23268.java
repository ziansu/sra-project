private org.fenixedu.academic.domain.ExecutionSemester getOtherExecutionSemester(org.fenixedu.academic.domain.ExecutionSemester semester) {
    org.fenixedu.academic.domain.ExecutionSemester next = semester.getNextExecutionPeriod();
    return canViewNextExecutionSemester(next) ? next : semester.getPreviousExecutionPeriod();
}