public static boolean isEnabled(final com.divae.ageto.hybris.install.task.TaskContext taskContext) {
    return ((boolean) (taskContext.getParameter(com.divae.ageto.hybris.install.task.DecompileTask.DECOMPILER)));
}