@java.lang.Override
public com.qubole.qds.sdk.java.api.CreateScheduleCommandBuilder frequency(int frequency) {
    node.putPOJO("frequency", frequency);
    return this;
}