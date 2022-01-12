public int size() {
    try {
        acquire();
        return instList.size();
    } finally {
        release();
    }
}