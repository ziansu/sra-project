public final nez.debugger.DebugVMInstruction opIchar(nez.debugger.Ichar inst) {
    if ((this.byteAt(this.pos)) == (inst.byteChar)) {
        this.consume(1);
        return inst.next;
    }
    return inst.jump;
}