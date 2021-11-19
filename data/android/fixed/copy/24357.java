public com.voodoodyne.hattery.HttpRequest param(final com.voodoodyne.hattery.Param... params) {
    com.voodoodyne.hattery.HttpRequest here = this;
    for (com.voodoodyne.hattery.Param param : params)
        here = here.paramAnything(param.getName(), param.getValue());
    
    return here;
}