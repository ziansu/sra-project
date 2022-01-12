@java.lang.Override
public void start() {
    super.start();
    org.procrastinationpatients.tts.core.Engine.getInstance().setProcessor(new org.procrastinationpatients.tts.core.Processor());
    org.procrastinationpatients.tts.core.Engine.getInstance().getProcessor().start();
    java.lang.System.out.println("Start!");
}