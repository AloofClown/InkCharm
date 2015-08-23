package com.alonefluteincompletemoon.inkcharm.views;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.alonefluteincompletemoon.inkcharm.R;
import com.alonefluteincompletemoon.inkcharm.models.InkCharm_Browse_Article_Item_Bean;
import com.alonefluteincompletemoon.inkcharm.tools.commom_adapter.CommonAdapter;
import com.alonefluteincompletemoon.inkcharm.tools.commom_adapter.ViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 鹏阳 on 2015/8/23.
 */
public class InkCharmActivity extends Activity{
    Button BT_activity_inkcharm_browse_article,BT_activity_inkcharm_my_article,BT_activity_inkcharm_setting;
    ListView LV_activity_inkcharm_browse_article;
    LinearLayout LL_activity_inkcharm_browse_article,LL_activity_inkcharm_my_article,LL_activity_inkcharm_setting;
    List<InkCharm_Browse_Article_Item_Bean> IBAI_Bean_Data = new ArrayList<InkCharm_Browse_Article_Item_Bean>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inkcharm);

        Init_IBAI_Bean_Data();

        BT_activity_inkcharm_browse_article = (Button)findViewById(R.id.BT_activity_inkcharm_browse_article);
        BT_activity_inkcharm_my_article = (Button)findViewById(R.id.BT_activity_inkcharm_my_article);
        BT_activity_inkcharm_setting = (Button)findViewById(R.id.BT_activity_inkcharm_setting);

        LL_activity_inkcharm_browse_article = (LinearLayout)findViewById(R.id.LL_activity_inkcharm_browse_article);
        LL_activity_inkcharm_my_article = (LinearLayout)findViewById(R.id.LL_activity_inkcharm_my_article);
        LL_activity_inkcharm_setting = (LinearLayout)findViewById(R.id.LL_activity_inkcharm_setting);

        LV_activity_inkcharm_browse_article = (ListView)findViewById(R.id.LV_activity_inkcharm_browse_article);


        BT_activity_inkcharm_browse_article.setEnabled(true);
        BT_activity_inkcharm_browse_article.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BT_activity_inkcharm_browse_article.setBackgroundColor(getResources().getColor(R.color.InkCharm_Borwse_Article_Button_BLUE));
                BT_activity_inkcharm_my_article.setBackgroundColor(Color.TRANSPARENT);
                BT_activity_inkcharm_setting.setBackgroundColor(Color.TRANSPARENT);
                LL_activity_inkcharm_browse_article.setVisibility(View.VISIBLE);
                LL_activity_inkcharm_my_article.setVisibility(View.INVISIBLE);
                LL_activity_inkcharm_setting.setVisibility(View.INVISIBLE);
            }
        });
        BT_activity_inkcharm_my_article.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BT_activity_inkcharm_my_article.setBackgroundColor(getResources().getColor(R.color.InkCharm_Borwse_Article_Button_BLUE));
                BT_activity_inkcharm_browse_article.setBackgroundColor(Color.TRANSPARENT);
                BT_activity_inkcharm_setting.setBackgroundColor(Color.TRANSPARENT);
                LL_activity_inkcharm_browse_article.setVisibility(View.INVISIBLE);
                LL_activity_inkcharm_my_article.setVisibility(View.VISIBLE);
                LL_activity_inkcharm_setting.setVisibility(View.INVISIBLE);
            }
        });
        BT_activity_inkcharm_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BT_activity_inkcharm_setting.setBackgroundColor(getResources().getColor(R.color.InkCharm_Borwse_Article_Button_BLUE));
                BT_activity_inkcharm_browse_article.setBackgroundColor(Color.TRANSPARENT);
                BT_activity_inkcharm_my_article.setBackgroundColor(Color.TRANSPARENT);
                LL_activity_inkcharm_browse_article.setVisibility(View.VISIBLE);
                LL_activity_inkcharm_my_article.setVisibility(View.INVISIBLE);
                LL_activity_inkcharm_setting.setVisibility(View.VISIBLE);
            }
        });
        LV_activity_inkcharm_browse_article.setAdapter(new CommonAdapter<InkCharm_Browse_Article_Item_Bean>(getApplicationContext(),IBAI_Bean_Data,R.layout.layout_inkcharm_browse_article_item) {
            @Override
            public void convert(ViewHolder helper, InkCharm_Browse_Article_Item_Bean item) {
                helper.setImageResource(R.id.IB_layout_inkcharm_browse_article_ImageIcon,item.getImageRId());
                helper.setText(R.id.TV_layout_inkcharm_browse_article_UserName,item.getUserName());
                helper.setText(R.id.TV_layout_inkcharm_browse_article_ArticleName,item.getArticleName());
                helper.setText(R.id.TV_layout_inkcharm_browse_article_ArticleContent,item.getArticleContent());
            }
        });
    }
    private void Init_IBAI_Bean_Data()
    {
        InkCharm_Browse_Article_Item_Bean IBAI_Bean = null;
        for(int i=0;i<=10;i++) {
            IBAI_Bean = new InkCharm_Browse_Article_Item_Bean(R.drawable.inkcharm_test_image,getResources().getString(R.string.InkCharm_Browse_Article_Test_username),
                    getResources().getString(R.string.InkCharm_Browse_Article_ArticleName), getResources().getString(R.string.InkCharm_Browse_Article_ArticleContent));
            IBAI_Bean_Data.add(IBAI_Bean);
        }
}
}
