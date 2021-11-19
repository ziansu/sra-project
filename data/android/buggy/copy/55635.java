private void addEvent() {
    try {
        model.addEvent(getEventFromForm());
    } catch (java.sql.SQLException e) {
        javax.swing.JOptionPane.showMessageDialog(view, "Nie udalo sie dodac wydarzenia.");
        java.lang.System.err.println(e.getMessage());
    }
}