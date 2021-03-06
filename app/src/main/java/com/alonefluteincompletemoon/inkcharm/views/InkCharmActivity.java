package com.alonefluteincompletemoon.inkcharm.views;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ViewFlipper;

import com.alonefluteincompletemoon.inkcharm.R;
import com.alonefluteincompletemoon.inkcharm.models.InkCharm_Browse_Article_Item_Bean;
import com.alonefluteincompletemoon.inkcharm.models.InkCharm_My_Article_MyArticle_List_Item_Bean;
import com.alonefluteincompletemoon.inkcharm.models.InkCharm_My_Article_MyCollect_List_Item_Bean;
import com.alonefluteincompletemoon.inkcharm.models.InkCharm_My_Article_MyFriends_List_Item_Bean;
import com.alonefluteincompletemoon.inkcharm.tools.commom_adapter.CommonAdapter;
import com.alonefluteincompletemoon.inkcharm.tools.commom_adapter.ViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 鹏阳 on 2015/8/23.
 */
public class InkCharmActivity extends Activity {
    private static final int FLING_MIN_DISTANCE = 100;
    Button BT_activity_inkcharm_browse_article, BT_activity_inkcharm_my_article, BT_activity_inkcharm_setting;
    ListView LV_activity_inkcharm_browse_article;
    ListView LV_activity_inkcharm_my_article_myarticle_list, LV_activity_inkcharm_my_article_mycollect_list, LV_activity_inkcharm_my_article_myfriends_list;
    LinearLayout LL_activity_inkcharm_browse_article, LL_activity_inkcharm_my_article, LL_activity_inkcharm_setting;
    ViewFlipper VF_activity_inkcharm_my_article;
    Button BT_activity_inkcharm_setting_nightstyle_open, BT_activity_inkcharm_setting_nightstyle_close, BT_activity_inkcharm_setting_receivenews_open;
    Button BT_activity_inkcharm_setting_receivenews_close, BT_activity_inkcharm_setting_receivenews_voice_open, BT_activity_inkcharm_setting_receivenews_voice_close;
    Button BT_activity_inkcharm_setting_receivenews_shock_open, BT_activity_inkcharm_setting_receivenews_shock_close, BT_activity_inkcharm_setting_playnews_speaker_open, BT_activity_inkcharm_setting_playnews_speaker_close;
    LinearLayout LL_activity_inkcharm_setting_receivenews_voice, LL_activity_inkcharm_setting_receivenews_shock;
    List<InkCharm_Browse_Article_Item_Bean> IBAI_Bean_Data = new ArrayList<InkCharm_Browse_Article_Item_Bean>();
    List<InkCharm_My_Article_MyArticle_List_Item_Bean> IMAMALI_Bean_Data = new ArrayList<InkCharm_My_Article_MyArticle_List_Item_Bean>();
    List<InkCharm_My_Article_MyCollect_List_Item_Bean> IMAMCLI_Bean_Data = new ArrayList<InkCharm_My_Article_MyCollect_List_Item_Bean>();
    List<InkCharm_My_Article_MyFriends_List_Item_Bean> IMAMFLI_Bean_Data = new ArrayList<InkCharm_My_Article_MyFriends_List_Item_Bean>();
    private float Event_Down_X;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inkcharm);

        Init_IBAI_Bean_Data();
        Init_IMAMALI_Bean_Data();
        Init_IMAMCLI_Bean_Data();
        Init_IMAMFLI_Bean_Data();


        BT_activity_inkcharm_browse_article = (Button) findViewById(R.id.BT_activity_inkcharm_browse_article);
        BT_activity_inkcharm_my_article = (Button) findViewById(R.id.BT_activity_inkcharm_my_article);
        BT_activity_inkcharm_setting = (Button) findViewById(R.id.BT_activity_inkcharm_setting);

        LL_activity_inkcharm_browse_article = (LinearLayout) findViewById(R.id.LL_activity_inkcharm_browse_article);
        LL_activity_inkcharm_my_article = (LinearLayout) findViewById(R.id.LL_activity_inkcharm_my_article);
        LL_activity_inkcharm_setting = (LinearLayout) findViewById(R.id.LL_activity_inkcharm_setting);

        LV_activity_inkcharm_my_article_myarticle_list = (ListView) findViewById(R.id.LV_activity_inkcharm_my_article_myarticle_list);
        LV_activity_inkcharm_my_article_mycollect_list = (ListView) findViewById(R.id.LV_activity_inkcharm_my_article_mycollect_list);
        LV_activity_inkcharm_my_article_myfriends_list = (ListView) findViewById(R.id.LV_activity_inkcharm_my_article_myfriends_list);

        LV_activity_inkcharm_browse_article = (ListView) findViewById(R.id.LV_activity_inkcharm_browse_article);

        VF_activity_inkcharm_my_article = (ViewFlipper) findViewById(R.id.VF_activity_inkcharm_my_article);

        BT_activity_inkcharm_setting_nightstyle_open = (Button) findViewById(R.id.BT_activity_inkcharm_setting_nightstyle_open);
        BT_activity_inkcharm_setting_nightstyle_close = (Button) findViewById(R.id.BT_activity_inkcharm_setting_nightstyle_close);
        BT_activity_inkcharm_setting_receivenews_open = (Button) findViewById(R.id.BT_activity_inkcharm_setting_receivenews_open);
        BT_activity_inkcharm_setting_receivenews_close = (Button) findViewById(R.id.BT_activity_inkcharm_setting_receivenews_close);
        BT_activity_inkcharm_setting_receivenews_voice_open = (Button) findViewById(R.id.BT_activity_inkcharm_setting_receivenews_voice_open);
        BT_activity_inkcharm_setting_receivenews_voice_close = (Button) findViewById(R.id.BT_activity_inkcharm_setting_receivenews_voice_close);
        BT_activity_inkcharm_setting_receivenews_shock_open = (Button) findViewById(R.id.BT_activity_inkcharm_setting_receivenews_shock_open);
        BT_activity_inkcharm_setting_receivenews_shock_close = (Button) findViewById(R.id.BT_activity_inkcharm_setting_receivenews_shock_close);
        BT_activity_inkcharm_setting_playnews_speaker_open = (Button) findViewById(R.id.BT_activity_inkcharm_setting_playnews_speaker_open);
        BT_activity_inkcharm_setting_playnews_speaker_close = (Button) findViewById(R.id.BT_activity_inkcharm_setting_playnews_speaker_close);

        LL_activity_inkcharm_setting_receivenews_voice = (LinearLayout) findViewById(R.id.LL_activity_inkcharm_setting_receivenews_voice);
        LL_activity_inkcharm_setting_receivenews_shock = (LinearLayout) findViewById(R.id.LL_activity_inkcharm_setting_receivenews_shock);

        BT_activity_inkcharm_browse_article.setEnabled(true);
        BT_activity_inkcharm_browse_article.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BT_activity_inkcharm_browse_article.setBackgroundColor(getResources().getColor(R.color.InkCharm_Borwse_Article_Button_BLUE));
                BT_activity_inkcharm_my_article.setBackgroundColor(Color.TRANSPARENT);
                BT_activity_inkcharm_setting.setBackgroundColor(Color.TRANSPARENT);
                LL_activity_inkcharm_browse_article.setVisibility(View.VISIBLE);
                LL_activity_inkcharm_my_article.setVisibility(View.GONE);
                LL_activity_inkcharm_setting.setVisibility(View.GONE);
            }
        });
        BT_activity_inkcharm_my_article.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BT_activity_inkcharm_my_article.setBackgroundColor(getResources().getColor(R.color.InkCharm_Borwse_Article_Button_BLUE));
                BT_activity_inkcharm_browse_article.setBackgroundColor(Color.TRANSPARENT);
                BT_activity_inkcharm_setting.setBackgroundColor(Color.TRANSPARENT);
                LL_activity_inkcharm_browse_article.setVisibility(View.GONE);
                LL_activity_inkcharm_my_article.setVisibility(View.VISIBLE);
                LL_activity_inkcharm_setting.setVisibility(View.GONE);
            }
        });
        BT_activity_inkcharm_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BT_activity_inkcharm_setting.setBackgroundColor(getResources().getColor(R.color.InkCharm_Borwse_Article_Button_BLUE));
                BT_activity_inkcharm_browse_article.setBackgroundColor(Color.TRANSPARENT);
                BT_activity_inkcharm_my_article.setBackgroundColor(Color.TRANSPARENT);
                LL_activity_inkcharm_browse_article.setVisibility(View.GONE);
                LL_activity_inkcharm_my_article.setVisibility(View.GONE);
                LL_activity_inkcharm_setting.setVisibility(View.VISIBLE);
            }
        });
        VF_activity_inkcharm_my_article.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Event_Down_X = event.getX();
                        break;
                    case MotionEvent.ACTION_UP:
                        if ((Event_Down_X - event.getX()) > FLING_MIN_DISTANCE) {
                            VF_activity_inkcharm_my_article.setInAnimation(getApplicationContext(), R.anim.push_left_in);
                            VF_activity_inkcharm_my_article.setOutAnimation(getApplicationContext(), R.anim.push_left_out);
                            VF_activity_inkcharm_my_article.showNext();
                        }
                        if ((Event_Down_X - event.getX()) < FLING_MIN_DISTANCE) {
                            VF_activity_inkcharm_my_article.setInAnimation(getApplicationContext(), R.anim.push_right_in);
                            VF_activity_inkcharm_my_article.setOutAnimation(getApplicationContext(), R.anim.push_right_out);
                            VF_activity_inkcharm_my_article.showPrevious();
                        }
                        break;
                }
                return true;
            }
        });
        BT_activity_inkcharm_setting_nightstyle_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BT_activity_inkcharm_setting_nightstyle_close.setVisibility(View.VISIBLE);
                BT_activity_inkcharm_setting_nightstyle_open.setVisibility(View.GONE);
            }
        });
        BT_activity_inkcharm_setting_nightstyle_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BT_activity_inkcharm_setting_nightstyle_close.setVisibility(View.GONE);
                BT_activity_inkcharm_setting_nightstyle_open.setVisibility(View.VISIBLE);
            }
        });
        BT_activity_inkcharm_setting_receivenews_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BT_activity_inkcharm_setting_receivenews_open.setVisibility(View.GONE);
                BT_activity_inkcharm_setting_receivenews_close.setVisibility(View.VISIBLE);
                LL_activity_inkcharm_setting_receivenews_voice.setVisibility(View.GONE);
                LL_activity_inkcharm_setting_receivenews_shock.setVisibility(View.GONE);
            }
        });
        BT_activity_inkcharm_setting_receivenews_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BT_activity_inkcharm_setting_receivenews_open.setVisibility(View.VISIBLE);
                BT_activity_inkcharm_setting_receivenews_close.setVisibility(View.GONE);
                LL_activity_inkcharm_setting_receivenews_voice.setVisibility(View.VISIBLE);
                LL_activity_inkcharm_setting_receivenews_shock.setVisibility(View.VISIBLE);
            }
        });
        BT_activity_inkcharm_setting_receivenews_voice_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BT_activity_inkcharm_setting_receivenews_voice_open.setVisibility(View.GONE);
                BT_activity_inkcharm_setting_receivenews_voice_close.setVisibility(View.VISIBLE);
            }
        });
        BT_activity_inkcharm_setting_receivenews_voice_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BT_activity_inkcharm_setting_receivenews_voice_open.setVisibility(View.VISIBLE);
                BT_activity_inkcharm_setting_receivenews_voice_close.setVisibility(View.GONE);
            }
        });
        BT_activity_inkcharm_setting_receivenews_shock_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BT_activity_inkcharm_setting_receivenews_shock_open.setVisibility(View.GONE);
                BT_activity_inkcharm_setting_receivenews_shock_close.setVisibility(View.VISIBLE);
            }
        });
        BT_activity_inkcharm_setting_receivenews_shock_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BT_activity_inkcharm_setting_receivenews_shock_open.setVisibility(View.VISIBLE);
                BT_activity_inkcharm_setting_receivenews_shock_close.setVisibility(View.GONE);
            }
        });
        BT_activity_inkcharm_setting_playnews_speaker_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BT_activity_inkcharm_setting_playnews_speaker_open.setVisibility(View.GONE);
                BT_activity_inkcharm_setting_playnews_speaker_close.setVisibility(View.VISIBLE);
            }
        });
        BT_activity_inkcharm_setting_playnews_speaker_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BT_activity_inkcharm_setting_playnews_speaker_open.setVisibility(View.VISIBLE);
                BT_activity_inkcharm_setting_playnews_speaker_close.setVisibility(View.GONE);
            }
        });
        LV_activity_inkcharm_browse_article.setAdapter(new CommonAdapter<InkCharm_Browse_Article_Item_Bean>(getApplicationContext(), IBAI_Bean_Data, R.layout.layout_inkcharm_browse_article_item) {
            @Override
            public void convert(ViewHolder helper, final InkCharm_Browse_Article_Item_Bean item) {
                helper.setImageResource(R.id.IB_layout_inkcharm_browse_article_ImageIcon, item.getImageRId());
                helper.setText(R.id.TV_layout_inkcharm_browse_article_UserName, item.getUserName());
                helper.setText(R.id.TV_layout_inkcharm_browse_article_ArticleName, item.getArticleName());
                helper.setText(R.id.TV_layout_inkcharm_browse_article_ArticleContent, item.getArticleContent());
                helper.getView(R.id.LL_layout_inkcharm_borwse_article_item_linearlayout).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent();
                        intent.setClass(InkCharmActivity.this, InkCharm_Borwse_Article_Activity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("UserHead", item.getImageRId());
                        bundle.putString("UserName", item.getUserName());
                        bundle.putString("ArticleName", item.getArticleName());
                        bundle.putString("ArticleContent", item.getArticleContent());
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
            }
        });
        LV_activity_inkcharm_my_article_myarticle_list.setAdapter(new CommonAdapter<InkCharm_My_Article_MyArticle_List_Item_Bean>(getApplicationContext(), IMAMALI_Bean_Data, R.layout.layout_inkcharm_my_article_myarticle_item) {
            @Override
            public void convert(ViewHolder helper, InkCharm_My_Article_MyArticle_List_Item_Bean item) {
                helper.setText(R.id.layout_inkcharm_my_article_myarticle_item_ArticleName, item.getArticleName());
                helper.setText(R.id.layout_inkcharm_my_article_myarticle_item_ArticleContent, item.getArticleContent());
                helper.setText(R.id.layout_inkcharm_my_article_myarticle_item_ReprintNum, item.getReprintNum());
                helper.setText(R.id.layout_inkcharm_my_article_myarticle_item_CollectNum, item.getCollectNum());
            }
        });
        LV_activity_inkcharm_my_article_mycollect_list.setAdapter(new CommonAdapter<InkCharm_My_Article_MyCollect_List_Item_Bean>(getApplicationContext(), IMAMCLI_Bean_Data, R.layout.layout_inkcharm_my_article_mycollect_item) {
            @Override
            public void convert(ViewHolder helper, InkCharm_My_Article_MyCollect_List_Item_Bean item) {
                helper.setText(R.id.layout_inkcharm_my_article_mycollect_item_ArticleName, item.getArticle_Name());
                helper.setText(R.id.layout_inkcharm_my_article_mycollect_item_ArticleContent, item.getArticle_Content());
                helper.setText(R.id.layout_inkcharm_my_article_mycollect_item_AuthorName, item.getAuthor_Name());
            }
        });
        LV_activity_inkcharm_my_article_myfriends_list.setAdapter(new CommonAdapter<InkCharm_My_Article_MyFriends_List_Item_Bean>(getApplicationContext(), IMAMFLI_Bean_Data, R.layout.layout_inkcharm_my_article_myfriends_item) {
            @Override
            public void convert(ViewHolder helper, InkCharm_My_Article_MyFriends_List_Item_Bean item) {
                helper.setText(R.id.layout_inkcharm_my_article_myfriends_item_FriendsName, item.getFriendsName());
                helper.setText(R.id.layout_inkcharm_my_article_myfriends_item_FriendsWord, item.getFreiendsWord());
                helper.setImageResource(R.id.layout_inkcharm_my_article_myfriends_item_FriendsHead, item.getFriendsHeadRId());
            }
        });
    }

    private void Init_IBAI_Bean_Data() {
        InkCharm_Browse_Article_Item_Bean IBAI_Bean = null;
        for (int i = 0; i <= 1000; i++) {
            IBAI_Bean = new InkCharm_Browse_Article_Item_Bean(R.drawable.inkcharm_test_image, getResources().getString(R.string.InkCharm_Browse_Article_Test_UserName),
                    getResources().getString(R.string.InkCharm_Browse_Article_Test_ArticleName), getResources().getString(R.string.InkCharm_Browse_Article_Test_ArticleContent));
            IBAI_Bean_Data.add(IBAI_Bean);
        }
    }

    private void Init_IMAMALI_Bean_Data() {
        InkCharm_My_Article_MyArticle_List_Item_Bean IMAMALI_Bean = null;
        for (int i = 0; i <= 10; i++) {
            IMAMALI_Bean = new InkCharm_My_Article_MyArticle_List_Item_Bean(getResources().getString(R.string.InkCharm_Browse_Article_Test_ArticleName), getResources().getString(R.string.InkCharm_Browse_Article_Test_ArticleContent), "20", "20");
            IMAMALI_Bean_Data.add(IMAMALI_Bean);
        }
    }

    private void Init_IMAMCLI_Bean_Data() {
        InkCharm_My_Article_MyCollect_List_Item_Bean IMAMCLI_Bean = null;
        for (int i = 0; i <= 10; i++) {
            IMAMCLI_Bean = new InkCharm_My_Article_MyCollect_List_Item_Bean(getResources().getString(R.string.InkCharm_Browse_Article_Test_ArticleName), getResources().getString(R.string.InkCharm_Browse_Article_Test_ArticleContent), getResources().getString(R.string.InkCharm_Browse_Article_Test_UserName));
            IMAMCLI_Bean_Data.add(IMAMCLI_Bean);
        }
    }

    private void Init_IMAMFLI_Bean_Data() {
        InkCharm_My_Article_MyFriends_List_Item_Bean IMAMFLI_Bean = null;
        for (int i = 0; i <= 10; i++) {
            IMAMFLI_Bean = new InkCharm_My_Article_MyFriends_List_Item_Bean(getResources().getString(R.string.InkCharm_Browse_Article_Test_UserName), getResources().getString(R.string.InkCharm_Browse_Article_Test_UserWord), R.drawable.inkcharm_test_image);
            IMAMFLI_Bean_Data.add(IMAMFLI_Bean);
        }
    }
}
