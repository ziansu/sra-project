public void downPressed() {
    (selectedOption)++;
    if ((selectedOption) <= (-1))
        selectedOption = (options.size()) - 1;
    
    selectedOption = java.lang.Math.abs(selectedOption);
}