@Optional.Method(modid = "OpenComputers")
public static void initOC() {
    com.brandon3055.draconicevolution.utils.LogHelper.info("Init OC");
    li.cil.oc.api.Driver.add(new com.brandon3055.draconicevolution.integration.computers.CCOCIntegration.OCAdapter());
}