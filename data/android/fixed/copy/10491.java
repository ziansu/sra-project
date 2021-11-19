static parsers.MainState setError(parsers.StateMachine machine, parsers.MainError error) {
    machine.error = error;
    return machine.state;
}