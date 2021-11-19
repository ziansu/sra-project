@org.junit.Test
public void testDrivesForBackup() {
    javax.swing.JFrame jFrame = new javax.swing.JFrame();
    engine.BackupEngine backupEngine = new engine.BackupEngine(jFrame, true);
    backupEngine.startEngine();
}