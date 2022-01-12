private void actionButtonEditForToolBar() {
    noteEditFrame.dispose();
    com.leofesk.quicktodomanager.controller.DataBaseWorker.addNoteToEditFrame();
    noteEditFrame.setVisible(true);
}