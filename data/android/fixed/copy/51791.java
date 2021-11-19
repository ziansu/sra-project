public void upPressed() {
    (selectedOption)--;
    if ((selectedOption) <= (-1))
        selectedOption = (options.size()) - 1;
    
    selectedOption %= options.size();
}