public boolean judgeSpinnerSelected(com.inoueken.handspinner.Handspinner spinner) {
    if (spinner.getMetadata().getId().equals(_selectedSpinner.getMetadata().getId()))
        return false;
    else
        return true;
    
}