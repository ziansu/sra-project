@java.lang.Override
public void set(csc426.Value value) throws csc426.ValueError {
    if (value instanceof csc426.Value.IntValue) {
        this.value = ((csc426.Value.IntValue) (value));
    }else {
        throw new csc426.ValueError("Type mismatch: expected an integer");
    }
}