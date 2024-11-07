package com.viethcn.myapplication.Views;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.viethcn.myapplication.Models.Product;
import com.viethcn.myapplication.Adapters.ProductAdapter;
import com.viethcn.myapplication.R;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {

    // Obj của thư viện bên t3, và các bên liên quan
    ImageSlider imgSlider;
    List<SlideModel> imgList = new ArrayList<>();

    List<Product> listProduct = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Tham chiếu imgSlier đến layout và gắn hình lên imgSlider bằng phương thức setImgSlider
        imgSlider = findViewById(R.id.image_slider);
        setImgSlider();

        //
        RecyclerView productRcv = findViewById(R.id.productRcV);
        listProduct.add(new Product(R.drawable.product01, "Banh mi", 12000));
        listProduct.add(new Product(R.drawable.product01, "Banh my", 13000));
        listProduct.add(new Product(R.drawable.product01, "Banh mi's", 14000));
        listProduct.add(new Product(R.drawable.product01, "Banh my's", 15000));

        ProductAdapter adapter = new ProductAdapter(this, listProduct);
        productRcv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        productRcv.setAdapter(adapter);
    }

    // Phương thức này để setImgSlider bằng thư viện bên t3
    private void setImgSlider() {
        imgList.add(new SlideModel(R.drawable.banner01, ScaleTypes.FIT));
        imgList.add(new SlideModel(R.drawable.banner02, ScaleTypes.FIT));
        imgSlider.setImageList(imgList);
    }


}
