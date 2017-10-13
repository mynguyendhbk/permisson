package sqlite.edu.nguyenmy.lesson4_permisson.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import sqlite.edu.nguyenmy.lesson4_permisson.R;
import sqlite.edu.nguyenmy.lesson4_permisson.activity.MainActivity;
import sqlite.edu.nguyenmy.lesson4_permisson.widget.ItemView;

/**
 * Created by DELL on 10/13/2017.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

 private List<ItemView> itemViews;

 public ItemAdapter(List<ItemView> items){
  this.itemViews = items;
 }

 @Override
 public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
  LayoutInflater inflater = LayoutInflater.from(parent.getContext());
  View view = inflater.inflate(R.layout.item_view, parent, false);
  return new ItemViewHolder(view);
 }

 @Override
 public void onBindViewHolder(ItemViewHolder holder, int position) {

  holder.textView.setText(itemViews.get(position).getmName());
  Picasso.with(holder.itemView.getContext())
          .load(itemViews.get(position).getmImg())
          .into(holder.imageView);
 }

 @Override
 public int getItemCount() {
  return itemViews.size();
 }

 public class ItemViewHolder extends RecyclerView.ViewHolder {
  private TextView textView;
  private ImageView imageView;
  public ItemViewHolder(View itemView) {
   super(itemView);
   textView = (TextView)itemView.findViewById(R.id.name);
   imageView = (ImageView)itemView.findViewById(R.id.image);
  }
 }

}
