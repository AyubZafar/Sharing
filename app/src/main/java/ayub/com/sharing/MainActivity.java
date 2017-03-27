package ayub.com.sharing;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;

import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.widget.ShareDialog;

public class MainActivity extends AppCompatActivity {

    Button btnSharefb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSharefb = (Button) findViewById(R.id.btnShare);

        final Context context = this;

        btnSharefb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bitmap image = BitmapFactory.decodeResource(context.getResources(),
                        R.drawable.image);
                SharePhoto photo = new SharePhoto.Builder()
                        .setBitmap(image)
                        .build();
                SharePhotoContent content = new SharePhotoContent.Builder()
                        .addPhoto(photo)
                        .build();

                ShareDialog.show(MainActivity.this, content);



            }


        });


    }
}
