@java.lang.Override
public java.lang.Void visit(ast.form.Form form) {
    for (ast.question.Question q : form.getQuestionText())
        q.accept(this);
    
    this.errorCollector.addError("Testing my awesome JDialog and arraylist");
    return null;
}