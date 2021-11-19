@java.lang.Override
public void setIsParentModifying(boolean isParentModifying) {
    if (!(isLoadOk()))
        return ;
    
    if ((getTabLevel()) > 0) {
        setIsParentModifying(isParentModifying);
    }else {
        setIsParentModifying(false);
    }
}