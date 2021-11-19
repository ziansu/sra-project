private void previous() {
    int previous = (status.ordinal()) - 1;
    if (previous < 0) {
        ch.epfl.planair.Planair.become(ch.epfl.planair.mods.MenuMode.class);
    }else {
        toStep(previous);
    }
}