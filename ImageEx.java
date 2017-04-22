//3と5の倍数の場合は画像が阿呆になります。
package com.tenpa_mf.imageex;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static com.tenpa_mf.imageex.R.id.img1;
import static com.tenpa_mf.imageex.R.id.img2;

public class ImageEx extends Activity {
    public ImageView imageView;
    public ImageView imageView2;
    public TextView textView;
    int i=1;
    boolean flag3 = false;
    boolean flag5 = false;
    boolean picture1 = false;
    boolean picture2 = false;
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        //ボタン設定
        Button button =(Button)findViewById(R.id.button);

        //TextViewの設定
        textView =(TextView)findViewById(R.id.text_View);
        textView.setTextColor(Color.BLACK);

        imageView = (ImageView) findViewById(img1);
        imageView2 = (ImageView) findViewById(img2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag3 = false;
                flag5 = false;
                picture1 = false;
                picture2 = false;
                if ((i % 3 == 0)||(i%10==3)) {
                    flag3 = true;
                }
                if (i % 5 == 0) {
                    flag5 = true;
                }

                if (flag3) {
                    imageView = (ImageView) findViewById(img1);
                    imageView.setImageResource(R.drawable.bmp1);
                    picture1 = true;
                    textView.setText(i+"で馬鹿化");

                } else if (flag5) {
                    imageView = (ImageView) findViewById(img1);
                    imageView.setImageResource(R.drawable.bmp1);
                    picture1 = true;
                    textView.setText(i+"で馬鹿化");

                } else {
                    imageView2 = (ImageView) findViewById(img2);
                    imageView2.setImageResource(R.drawable.bmp2);
                    picture2 = true;
                    textView.setText(i + "で真面目");
                }
                i++;
                if(picture1){
                    //イメージビューの表示だけだと画像が残ってしまうため、いらない方を消している。
                    imageView=(ImageView)findViewById(img1);
                    imageView2.setImageBitmap(null);
                }else if(picture2){
                    //イメージビューの表示だけだと画像が残ってしまうため、いらない方を消している。
                    imageView2=(ImageView)findViewById(img2);
                    imageView.setImageBitmap(null);
                }

            }
        });
    }
}
