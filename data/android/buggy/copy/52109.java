protected void afterHookedMethod(mobi.acpm.inspeckage.hooks.MethodHookParam param) throws java.lang.Throwable {
    mobi.acpm.inspeckage.hooks.CryptoHook.sb.append((" IV:" + ((java.lang.String) (param.getResult()))));
}