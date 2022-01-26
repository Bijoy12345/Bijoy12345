package com.bijoy.customerrecicler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Contact> contactList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerView=findViewById(R.id.recycler);

        contactList=new ArrayList<>();
        

        contactList.add(new Contact("Bijoy","shamsuddohabijoy1998@gmail.com","01813882974","https://scontent.fdac142-1.fna.fbcdn.net/v/t39.30808-6/271305737_648377859683313_4301902248850637956_n.jpg?_nc_cat=109&ccb=1-5&_nc_sid=09cbfe&_nc_eui2=AeHUiIPR0Y-xZdxOkR1NyP5kxh6sHBn8Q5vGHqwcGfxDm4xbqQgHyuWFtDvPE5Uye765Cgy7qtI23Ua7I-8DENlx&_nc_ohc=Htsix2kk5lYAX-U3G5q&tn=36mCvJLOoojQMBPw&_nc_ht=scontent.fdac142-1.fna&oh=00_AT-TcBtZ5ksZR8NDOIf2oU5q2NaZni20vpJ7KkpQsA6BJg&oe=61F5D652","O+"));
        contactList.add(new Contact("Leo Messi","leomessi@gmail.com","1840000554","https://th.bing.com/th/id/R.fb30f496fa8666c549339f99d0ef88be?rik=BUvJJk%2bOQJuFiw&pid=ImgRaw&r=0","AB+"));
        contactList.add(new Contact("Antonella Roccuzzo","antonella@gmail.com","151015441","https://2.bp.blogspot.com/--UDQBhK4RRg/UYEz4xprc0I/AAAAAAAABGE/SzH4aqeI6AU/s1600/lionel+messi+wife.jpg","A-"));
        contactList.add(new Contact("Thiago Messi","thigao@gmail.com","0145","https://articlemix.com/wp-content/uploads/2020/06/Lionel-Messi-son-Thiago-Messi-Roccuzzo.jpg","A+"));
        contactList.add(new Contact("Mateo Messi","mateo@gmail.com","202120","https://th.bing.com/th/id/OIP.8ljEk76iNPkYLiytbbJN6AHaE7?pid=ImgDet&rs=1","B+"));
        contactList.add(new Contact("Ciro Messi","crio@gmail.com","21561352156","https://th.bing.com/th/id/OIP.HCBg8S56TVl9VWOfb6WjhwAAAA?pid=ImgDet&rs=1","O-"));

        ContactAdapter contactAdapter=new ContactAdapter(this,contactList);

        recyclerView.setAdapter(contactAdapter);

    }
}