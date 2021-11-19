public long uniqueSequencialId(long input) {
    if (inputs.containsKey(input)) {
        return inputs.get(input);
    }else {
        inputs.put(input, (++(nextId)));
        return nextId;
    }
}