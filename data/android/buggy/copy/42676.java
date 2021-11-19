public void windowClosing(java.awt.event.WindowEvent e) {
    if (agreedCalling)
        playRingtone(false);
    
    releaseMemory();
}