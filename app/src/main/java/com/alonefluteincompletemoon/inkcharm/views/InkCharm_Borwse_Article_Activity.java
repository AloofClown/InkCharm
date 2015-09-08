package com.alonefluteincompletemoon.inkcharm.views;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.alonefluteincompletemoon.inkcharm.R;
import com.alonefluteincompletemoon.inkcharm.tools.round_icon.CircularImage;

/**
 * Created by 鹏阳 on 2015/9/7.
 */
public class InkCharm_Borwse_Article_Activity extends Activity {
    TextView TV_activity_inkcharm_browse_article_UserName, TV_activity_inkcharm_browse_article_ArticleName, TV_activity_inkcharm_browse_article_ArticleContent;
    Button BT_activity_inkcharm_browse_article_Back, BT_activity_inkcharm_browse_article_ReprintArticle, BT_activity_inkcharm_browse_article_CollectArticle, BT_activity_inkcharm_browse_article_ShareArticle;
    CircularImage CI_activity_inkcharm_browse_article_UserHead;
    PopupWindow ShareArticle_PopupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inkcharm_borwse_article);

        TV_activity_inkcharm_browse_article_UserName = (TextView) findViewById(R.id.TV_activity_inkcharm_browse_article_UserName);
        TV_activity_inkcharm_browse_article_ArticleName = (TextView) findViewById(R.id.TV_activity_inkcharm_browse_article_ArticleName);
        TV_activity_inkcharm_browse_article_ArticleContent = (TextView) findViewById(R.id.TV_activity_inkcharm_browse_article_ArticleContent);

        BT_activity_inkcharm_browse_article_Back = (Button) findViewById(R.id.BT_activity_inkcharm_browse_article_Back);
        BT_activity_inkcharm_browse_article_ReprintArticle = (Button) findViewById(R.id.BT_activity_inkcharm_browse_article_ReprintArticle);
        BT_activity_inkcharm_browse_article_CollectArticle = (Button) findViewById(R.id.BT_activity_inkcharm_browse_article_CollectArticle);
        BT_activity_inkcharm_browse_article_ShareArticle = (Button) findViewById(R.id.BT_activity_inkcharm_browse_article_ShareArticle);

        CI_activity_inkcharm_browse_article_UserHead = (CircularImage) findViewById(R.id.CI_activity_inkcharm_browse_article_UserHead);

        DataTransmission();

        BT_activity_inkcharm_browse_article_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        BT_activity_inkcharm_browse_article_ReprintArticle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InkCharm_Borwse_Article_Activity.this, InkCharm_Borwse_Article_CommentArticle_Activity.class);
                startActivity(intent);
            }
        });
        BT_activity_inkcharm_browse_article_ShareArticle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getPopupWindow();
                ShareArticle_PopupWindow.showAtLocation(v, Gravity.BOTTOM, 0, 0);
            }
        });
    }

    private void DataTransmission() {
        Bundle bundle = this.getIntent().getExtras();
        int UserHead = bundle.getInt("UserHead");
        String UserName = bundle.getString("UserName");
        String ArticleName = bundle.getString("ArticleName");
        String ArticleContent = bundle.getString("ArticleContent");

        CI_activity_inkcharm_browse_article_UserHead.setImageResource(UserHead);
        TV_activity_inkcharm_browse_article_UserName.setText(UserName);
        TV_activity_inkcharm_browse_article_ArticleName.setText(ArticleName);
        TV_activity_inkcharm_browse_article_ArticleContent.setText(ArticleContent);
    }

    /**
     * 创建PopupWindow
     */
    protected void initPopuptWindow() {
        // 获取自定义布局文件activity_popupwindow_left.xml的视图
        View popupWindow_view = getLayoutInflater().inflate(R.layout.layout_inkcharm_browse_article_sharearticle_popupwindow, null,
                false);
        // 创建PopupWindow实例,200,LayoutParams.MATCH_PARENT分别是宽度和高度
        ShareArticle_PopupWindow = new PopupWindow(popupWindow_view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
        // 点击其他地方消失
        popupWindow_view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (ShareArticle_PopupWindow != null && ShareArticle_PopupWindow.isShowing()) {
                    ShareArticle_PopupWindow.dismiss();
                    ShareArticle_PopupWindow = null;
                }
                return false;
            }
        });
    }

    /**
     * 获取PopupWindow实例
     */
    private void getPopupWindow() {
        if (null != ShareArticle_PopupWindow) {
            ShareArticle_PopupWindow.dismiss();
            return;
        } else {
            initPopuptWindow();
        }
    }
}
