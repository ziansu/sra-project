@org.springframework.web.bind.annotation.RequestMapping(value = "{datasetDefinitionName}/schema", method = org.springframework.web.bind.annotation.RequestMethod.POST)
java.lang.String getDatasetSchema(@org.springframework.web.bind.annotation.PathVariable(value = "datasetDefinitionName")
java.lang.String datasetDefinitionName, java.io.InputStream formData) throws java.io.IOException;