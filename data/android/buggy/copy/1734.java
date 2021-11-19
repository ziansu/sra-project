public void actionPerformed(java.awt.event.ActionEvent evt) {
    clockTick = 0;
    clockTime = ((double) (clockTick)) / 10.0;
    timeString = new java.lang.Double(clockTime).toString(1.0);
    displayTime.setText(timeString);
}