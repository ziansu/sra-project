@java.lang.Override
public final void load(com.google.gson.JsonObject json) {
    checked = json.get(name).getAsBoolean();
}