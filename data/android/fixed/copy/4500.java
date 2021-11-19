public de.codeshelf.consoleui.prompt.PromptBuilder addPrompt() {
    de.codeshelf.consoleui.prompt.ListChoice listChoice = new de.codeshelf.consoleui.prompt.ListChoice(message, name, itemList);
    promptBuilder.addPrompt(listChoice);
    return promptBuilder;
}