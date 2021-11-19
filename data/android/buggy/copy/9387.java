@java.lang.Override
public java.lang.Void run() {
    final java.lang.String[] args = new java.lang.String[]{ "-xargs" , getAbsolutePath("props.xargs") , "-xargs" , getAbsolutePath("init.xargs") };
    org.knopflerfish.framework.Main.main(args);
    return null;
}