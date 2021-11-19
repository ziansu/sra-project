public java.util.Date getDueDate() {
    if ((cta.getDueDate()) != null) {
        return cta.getDueDate().toDate();
    }else {
        return null;
    }
}