@java.lang.Override
protected void neustart() {
    java.lang.System.out.println("neustart");
    zustandNr = 0;
    vertaucheSchalter();
    textField.setText((((zustaende[zustandNr]) + ":") + ((zustaende.length) - (zustandNr))));
}