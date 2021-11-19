public void setSimpleMode(boolean val) throws java.lang.UnsupportedOperationException {
    if (val == true)
        normalMode = false;
    else
        throw new java.lang.UnsupportedOperationException(ZLocalization.loc.getString("ds.z.DefaultEvacuationFloor.SwitchToNormalModeException"));
    
}