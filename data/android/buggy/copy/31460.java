private boolean program() {
    while ((defFunction()) | (defStruct()));
    return defMain();
}