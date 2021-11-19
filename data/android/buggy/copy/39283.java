public void setParentGroup(io.github.pdkst.addtionview.support.task.TaskGroup parentGroup) {
    this.parentGroup = parentGroup;
    parentGroup.add(this);
}