package rhynix.eliud.butterknifetutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.textview)
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        title.setText("Hello from Butterknife");
    }
    @OnClick(R.id.button)
    public void submit(){
        Toast.makeText(MainActivity.this,"Hello from Butterknife Onclick annotation",Toast.LENGTH_SHORT).show();
    }
}
