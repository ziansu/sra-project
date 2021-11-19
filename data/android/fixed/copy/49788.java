@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (!(testRun)) {
        startTest();
    }else {
        endTest();
    }
}