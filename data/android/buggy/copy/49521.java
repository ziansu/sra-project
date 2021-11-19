public void setCountFile(int value) {
    countFileToEncrypt = value;
    labProgressCount.setText(java.lang.String.valueOf(countFileToEncrypt));
    setInfoText(("� ��������... �������� ������: " + (countFileToEncrypt)));
}