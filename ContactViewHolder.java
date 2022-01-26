package com.bijoy.customerrecicler;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContactViewHolder extends RecyclerView.ViewHolder {

    CircleImageView profile_img;
    TextView name,email,phone,blood_group;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);

        profile_img=itemView.findViewById(R.id.profile_image);
        name=itemView.findViewById(R.id.name);
        email=itemView.findViewById(R.id.email);
        phone=itemView.findViewById(R.id.phone);
        blood_group=itemView.findViewById(R.id.blood_group);
    }
}
