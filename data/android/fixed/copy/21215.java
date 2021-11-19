java.lang.String getTaskJSON(br.com.kdev.task.Task task) throws com.fasterxml.jackson.core.JsonProcessingException {
    return mapper.writeValueAsString(task);
}