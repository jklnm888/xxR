package mter.mter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.PersistentCookieStore;
import com.loopj.android.http.RequestParams;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.client.CookieStore;
import mter.network.HttpClient;

public class LoginActivity extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login_btn = (Button)findViewById(R.id.btn_login);
        login_btn.setOnClickListener(this);
        AsyncHttpClient client = HttpClient.getInstance();

        // 쿠키 영구 저장
        CookieStore cookieStore = new PersistentCookieStore(this);
        client.setCookieStore(cookieStore);

        //쿠키값 제거
        //client.setCookieStore(null);
    }

    @Override
    public void onClick(View v) {

        RequestParams params = new RequestParams();
        EditText id = (EditText)findViewById(R.id.id);
        EditText pwd = (EditText)findViewById(R.id.pwd);

        params.put("id", id.getText().toString());
        params.put("pwd", pwd.getText().toString());
        Log.i("Msg","Clicked Login Btn id : "+id.getText()+" pwd : "+pwd.getText());
        HttpClient.get("", params, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int i, Header[] headers, byte[] bytes) {
                TextView status = (TextView) findViewById(R.id.textView);
                String test = new String(bytes,0,bytes.length);
                status.setText(test);
            }

            @Override
            public void onFailure(int i, Header[] headers, byte[] bytes, Throwable throwable) {

            }

        });
    }
}
