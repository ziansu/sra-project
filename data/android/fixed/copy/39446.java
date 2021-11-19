private br.eti.kinoshita.testlinkjavaapi.constants.ExecutionStatus convertToExecutionStatus(java.lang.String status) {
    if (status.equals("PASS")) {
        return br.eti.kinoshita.testlinkjavaapi.constants.ExecutionStatus.PASSED;
    }else
        if (status.equals("FAIL")) {
            return br.eti.kinoshita.testlinkjavaapi.constants.ExecutionStatus.FAILED;
        }else {
            return br.eti.kinoshita.testlinkjavaapi.constants.ExecutionStatus.NOT_RUN;
        }
    
}