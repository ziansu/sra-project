@java.lang.Override
public void windowClosed(java.awt.event.WindowEvent e) {
    java.lang.System.out.println("closed");
    firstNameBox.setItems(agency.getAllFirstNames());
    lastNameBox.setItems(agency.getAllLastNames());
    chauffeurIdBox.setItems(agency.getAllChauffeurIds());
}