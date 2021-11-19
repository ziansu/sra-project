@javax.xml.bind.annotation.XmlTransient
@java.lang.Override
public void checkAndSetSettings(S... settings) throws de.metanome.algorithm_integration.AlgorithmConfigurationException {
    de.metanome.algorithm_integration.configuration.ConfigurationRequirementDefaultValue.checkNumberOfSettings(settings.length);
    this.settings = settings;
    applyDefaultValues();
}