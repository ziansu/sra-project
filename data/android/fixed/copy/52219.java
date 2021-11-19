public void sortTasks(java.util.List<sg.edu.nus.cs2103t.omnitask.model.Task> tasks) {
    java.util.Collections.sort(tasks, new java.util.Comparator<sg.edu.nus.cs2103t.omnitask.model.Task>() {
        public int compare(sg.edu.nus.cs2103t.omnitask.model.Task t1, sg.edu.nus.cs2103t.omnitask.model.Task t2) {
            return taskSorterComparator(t1, t2);
        }
    });
}