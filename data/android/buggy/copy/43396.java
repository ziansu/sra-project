public static void main(java.lang.String[] arguis) {
    timeCountingMachine.ShowFrame showFrame = new timeCountingMachine.ShowFrame();
    timeCountingMachine.ControlFrame ctrlFrame = new timeCountingMachine.ControlFrame();
    timeCountingMachine.FileManager.saveData();
    timeCountingMachine.Main.userData = timeCountingMachine.FileManager.loadUserData();
}