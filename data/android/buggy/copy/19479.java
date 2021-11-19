private void menuToDisplay(java.lang.String textToDisplay1, java.lang.String textToDisplay2, java.lang.String textToDisplay3) {
    int frame = 0;
    GUI_Matrix_Helper.clrDisplay();
    drawFocusLine(textToDisplay2.length());
    GUI_Matrix_Helper.stringToMatrix(textToDisplay(textToDisplay1, textToDisplay2, textToDisplay3));
}