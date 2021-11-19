@java.lang.Override
public void setIsParentModifying(boolean isParentModifying) {
    if (!(isLoadOk()))
        return ;
    
    if ((getTabLevel()) > 0) {
        super.setIsParentModifying(isParentModifying);
    }else {
        super.setIsParentModifying(false);
    }
}