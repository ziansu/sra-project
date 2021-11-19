public void displayAvailable(comp110.Employee e) {
    _currentEmployee = e;
    renderAvailabilityStage(e);
    _availabilityStage.show();
    _passwordStage.close();
}