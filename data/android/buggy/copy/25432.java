private void checkClear() {
    if (((getContext().count_unit(1)) == 0) && ((getContext().count_castle(1)) == 0)) {
        getContext().clear();
    }
}