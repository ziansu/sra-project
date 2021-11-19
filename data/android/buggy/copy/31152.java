public java.lang.String getIconFileName() {
    return (target.hasPermission(Job.BUILD)) && (this.target.isBuildable()) ? "/plugin/schedule-build/images/schedule.png" : null;
}