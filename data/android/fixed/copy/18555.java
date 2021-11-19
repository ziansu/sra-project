@java.lang.Override
public boolean accept(ccl.v2_1.cat.CclCodeBlock infos) {
    if ((infos.getKeyword()) == null)
        return false;
    
    return infos.getKeyword().equals("native");
}