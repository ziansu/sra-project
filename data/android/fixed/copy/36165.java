@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (drawingBoard.isSimulationPlaying()) {
        simEngine.Pause();
        drawingBoard.setSimulationPlaying(false);
    }
}