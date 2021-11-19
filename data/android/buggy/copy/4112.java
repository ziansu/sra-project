private void Label(java.lang.String name) {
    java.lang.String body = file.nextLine();
    body = name + body;
    labellist.add(new model.Label(name, utility.InstructionParser.lineCounter));
}