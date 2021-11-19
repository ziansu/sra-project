@java.lang.Override
public void registerGeppettoService() {
    java.util.List<org.geppetto.core.services.IModelFormat> modelFormatList = new java.util.ArrayList<org.geppetto.core.services.IModelFormat>();
    modelFormatList.add(ModelFormat.LEMS);
    org.geppetto.core.services.registry.ServicesRegistry.registerModelInterpreterService(this, modelFormatList);
}