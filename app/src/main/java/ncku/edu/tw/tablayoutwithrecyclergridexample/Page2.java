package ncku.edu.tw.tablayoutwithrecyclergridexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        Toast.makeText(this,"page2",Toast.LENGTH_SHORT).show();
    }
}
