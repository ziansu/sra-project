public void executeJavascript(java.lang.String strJavascript) {
    {
        com.rho.BrowserField field = ((com.rho.BrowserField) (m_oMainScreen.getField(0)));
        field.executeScript(("javascript:" + strJavascript));
    }
}