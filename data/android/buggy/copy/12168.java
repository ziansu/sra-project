public org.motechproject.tasks.dto.TaskActivityDto toDto() {
    return new org.motechproject.tasks.dto.TaskActivityDto(message, task, fields, date, activityType, stackTraceElement, parameters);
}