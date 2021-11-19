private boolean isAfterNotAfter() {
    java.util.Calendar today = java.util.Calendar.getInstance();
    if (today.after(certificate.getNotAfter())) {
        return true;
    }else {
        return false;
    }
}