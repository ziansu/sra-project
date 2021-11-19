@java.lang.Override
public int compare(com.project.ai.main.PMPIBayesianNetwork.Player arg0, com.project.ai.main.PMPIBayesianNetwork.Player arg1) {
    if ((arg0.score) > (arg1.score))
        return 1;
    else
        if ((arg0.score) < (arg1.score))
            return -1;
        else
            return 0;
        
    
}