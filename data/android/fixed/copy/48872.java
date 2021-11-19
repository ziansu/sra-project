@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    ui.Traffic_Simulator.window.trafficSimulatorFrame.setVisible(false);
    ui.Traffic_Simulator.window = new ui.Traffic_Simulator();
    ui.Traffic_Simulator.window.trafficSimulatorFrame.setVisible(true);
}