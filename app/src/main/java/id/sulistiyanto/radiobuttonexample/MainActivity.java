package id.sulistiyanto.radiobuttonexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private RadioButton radioSexButton;

    @BindView(R.id.radioSex) RadioGroup radioSexGroup;

    @OnClick(R.id.btnDisplay) void action(){
        // memilih radio button dari radioGroup
        int selectedId = radioSexGroup.getCheckedRadioButtonId();

        // mencari id radio button
        radioSexButton = (RadioButton) findViewById(selectedId);

        Toast.makeText(MainActivity.this, radioSexButton.getText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }
}
