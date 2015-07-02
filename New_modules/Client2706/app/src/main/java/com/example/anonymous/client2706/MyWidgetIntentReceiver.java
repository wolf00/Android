package com.example.anonymous.client2706;

import com.example.anonymous.client2706.R;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.Toast;

/**
 * Created by shivang on 7/1/2015.
 */
public class MyWidgetIntentReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "in on recieve",Toast.LENGTH_SHORT).show();
        if(intent.getAction().equals("pl.looksok.intent.action.CHANGE_PICTURE")){
            Toast.makeText(context, "in on recieve",Toast.LENGTH_SHORT).show();
            updateWidgetPictureAndButtonListener(context);
        }
    }

    private void updateWidgetPictureAndButtonListener(Context context) {
        Toast.makeText(context, "u clicked",Toast.LENGTH_SHORT).show();
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget);
        remoteViews.setString(R.id.widget_button, "setText", "hey");

        //remoteViews.setImageViewResource(R.id.widget_image, getImageToSet(,));

        //REMEMBER TO ALWAYS REFRESH YOUR BUTTON CLICK LISTENERS!!!
        remoteViews.setOnClickPendingIntent(R.id.widget_button, widget.buildButtonPendingIntent(context));

        widget.pushWidgetUpdate(context.getApplicationContext(), remoteViews);
    }

    //private int getImageToSet() {
    //    clickCount++;
    // return clickCount % 2 == 0 ? R.drawable.me : R.drawable.wordpress_icon;
    // }
}
