protected void setControllerHeading(int heading, de.aw.atcc.aircraft.FlightDirection direction) {
    mAircraft.setTargetHeading(heading, direction);
    moveModus = de.aw.atcc.views.PilotView.MoveModus.Controller;
}