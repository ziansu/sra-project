@java.lang.Override
public java.lang.String getDisplayName() {
    if ((super.getDisplayName().length()) > 15)
        return super.getDisplayName().substring(0, 15).concat("...");
    else
        return super.getDisplayName();
    
}