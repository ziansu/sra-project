public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((ChronoTimer.isOn) == true) {
        if ((ChronoTimer.current) != null) {
            display.setText(ChronoTimer.current.doPrint());
        }
    }
}