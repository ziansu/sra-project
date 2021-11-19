private void serializeStep(final ie.headway.app.xml.step.Step step) {
    final ie.headway.app.xml.step.PortableStep contextualisedStep = ie.headway.app.xml.step.StepUtils.contextualiseStep(mTask, step, false);
    mTask.addStep(contextualisedStep);
    ie.headway.app.htdi__companion.gui.TaskCreatorActivity.TASK_SERIALIZER.write(mTask);
}