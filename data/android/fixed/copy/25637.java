@java.lang.Override
public java.util.ArrayList<com.protheansoftware.gab.model.Like> getDislikes() throws java.sql.SQLException {
    java.util.ArrayList<com.protheansoftware.gab.model.Like> dislikes = new java.util.ArrayList<com.protheansoftware.gab.model.Like>();
    dislikes = selectFromLikes((("SELECT * FROM `t_dislikes` WHERE `origin_id`= " + (getMyId())) + " LIMIT 0 , 30;"));
    return dislikes;
}