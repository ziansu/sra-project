@org.xwalk.core.internal.XWalkAPI
public boolean saveState(android.os.Bundle outState) {
    if ((mContent) == null)
        return false;
    
    mContent.saveState(outState);
    return true;
}