package com.reoger.grennlife.TitleLayout;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.reoger.grennlife.R;

/**
 * Created by Administrator on 2016/10/10 0010.
 */
public class TitleLayout_about_app extends LinearLayout {
    public TitleLayout_about_app(Context context, AttributeSet attrs){
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title_about_app, this);
        ImageButton about_app_back = (ImageButton) findViewById(R.id.about_app_button);
        about_app_back.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });
    }
}
