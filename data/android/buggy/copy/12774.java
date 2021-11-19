@java.lang.SuppressWarnings(value = "All")
@java.lang.Override
public void setNegationContext(org.sifrproject.annotations.api.model.context.NegationContext negationContext) {
    this.negationContext = negationContext;
    jsonObject.add("negationContext", negationContext.toString());
}