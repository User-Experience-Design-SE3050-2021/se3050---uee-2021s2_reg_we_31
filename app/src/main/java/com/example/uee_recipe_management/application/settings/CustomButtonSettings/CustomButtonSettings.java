package com.example.uee_recipe_management.application.settings.CustomButtonSettings;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.example.uee_recipe_management.application.R;
import com.example.uee_recipe_management.application.settings.model.customButton1;

import java.sql.SQLOutput;
import java.util.ArrayList;


public class CustomButtonSettings extends BaseAdapter {

    private Context context;
    ArrayList<customButton1> list;
    TextView title1, title2;
    Switch toogleButton;
    CardView longCardView;
    ListView listView1;

    public CustomButtonSettings(Context context, ArrayList<customButton1> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.activity_custom_button_settings , null);
            //textID = (TextView) view.findViewById(R.id.textID);
            title1 = (TextView) view.findViewById(R.id.settingstitle1);
            title2 = (TextView) view.findViewById(R.id.settingstitle2);
            listView1 = (ListView) view.findViewById(R.id.listSettings11);

            toogleButton = view.findViewById(R.id.switch1);
            longCardView = view.findViewById(R.id.cardSettingsId1);
            final customButton1 customButton1 = list.get(i);//i means relevent adapter position
            //songList(i) means we are geting the relevent array value of ArrayList<SongList> at postion i

            String name1 = customButton1.getTitle1();
            title1.setText(name1);
            String name2 = customButton1.getTitle2();
            title2.setText(name2);

            //needed to be updated
            toogleButton.setChecked(true);
            toogleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                   if (name1.contentEquals("Notification")){
                       if (b == true){
                           System.out.println(b);
                       }else if (b == false){
                           System.out.println(b);
                       }

                   }else if (name1.contentEquals("Vibration")){
                       if (b == true){
                           System.out.println(b);
                       }else if (b == false){
                           System.out.println(b);
                       }

                   }else if (name1.contentEquals("Sync")){
                       if (b == true){
                           System.out.println(b);

                       }else if (b == false){
                           System.out.println(b);

                       }
                   }
                   else if (name1.contentEquals("Dark Mode")){
                       if (b == true){
                           System.out.println(b);

                       }else if (b == false){
                           System.out.println(b);

                       }
                   }
                   else if (name1.contentEquals("Sync on startup")){
                       if (b == true){
                           System.out.println(b);

                       }else if (b == false){
                           System.out.println(b);

                       }
                   }

                }
            });
            //customButton1 item = list.get(i);
//            listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                @Override
//                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                    System.out.println("ggg " + i);
//                }
//            });
//            if(customButton1.getStatus()){
//                //toggle your switch.
//            }


//            longCardView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    System.out.println("cassss");
//                }
//            });




        }
        return view;
    }
}