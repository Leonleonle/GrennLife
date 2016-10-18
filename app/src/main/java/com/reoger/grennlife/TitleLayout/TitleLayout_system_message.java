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
public class TitleLayout_system_message extends LinearLayout {
    public TitleLayout_system_message(Context context, AttributeSet attrs){
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title_system_message,this);
        ImageButton message_back = (ImageButton) findViewById(R.id.message_button);
        message_back.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });
    }
}
