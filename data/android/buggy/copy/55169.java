@java.lang.Override
public void signalPreExit() {
    if (((profilingWindow) != null) && (profilingWindow.isShowing())) {
        uk.co.modularaudio.componentdesigner.mainframe.actions.WindowShowProfilingAction.log.debug("Received exit signal - will close profiling window");
        profilingWindow.dispose();
    }
}