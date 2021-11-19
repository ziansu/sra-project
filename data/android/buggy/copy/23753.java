public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((i) > 100) {
        timer.stop();
        parent.executeTasks();
    }else
        parent.setProgBar_loading(((i)++));
    
}