@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    songQueue.add(0, songQueue.remove(queuelist.getSelectedIndex()));
    refreshQueue();
}