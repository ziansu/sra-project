@java.lang.Override
public boolean accept(ccl.v2_1.cat.CclCodeBlock infos) {
    if (infos.getKeyword().equals("if")) {
        return true;
    }
    return false;
}