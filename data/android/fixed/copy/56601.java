@java.lang.Override
public java.lang.String getFax() {
    if (com.silverpeas.util.StringUtil.isDefined(fax)) {
        return fax;
    }else
        if ((getUserFull()) != null) {
            return getUserFull().getValue("fax");
        }else {
            return null;
        }
    
}