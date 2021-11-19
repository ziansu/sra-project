@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    listModel.clear();
    for (Node<Post> np : previousContext.getParent().getChildren()) {
        listModel.addElement(np);
    }
    previousContext = previousContext.getParent();
}