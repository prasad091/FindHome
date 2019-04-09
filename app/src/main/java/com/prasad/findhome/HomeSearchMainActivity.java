package com.prasad.findhome;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.prasad.findhome.adapter.CategoryAdapter;
import com.prasad.findhome.adapter.HintAdapter;
import com.prasad.findhome.adapter.SearchPrefAdapter;
import com.prasad.findhome.helper.CirclePagerIndicatorDecoration;
import com.prasad.findhome.model.CategoryModel;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;


public class HomeSearchMainActivity extends AppCompatActivity {

    @BindView(R.id.userImage)
    ImageView userImage;

    @BindView(R.id.appPrefRecyclerView)
    RecyclerView appPrefRecyclerView;
    @BindView(R.id.categoryRecylerView)
    RecyclerView categoryRecylerView;

    @BindView(R.id.hintRecyclerView)
    RecyclerView hintRecyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Glide.with(this)
                .load(R.drawable.avatar_1)
                .apply(RequestOptions.circleCropTransform())
                .into(userImage);
        onAppPrefRecycler();
        onCategoryRecycler();
        onHintRecycler();
    }

    private void onAppPrefRecycler() {
        List<String> data = new ArrayList<>();
        data.add("For Sale");
        data.add("< $200k");
        data.add("Residence");
        data.add("Rent");
        data.add("Apartment");
        appPrefRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayout.HORIZONTAL,false));
        appPrefRecyclerView.setAdapter(new SearchPrefAdapter(this,data));
    }

    private void onCategoryRecycler(){
        List<CategoryModel> data = new ArrayList<>();
        data.add(new CategoryModel(R.drawable.ic_house_outline,"House"));
        data.add(new CategoryModel(R.drawable.ic_apartment,"Apartment"));
        data.add(new CategoryModel(R.drawable.ic_stall,"Stall"));
        categoryRecylerView.setLayoutManager(new LinearLayoutManager(this, LinearLayout.HORIZONTAL,false));
        categoryRecylerView.setAdapter(new CategoryAdapter(this,data));
    }

    private void onHintRecycler(){
        hintRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayout.HORIZONTAL,false));
        hintRecyclerView.addItemDecoration(new CirclePagerIndicatorDecoration());
        hintRecyclerView.setAdapter(new HintAdapter(this));
    }
}
