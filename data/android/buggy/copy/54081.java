@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    lesson.addCard(new util.Card());
    editor.open(lesson.getCurrentCard().getSideNumber(currentSide));
}