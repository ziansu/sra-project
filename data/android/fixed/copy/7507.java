private void addOrUpdatePray() {
    switch (anaMode(counter.name)) {
        case ADD :
            addPray();
            break;
        case UPDATE :
            dbCounter.updatePray();
            break;
        default :
            break;
    }
}