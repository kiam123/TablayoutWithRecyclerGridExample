package ncku.edu.tw.tablayoutwithrecyclergridexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Page1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        Toast.makeText(this,"page1",Toast.LENGTH_SHORT).show();
    }
}
