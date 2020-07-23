package com.cos.instagramui;



import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.MyViewHolder> {

    private static final String TAG = "ProfileAdapter";
    //무조건 필요!
    private List<Profile> items = new ArrayList<>();

    public void addItem(Profile profile){
        items.add(profile);
    }

    // 껍데기만 만들어 줌ㅡ> 첫번째로 실행
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_profile, parent, false);
        Log.d(TAG, "onCreateViewHolder: 껍데기"+ view);
        return new MyViewHolder(view);
    }
    // 껍데기에 데이터바인딩 해줌 ㅡ>두번째로 실행
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Profile profile = items.get(position);
        holder.setItem(profile);
    }

    @Override
    public int getItemCount() {
        Log.d(TAG, "getItemCount: size" + items.size());
        return items.size();
    }

    //viewHolder (뷰들의 책꽂이)
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        //규칙1
        private TextView tvTitle;
        private ImageView ivImgResource;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            //규칙2
            tvTitle = itemView.findViewById(R.id.tv_title);
            ivImgResource = itemView.findViewById(R.id.iv_img_resource);
        }
        //규칙3
        public void setItem(Profile profile){
            tvTitle.setText(profile.getTitle());
            ivImgResource.setImageResource(profile.getImgResource());
        }
    }
}
