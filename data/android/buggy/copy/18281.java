@java.lang.Override
public java.lang.String evalAndCoerceToString(freemarker.core.Environment env) throws freemarker.template.TemplateException {
    return env.formatNumber(this, this);
}