package eyedsion.soft.statusbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @InjectView(R.id.color_statusbar)
     TextView color_statusbar;

    @InjectView(R.id.trans_statusbar)
    TextView trans_statusbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        color_statusbar.setOnClickListener(this);
        trans_statusbar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.color_statusbar:
                Intent intentColor=new Intent(this,ColorStatusActivity.class);
                startActivity(intentColor);
                break;
            case R.id.trans_statusbar:
                Intent intentTrans=new Intent(this,TransStatusActivity.class);
                startActivity(intentTrans);
                break;
        }
    }
}
