public int count() {
    synchronized(this) {
        if ((inbox) == null) {
            return 0;
        }
        return inbox.size();
    }
}