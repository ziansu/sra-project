public void windowClosing(java.awt.event.WindowEvent e) {
    if (((repo) != null) && (repo.exists()))
        repo.close();
    
}