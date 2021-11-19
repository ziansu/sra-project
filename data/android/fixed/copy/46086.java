public boolean equals(java.lang.Object o) {
    if (o instanceof com.turboocelots.oasis.models.Reporter) {
        com.turboocelots.oasis.models.Reporter r = ((com.turboocelots.oasis.models.Reporter) (o));
        return r.getUsername().equals(_username);
    }else {
        return false;
    }
}