public void actionPerformed(java.awt.event.ActionEvent event) {
    if ((movieIdChosen) != null) {
        int id = java.lang.Integer.parseInt(movieIdChosen);
        removeView(panel, scroll);
        createView(movieController.addClientMovieHistoricRows(id), generateClientDateTitleRow());
    }
}