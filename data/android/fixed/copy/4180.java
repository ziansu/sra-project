public void start() {
    switch (this.type) {
        case BUKKIT :
            startBukkit();
            break;
        default :
            startUniversal();
    }
}