public void startUp() {
    boolean filesExist = checkIfFilesExist();
    if (filesExist == false)
        createDataFiles();
    
    generateCards();
    if (edu.miracosta.comm106.gauntlet.Gauntlet_Cards.totalCards.isEmpty())
        javax.swing.JOptionPane.showMessageDialog(panel, "No physical cards!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    
}