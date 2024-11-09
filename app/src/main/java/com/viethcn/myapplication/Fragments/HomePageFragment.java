package com.viethcn.myapplication.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.viethcn.myapplication.Adapters.ProductAdapter;
import com.viethcn.myapplication.Models.Product;
import com.viethcn.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class HomePageFragment extends Fragment {

    RecyclerView productRcv;

    // Danh sách sản phẩm
    List<Product> listProduct = new ArrayList<>();

    // Obj của thư viện bên t3, và các bên liên quan
    ImageSlider imgSlider;
    List<SlideModel> imgList = new ArrayList<>();

    public HomePageFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listProduct.add(new Product(R.drawable.product01, "Banh mi", 12000));
        listProduct.add(new Product(R.drawable.product01, "Banh my", 13000));
        listProduct.add(new Product(R.drawable.product01, "Banh mi's", 14000));
        listProduct.add(new Product(R.drawable.product01, "Banh my's", 15000));
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View viewHolder = inflater.inflate(R.layout.fragment_home_page, container, false);

        // Khởi tạo recyclerView và set adapter
        productRcv = viewHolder.findViewById(R.id.productRcV);
        ProductAdapter adapter = new ProductAdapter(getContext(), listProduct);
        productRcv.setAdapter(adapter);
        productRcv.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        // Khởi tạo slider và set ảnh lên imgSlider
        imgSlider = viewHolder.findViewById(R.id.image_slider);
        setImgSlider();

        return viewHolder;
    }

    private void setImgSlider(){
        imgList.add(new SlideModel(R.drawable.banner01, ScaleTypes.FIT));
        imgList.add(new SlideModel(R.drawable.banner02, ScaleTypes.FIT));
        imgSlider.setImageList(imgList);

    }
}