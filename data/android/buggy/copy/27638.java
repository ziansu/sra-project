public final void resume() {
    java.lang.System.out.println("Trying to resume execution …");
    synchronized(this) {
        this.mode = edu.kit.iti.formal.pse.worthwhile.debugger.model.WorthwhileDebugEventListener.DebugMode.DEBUG;
        notifyAll();
    }
}