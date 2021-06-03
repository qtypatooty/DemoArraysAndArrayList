package sg.edu.rp.c346.day2.demoarraysarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayListActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_list);

        tv = findViewById(R.id.textView2);

        //continue view the code in the worksheet
        ArrayList<String> al = new ArrayList<String>();
        al.add("Quick");
        al.add("Brown");
        al.add("Fox");
        al.remove("Fox");
        al.set(1,"Silver");
        al.add("Happy Ending");
        System.out.println("Size is : " +al.size());
        String msg = "";
        for (int i = 0;i<al.size();i++){
            msg +=al.get(i) + "\n";
        }

        System.out.println(msg);
        tv.setText(msg);

    }
}