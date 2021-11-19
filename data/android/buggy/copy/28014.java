@java.lang.Override
public void searchBegin(com.project.faith.eightpuzzle.GameAI.GameAIProperties gameAIProperties) {
    if (!(GridTemplate.GameStateDone))
        this.grid.spaceTile.getActions(gameAIProperties);
    
}