package com.example.healthblog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageAdapter extends PagerAdapter {

    private Context mContext;
    private int[] mImageIds = new int[] {R.drawable.a,R.drawable.b, R.drawable.c, R.drawable.d,R.drawable.e, R.drawable.f , R.drawable.h,R.drawable.j, R.drawable.k};

    ImageAdapter (Context context) {
        mContext = context;
    }
    @Override
    public int getCount() {
        return mImageIds.length;
    }
    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view == o;
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageIds[position]);
        container.addView(imageView,0);
        return imageView;
    }
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView)object);
    }
}
