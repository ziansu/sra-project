@java.lang.Override
public void start(org.osgi.framework.BundleContext bundleContext) throws java.lang.Exception {
    org.opentosca.planbuilder.provphase.plugin.wsdloperation.Activator.context = bundleContext;
    org.opentosca.planbuilder.provphase.plugin.wsdloperation.Activator.registration = org.opentosca.planbuilder.provphase.plugin.wsdloperation.Activator.context.registerService(org.opentosca.planbuilder.plugins.IPlanBuilderProvPhaseOperationPlugin.class.getName(), org.opentosca.planbuilder.provphase.plugin.wsdloperation.Activator.plugin, null);
}