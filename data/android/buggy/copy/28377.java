@java.lang.Override
public w094j.ctrl8.pojo.Response exit(w094j.ctrl8.parse.statement.Statement statement) {
    w094j.ctrl8.pojo.Response res = new w094j.ctrl8.pojo.Response(statement.getCommand());
    res.reply = w094j.ctrl8.message.NormalMessage.EXIT_COMMAND;
    res.setContinueExecution(false);
    return res;
}