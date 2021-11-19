@java.lang.Override
public void accept(com.gmail.socraticphoenix.jaisbal.program.function.FunctionContext context) throws com.gmail.socraticphoenix.jaisbal.app.util.JAISBaLExecutionException, java.io.IOException {
    this.validate(context.getStack(), context);
    this.consumer.accept(context);
}