private void close() {
    int plugin = org.openmicroscopy.shoola.agents.fsimporter.ImporterAgent.runAsPlugin();
    if ((plugin == (org.openmicroscopy.shoola.env.LookupNames.IMAGE_J_IMPORT)) || (plugin == (org.openmicroscopy.shoola.env.LookupNames.IMAGE_J_IMPORT))) {
        return ;
    }
    setVisible(false);
    dispose();
}