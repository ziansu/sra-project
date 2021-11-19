@org.junit.Test
public void validate() throws java.io.IOException {
    org.talend.components.dataprep.DataPrepConnectionHandler connectionHandler = new org.talend.components.dataprep.DataPrepConnectionHandler(org.talend.components.dataprep.TDataPrepConnectionHandlerTest.URL, org.talend.components.dataprep.TDataPrepConnectionHandlerTest.LOGIN, org.talend.components.dataprep.TDataPrepConnectionHandlerTest.PASS, "sldfjsl");
    connectionHandler.validate();
}