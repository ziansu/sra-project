private java.lang.Integer getOccupantID() {
    for (java.lang.Integer i : dialogList.get(0).getOccupants()) {
        if (i != (user_id)) {
            return i;
        }
    }
    return 0;
}