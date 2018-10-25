package com.tablayout.vinsofts.tablayoutviewpager.uis;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tablayout.vinsofts.tablayoutviewpager.R;
import com.tablayout.vinsofts.tablayoutviewpager.adapter.StudentAdapter;
import com.tablayout.vinsofts.tablayoutviewpager.model.Student;

import java.util.ArrayList;
import java.util.List;

public class TwoFragment extends Fragment {

    RecyclerView recyclerView;
    StudentAdapter adapter;
    List<Student> mList=new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_2,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recyclerview);
        getFakeData();
        adapter=new StudentAdapter(getActivity(),mList);
        GridLayoutManager manager=new GridLayoutManager(getActivity(),2);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }

    public void getFakeData(){
        mList.add(new Student("Nguyễn Trí Dũng","Khá"));
        mList.add(new Student("Trần Văn Thịnh","Gioi"));
        mList.add(new Student("Nguyễn Văn Hoàng","Kém"));
        mList.add(new Student("Nguyễn Thị Thơm","Trung Bình"));
        mList.add(new Student("Nguyễn Trí Hưng","Khá"));
        mList.add(new Student("Nguyễn Trí Dũng","Khá"));
        mList.add(new Student("Nguyễn Trí Dũng","Khá"));
        mList.add(new Student("Nguyễn Trí Dũng","Khá"));
        mList.add(new Student("Nguyễn Trí Dũng","Khá"));
        mList.add(new Student("Nguyễn Trí Dũng","Khá"));
    }
}
