package pl.teb.abdroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showAdultMenu (View view) {
        Intent intent = new Intent(this, MenuJsonActivity.class);
        startActivity(intent);
    }

        public void showKidsMenu (View view){
            Intent intent = new Intent(this, KidsMenu.class);
            startActivity(intent);
    }

}
