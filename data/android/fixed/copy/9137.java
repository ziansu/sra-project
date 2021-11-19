public void create(java.lang.String name, java.lang.String mode) {
    com.getknowledge.modules.dictionaries.programming.languages.ProgrammingLanguage programmingLanguage = new com.getknowledge.modules.dictionaries.programming.languages.ProgrammingLanguage();
    programmingLanguage.setName(name);
    programmingLanguage.setMode(mode);
    create(programmingLanguage);
}