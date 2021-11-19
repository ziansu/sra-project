public com.company.Place addJanitor() {
    com.company.Place janitor = new com.company.Place(4, "Janitor's", "This is your school janitor's house. It feels creepy somehow", "JN");
    java.util.Collections.addAll(janitor.getAccessTo(), "Home", "ClassB");
    janitor.setItems();
    return janitor;
}