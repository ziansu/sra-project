@Optional.Method(modid = "OpenComputers")
public static void initOC() {
    li.cil.oc.api.Driver.add(new com.brandon3055.draconicevolution.integration.computers.CCOCIntegration.OCAdapter());
}