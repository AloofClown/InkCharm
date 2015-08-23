package com.alonefluteincompletemoon.inkcharm.models;

/**
 * Created by 鹏阳 on 2015/8/23.
 */
public class InkCharm_Browse_Article_Item_Bean {
    private int ImageRId;
    private String UserName;
    private String ArticleName;
    private String ArticleContent;

    public InkCharm_Browse_Article_Item_Bean(){

    }

    public InkCharm_Browse_Article_Item_Bean(int ImageRId,String UserName,String ArticleName,String ArticleContent){
        super();
        this.ImageRId = ImageRId;
        this.UserName = UserName;
        this.ArticleName = ArticleName;
        this.ArticleContent = ArticleContent;
    }

    public int getImageRId() {
        return ImageRId;
    }

    public void setImageRId(int imageRId) {
        ImageRId = imageRId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
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
}
