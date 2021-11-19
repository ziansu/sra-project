@org.rstudio.core.client.command.Handler
void onInsertChunkBash() {
    onInsertChunk("```{bash}\n\n```\n", 1, 0);
}