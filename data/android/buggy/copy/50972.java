@java.lang.Override
public int compareTo(dijkstra.priority.PriorityObject o) {
    if ((priority) < (o.priority)) {
        return -1;
    }else
        if ((priority) > (o.priority)) {
            return +1;
        }else {
            return 0;
        }
    
}