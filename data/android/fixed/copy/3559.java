@java.lang.Override
public com.savoirtech.logging.slf4j.json.logger.JsonLogger append(com.savoirtech.logging.slf4j.json.logger.JsonLogger jsonLogger) {
    for (java.lang.String variableName : environmentVariableNames)
        uk.co.mruoc.log.EnvironmentVariableAppender.append(jsonLogger, variableName);
    
    return jsonLogger;
}