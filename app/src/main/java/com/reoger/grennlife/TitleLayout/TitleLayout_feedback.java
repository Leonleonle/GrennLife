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
public class TitleLayout_feedback extends LinearLayout {
    public TitleLayout_feedback(Context context, AttributeSet attrs){
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title_feedback, this);
        ImageButton feedback_back = (ImageButton) findViewById(R.id.feedback_button);
        feedback_back.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });
    }
}
