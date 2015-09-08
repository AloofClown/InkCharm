package com.alonefluteincompletemoon.inkcharm.models;

/**
 * Created by 鹏阳 on 2015/9/8.
 */
public class InkCharm_Borwse_Article_CommentArticle_List_Bean {
    private int UserHeadRId;
    private String UserName;
    private String UserComment;

    public InkCharm_Borwse_Article_CommentArticle_List_Bean() {
    }

    public InkCharm_Borwse_Article_CommentArticle_List_Bean(int UserHeadRId, String UserName, String UserComment) {
        super();
        this.UserHeadRId = UserHeadRId;
        this.UserName = UserName;
        this.UserComment = UserComment;
    }

    public int getUserHeadRId() {
        return UserHeadRId;
    }

    public void setUserHeadRId(int userHeadRId) {
        UserHeadRId = userHeadRId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserComment() {
        return UserComment;
    }

    public void setUserComment(String userComment) {
        UserComment = userComment;
    }
}
