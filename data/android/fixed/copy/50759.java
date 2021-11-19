public java.util.List getSelectMessageTypeList() {
    if ((selectMessageTypeList.size()) == 0) {
        selectMessageTypeList.add("Select Message Type");
        selectMessageTypeList.add("Regular");
        selectMessageTypeList.add("Error");
    }
    return selectMessageTypeList;
}