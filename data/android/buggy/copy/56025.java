@java.lang.Override
public boolean isValid() {
    if ((((waterOverallCondition) != null) && ((virusPPM) != null)) && ((contaminantPPM) != null)) {
        return true;
    }
    return false;
}