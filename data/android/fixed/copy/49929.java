@java.lang.Override
public android.support.v4.content.Loader<ru.codingworkshop.gymm.data.model.ProgramTraining> onCreateLoader(int id, android.os.Bundle args) {
    return new ru.codingworkshop.gymm.program.activity.training.TrainingAsyncLoader(this, id, args);
}