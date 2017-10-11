package appukrb.com.deeplinking;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Uri data = getIntent().getData();
//        https://www.primetrip.com/bus-tickets-from-chennai-to-bangalore
        if (data != null && data.toString().startsWith("https://www.primetrip.com")) {
            Toast.makeText(MainActivity.this,"Prime Trip Deep Linking",Toast.LENGTH_SHORT).show();
        }
    }
}
