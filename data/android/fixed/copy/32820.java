private void actionReset(java.awt.event.ActionEvent e) {
    if ((e.getSource()) == (resetbut)) {
        fpu.reset();
        reset_cmd();
    }
}