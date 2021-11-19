@javafx.fxml.FXML
void parseFileByTikaChk() {
    props.saveToPropertiesFile("PARSE_FILE_BY_TIKA", java.lang.String.valueOf(PARSE_FILE_BY_TIKA.isSelected()));
}