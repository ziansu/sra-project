public static com.fangxu.allangleexpandablebutton.ButtonData buildTextButton(java.lang.String... text) {
    com.fangxu.allangleexpandablebutton.ButtonData buttonData = new com.fangxu.allangleexpandablebutton.ButtonData(false);
    buttonData.iconButton = false;
    buttonData.setTexts(text);
    return buttonData;
}