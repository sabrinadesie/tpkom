package com.gawe.tpkom;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ListOnlineViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView txtEmail;
    public TextView txtNama;
    public TextView txtLng;
    public CardView cardView ;
    public EditText editEmail;
    public TextView txtJam;


    ItemClickListener itemClickListener;
    public ListOnlineViewHolder(View itemView) {
        super(itemView);
        txtEmail = (TextView)itemView.findViewById(R.id.txt_email);
        txtNama = (TextView)itemView.findViewById(R.id.txt_nama);
//        txtLng = (TextView)itemView.findViewById(R.id.txt_lng);
        cardView = (CardView)itemView.findViewById(R.id.cardView);
        txtJam = (TextView)itemView.findViewById(R.id.txt_jam);


        cardView.setOnClickListener(this);


    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view,getAdapterPosition());

    }
}
