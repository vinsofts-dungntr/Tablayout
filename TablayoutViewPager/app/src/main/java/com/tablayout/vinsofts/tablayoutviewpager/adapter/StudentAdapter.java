package com.tablayout.vinsofts.tablayoutviewpager.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tablayout.vinsofts.tablayoutviewpager.R;
import com.tablayout.vinsofts.tablayoutviewpager.model.Student;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    Context context;
    List<Student> mList;

    public StudentAdapter(Context context, List<Student> mList) {
        this.context = context;
        this.mList = mList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(context).inflate(R.layout.layout_item_recyclerview,viewGroup,false);
        return new StudentHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        Student models=mList.get(i);
        StudentHolder holder;
        holder= (StudentHolder) viewHolder;
        holder.tvName.setText(models.getName());
        holder.tvXepLoai.setText(models.getXepLoai());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public static class StudentHolder extends RecyclerView.ViewHolder{
        TextView tvName;
        TextView tvXepLoai;
        public StudentHolder(@NonNull View itemView) {
            super(itemView);
            tvName=itemView.findViewById(R.id.tvName);
            tvXepLoai=itemView.findViewById(R.id.xeploai);
        }
    }

}
