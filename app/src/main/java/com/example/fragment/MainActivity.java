package com.example.fragment;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.fragment.app.Fragment;
        import androidx.fragment.app.FragmentManager;

        import android.os.Bundle;
        import android.widget.TextView;

        import java.text.DateFormat;
        import java.util.ArrayList;
        import java.util.Calendar;
        import java.util.Date;

public class MainActivity extends AppCompatActivity implements Personadapter.ItemSelcted {
    public  static ArrayList<Person> pepple;
    TextView tvDate;
    String CurrentDate;
    Calendar calender=Calendar.getInstance();
    FragmentManager fragmentManager;
    BlankFragment1 listfrag;
    BlankFragment2 detailfrag;
    BlankFragment3 add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDate=findViewById(R.id.tvdate);
        CurrentDate= DateFormat.getDateInstance(DateFormat.FULL).format(calender.getTime());
        fragmentManager=this.getSupportFragmentManager();
        listfrag=(BlankFragment1) fragmentManager.findFragmentById(R.id.list);
        tvDate.setText(CurrentDate);
        detailfrag=(BlankFragment2) fragmentManager.findFragmentById(R.id.detal);
        add=(BlankFragment3) fragmentManager.findFragmentById(R.id.addfra);
        initArray();

    }
    private void initArray(){
        pepple=new ArrayList<>();
        pepple.add(new Person("mom","054213344",R.drawable.mom));
        pepple.add(new Person("dad","054223344",R.drawable.dad));
        pepple.add(new Person("ahmed","054233344",R.drawable.yakeen));
        pepple.add(new Person("mohamed","054243344",R.drawable.yakeen));
        pepple.add(new Person("yakeen","054253344",R.drawable.yakeen));
    }

    @Override
    public void onItemSelected(int index) {
        Person selectedPerson = pepple.get(index);
        if(selectedPerson.getImage()==0){
            selectedPerson.setImage(R.drawable.baseline_account_box_24);
        }
        detailfrag.updateTexts(selectedPerson.getName(), selectedPerson.getPhone(), selectedPerson.getImage());

    }
}