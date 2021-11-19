@java.lang.Override
public void setProgrammingLanguageForControlGraphComputation(org.openflexo.toolbox.ProgrammingLanguage language) {
    if ((getExecution()) != null) {
        getExecution().setProgrammingLanguage(language);
    }
}