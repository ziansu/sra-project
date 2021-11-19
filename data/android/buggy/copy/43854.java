public quality.gates.jenkins.plugin.GlobalConfigDataForSonarInstance validateData(quality.gates.jenkins.plugin.GlobalConfigDataForSonarInstance globalConfigDataForSonarInstance) {
    quality.gates.jenkins.plugin.GlobalConfigDataForSonarInstance newGlobalConfigDataForSonarInstance = new quality.gates.jenkins.plugin.GlobalConfigDataForSonarInstance(globalConfigDataForSonarInstance.getName(), validateUrl(globalConfigDataForSonarInstance), validateUsername(globalConfigDataForSonarInstance), validatePassword(globalConfigDataForSonarInstance));
    return newGlobalConfigDataForSonarInstance;
}