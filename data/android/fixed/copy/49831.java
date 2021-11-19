@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent e) {
    AddTourFrame frame = ((AddTourFrame) (e.getSource()));
    Travel result = frame.getResultTour();
    if (result != null)
        agency.addTravel(result);
    
}