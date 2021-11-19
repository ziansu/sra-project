public boolean judgeSpinnerSelected(com.inoueken.handspinner.Handspinner spinner) {
    return !(spinner.getMetadata().getId().equals(_selectedSpinner.getMetadata().getId()));
}