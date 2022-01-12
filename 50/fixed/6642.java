@java.lang.Override
public void initialize(java.net.URL url, java.util.ResourceBundle rb) {
    ner_first_arg.setItems(first_arg);
    FIRST_initilize_drag();
    initilize_drag(ner_relation);
    initilize_drag(ner_second_arg);
}