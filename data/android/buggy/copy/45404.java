public static void undoCommand() {
    if (!(de.htwg.util.command.UndoManager.undoStack.empty())) {
        de.htwg.util.command.UndoManager.topCommand = de.htwg.util.command.UndoManager.undoStack.pop();
        de.htwg.util.command.UndoManager.topCommand.undoCommand();
    }
}