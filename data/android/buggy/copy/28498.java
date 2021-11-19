public boolean active(boolean rs) {
    return (((mode) & 4) == 0) || (rs ^ (((mode) & 8) != 0));
}