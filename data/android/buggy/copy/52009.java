@org.springframework.web.bind.annotation.RequestMapping(value = "/tasks/new", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String addTask(pl.edu.uj.fais.wpz.msom.entities.Task task, java.lang.Long taskTypeId) {
    pl.edu.uj.fais.wpz.msom.entities.TaskType taskType = taskTypeDao.find(taskTypeId);
    task.setTaskType(taskType);
    taskDao.add(task);
    return "redirect:/tasks";
}