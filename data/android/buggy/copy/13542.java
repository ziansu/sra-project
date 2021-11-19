public void setName(java.lang.String _name) {
    if ((_name != null) && (_name != "")) {
        name = _name;
        hasName = true;
    }else {
        hasName = false;
        buildName();
    }
}