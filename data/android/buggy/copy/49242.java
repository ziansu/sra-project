public void add_reward(com.example.kgifaldi.taskstar.RewardClass reward_obj, java.util.ArrayList<com.example.kgifaldi.taskstar.Child> children_obj_list) {
    for (com.example.kgifaldi.taskstar.Child each_child : children_obj_list) {
        each_child.parent_adding_reward(reward_obj);
    }
}