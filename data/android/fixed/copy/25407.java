public static control.ControlSystemService getInstance() {
    if ((control.ControlSystemService.controlSystemService) == null)
        control.ControlSystemService.controlSystemService = new control.ControlSystemService();
    
    return control.ControlSystemService.controlSystemService;
}