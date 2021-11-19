@java.lang.Override
public org.springframework.data.domain.Page<model.assessment.AssessmentTask> getCategoryTasks(long categoryId, org.springframework.data.domain.Pageable pageable) {
    return taskDAO.getByCategoryId(categoryId, pageable);
}