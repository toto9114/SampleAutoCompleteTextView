package com.example.tacademy.sampleautocompletetextview;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Tacademy on 2016-01-18.
 */
public class ItemVIew extends FrameLayout {
    public ItemVIew(Context context) {
        super(context);
        init();
    }
    ImageView iconView;
    TextView title;
    public void init(){
        inflate(getContext(),R.layout.view_item,this);
        iconView = (ImageView)findViewById(R.id.image_icon);
        title = (TextView)findViewById(R.id.text_title);
    }

    public void setData(MyData data){
        iconView.setImageDrawable(data.icon);
        title.setText(data.title);
    }
}
