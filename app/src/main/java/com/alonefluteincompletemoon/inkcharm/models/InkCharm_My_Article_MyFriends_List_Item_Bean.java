package com.alonefluteincompletemoon.inkcharm.models;

/**
 * Created by 鹏阳 on 2015/9/1.
 */
public class InkCharm_My_Article_MyFriends_List_Item_Bean {
    private String FriendsName;
    private int FriendsHeadRId;
    private String FreiendsWord;

    public InkCharm_My_Article_MyFriends_List_Item_Bean() {

    }

    public InkCharm_My_Article_MyFriends_List_Item_Bean(String FriendsName, String FreiendsWord, int FriendsHeadRId) {
        super();
        this.FriendsName = FriendsName;
        this.FreiendsWord = FreiendsWord;
        this.FriendsHeadRId = FriendsHeadRId;
    }

    public String getFriendsName() {
        return FriendsName;
    }

    public void setFriendsName(String friendsName) {
        FriendsName = friendsName;
    }

    public int getFriendsHeadRId() {
        return FriendsHeadRId;
    }

    public void setFriendsHeadRId(int friendsHeadRId) {
        FriendsHeadRId = friendsHeadRId;
    }

    public String getFreiendsWord() {
        return FreiendsWord;
    }

    public void setFreiendsWord(String freiendsWord) {
        FreiendsWord = freiendsWord;
    }
}
