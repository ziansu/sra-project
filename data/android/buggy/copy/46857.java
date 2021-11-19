@java.lang.Override
public int compareTo(entities.Job other) {
    return (this.jobPriority) == (other.jobPriority) ? ((int) ((this.jobID) - (other.jobID))) : (this.jobPriority) - (other.jobPriority);
}