public final void run(org.glob3.mobile.generated.G3MContext context) {
    _task.onPostExecute(context);
    if (_autodelete) {
        if ((_task) != null)
            _task.dispose();
        
    }
}