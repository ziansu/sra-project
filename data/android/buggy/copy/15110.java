@java.lang.Override
protected boolean isValid(java.io.File path) {
    try {
        de.uni.freiburg.iig.telematik.swat.workbench.dialog.LolaPathValidater.validate(path);
    } catch (de.invation.code.toval.validate.ParameterException e) {
        return false;
    } catch (java.io.IOException e) {
        return false;
    }
    return true;
}