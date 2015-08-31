package com.alonefluteincompletemoon.inkcharm.models;

/**
 * Created by 鹏阳 on 2015/8/31.
 */
public class Inkcharm_My_Article_MyCollect_List_Item_Bean {
    private String Article_Name;
    private String Article_Content;
    private String Author_Name;
    public Inkcharm_My_Article_MyCollect_List_Item_Bean(){
    }
    public Inkcharm_My_Article_MyCollect_List_Item_Bean(String Article_Name,String Article_Content,String Author_Name){
        super();
        this.Article_Name = Article_Name;
        this.Article_Content = Article_Content;
        this.Author_Name = Author_Name;
    }

    public String getArticle_Name() {
        return Article_Name;
    }

    public void setArticle_Name(String article_Name) {
        Article_Name = article_Name;
    }

    public String getArticle_Content() {
        return Article_Content;
    }

    public void setArticle_Content(String article_Content) {
        Article_Content = article_Content;
    }

    public String getAuthor_Name() {
        return Author_Name;
    }

    public void setAuthor_Name(String author_Name) {
        Author_Name = author_Name;
    }
}
