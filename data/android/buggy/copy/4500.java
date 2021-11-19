public de.codeshelf.consoleui.prompt.PromptBuilder addPrompt() {
    de.codeshelf.consoleui.prompt.ListChoice listChoice = new de.codeshelf.consoleui.prompt.ListChoice(name, message, itemList);
    promptBuilder.addPrompt(listChoice);
    return promptBuilder;
}