package com.pouriahemati.phcustomtoasmasseg;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class PHCustomToastMasseg {

    public static void showToastMessage(Context context,String message , Drawable myIcon){

        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        View layout = inflater.inflate(R.layout.layout_custom_toast,
                (ViewGroup) ((Activity) context).findViewById(R.id.card_view));
        // set a message
        TextView text = (TextView) layout.findViewById(R.id.custom_toast_message);
        text.setText(message);
        //set a icon
        ImageView imageView = layout.findViewById(R.id.img_custom);
        imageView.setImageDrawable(myIcon);

        // Toast...
        Toast toast = new Toast(context);
        toast.setGravity(Gravity.FILL_HORIZONTAL | Gravity.BOTTOM, 0, 0);

        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }

}
