@java.lang.Override
public org.lexgrid.valuesets.LexEVSValueSetDefinitionServices getObject() throws java.lang.Exception {
    if ((this.lbs) instanceof org.LexGrid.LexBIG.caCore.interfaces.LexEVSApplicationService) {
        return ((org.LexGrid.LexBIG.caCore.interfaces.LexEVSApplicationService) (lbs)).getLexEVSValueSetDefinitionServices();
    }else {
        return org.lexgrid.valuesets.impl.LexEVSValueSetDefinitionServicesImpl.defaultInstance();
    }
}