public java.lang.String forDisplay() {
    if (((_label) != null) && (!(_label.isEmpty()))) {
        return java.lang.String.format("%s (%s)", _label, _id);
    }else {
        return _id.toString();
    }
}