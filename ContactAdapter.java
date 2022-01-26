package com.bijoy.customerrecicler;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder> {

    Context context;
    List<Contact> contactList;

    public ContactAdapter(Context context, List<Contact> contactList) {
        this.context = context;
        this.contactList = contactList;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_contact,parent,false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        Contact contact= contactList.get(position);

        holder.name.setText(contact.getName());
        holder.email.setText(contact.getEmail());
        holder.phone.setText(contact.getPhone());
        holder.blood_group.setText(contact.getBlood_group());

        Glide.with(context).load(contact.getProfile_img()).into(holder.profile_img);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,DetailsActivity.class);

                intent.putExtra("name",contact.getName());
                intent.putExtra("email",contact.getEmail());
                intent.putExtra("phone",contact.getPhone());
                intent.putExtra("img",contact.getProfile_img());
                intent.putExtra("blood_group",contact.getBlood_group());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return contactList.size();
    }
}
