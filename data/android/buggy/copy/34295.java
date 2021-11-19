protected void updateNextIdForId(java.lang.String id) {
    try {
        int idAsInt = java.lang.Integer.parseInt(id);
        if ((this.nextId) < idAsInt) {
            this.nextId = idAsInt + 1;
        }
    } catch (java.lang.Exception ignored) {
    }
}