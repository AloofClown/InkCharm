package com.alonefluteincompletemoon.inkcharm.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.alonefluteincompletemoon.inkcharm.R;

/**
 * Created by 鹏阳 on 2015/8/23.
 */
public class InkCharmActivity extends Activity{
    Button BT_activity_inkcharm_browse_article,BT_activity_inkcharm_my_article,BT_activity_inkcharm_setting;
    LinearLayout layout_inkcharm_article_browse,layout_inkcharm_setting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inkcharm);

        BT_activity_inkcharm_browse_article = (Button)findViewById(R.id.BT_activity_inkcharm_browse_article);
        BT_activity_inkcharm_my_article = (Button)findViewById(R.id.BT_activity_inkcharm_my_article);
        BT_activity_inkcharm_setting = (Button)findViewById(R.id.BT_activity_inkcharm_setting);

        layout_inkcharm_article_browse = (LinearLayout)findViewById(R.id.layout_inkcharm_article_browse);
        layout_inkcharm_setting = (LinearLayout)findViewById(R.id.layout_inkcharm_setting);

        BT_activity_inkcharm_browse_article.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout_inkcharm_article_browse.setVisibility(View.VISIBLE);
                layout_inkcharm_setting.setVisibility(View.INVISIBLE);
            }
        });
        BT_activity_inkcharm_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout_inkcharm_article_browse.setVisibility(View.INVISIBLE);
                layout_inkcharm_setting.setVisibility(View.VISIBLE);
            }
        });

    }
}
