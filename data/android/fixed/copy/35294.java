@android.support.annotation.Nullable
@java.lang.Override
public io.skygear.plugins.chat.Conversation convert(io.skygear.skygear.Record record) {
    return new io.skygear.plugins.chat.Conversation(record);
}