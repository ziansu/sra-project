@java.lang.Override
public java.lang.String getPreviousViewName() {
    if (viewList.isEmpty()) {
        return "";
    }
    return viewList.get(((viewList.size()) - 2));
}