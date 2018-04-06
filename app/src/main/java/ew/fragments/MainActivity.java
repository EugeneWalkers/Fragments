package ew.fragments;

import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    FragmentOne frag1;
    FragmentTwo frag2;
    LinearLayout layout;
    FragmentTransaction fTrans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.fragment_container);
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            layout.setOrientation(LinearLayout.VERTICAL);
        }
        else {
            layout.setOrientation(LinearLayout.HORIZONTAL);
        }
        if (savedInstanceState == null){
            frag1 = new FragmentOne();
            frag2 = new FragmentTwo();
            fTrans = getFragmentManager().beginTransaction();
            fTrans.add(R.id.fragment_container, frag1);
            fTrans.add(R.id.fragment_container, frag2);
            fTrans.commit();
        }

    }
}
