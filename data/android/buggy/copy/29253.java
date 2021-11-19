@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        removeRowContainingTheWord(text);
    } catch (java.lang.ClassNotFoundException | java.lang.InstantiationException | java.lang.IllegalAccessException ex) {
        list.sendErrorToParent(ex);
    }
}