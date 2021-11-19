@java.lang.Override
public void concat(gov.nist.toolkit.errorrecording.ErrorRecorder er) {
    errMsgs.addAll(er.getErrMsgs());
}