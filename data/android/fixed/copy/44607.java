@java.lang.Override
public java.lang.Void visit(ast.form.Form form) {
    for (ast.question.Question q : form.getQuestionText())
        q.accept(this);
    
    return null;
}