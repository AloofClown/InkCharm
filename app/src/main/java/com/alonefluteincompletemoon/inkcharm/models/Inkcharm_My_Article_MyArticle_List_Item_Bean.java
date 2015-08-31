package com.alonefluteincompletemoon.inkcharm.models;

/**
 * Created by 鹏阳 on 2015/8/25.
 */
public class Inkcharm_My_Article_MyArticle_List_Item_Bean {
    private String ArticleName;
    private String ArticleContent;
    private String ReprintNum;
    private String CollectNum;

    public Inkcharm_My_Article_MyArticle_List_Item_Bean(){

    }

    public Inkcharm_My_Article_MyArticle_List_Item_Bean(String ArticleName, String ArticleContent, String ReprintNum, String CollectNum){
        super();
        this.ArticleName = ArticleName;
        this.ArticleContent = ArticleContent;
        this.ReprintNum = ReprintNum;
        this.CollectNum = CollectNum;
    }

    public String getArticleName() {
        return ArticleName;
    }

    public void setArticleName(String articleName) {
        ArticleName = articleName;
    }

    public String getArticleContent() {
        return ArticleContent;
    }

    public void setArticleContent(String articleContent) {
        ArticleContent = articleContent;
    }

    public String getReprintNum() {
        return ReprintNum;
    }

    public void setReprintNum(String reprintNum) {
        ReprintNum = reprintNum;
    }

    public String getCollectNum() {
        return CollectNum;
    }

    public void setCollectNum(String collectNum) {
        CollectNum = collectNum;
    }
}
