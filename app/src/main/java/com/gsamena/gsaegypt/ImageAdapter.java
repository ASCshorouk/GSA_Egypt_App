package com.gsamena.gsaegypt;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageAdapter extends PagerAdapter {
Context context;
private int[] GalImages = new int[] {
com.gsamena.gsaegypt.R.drawable.gsaone,
com.gsamena.gsaegypt.R.drawable.gsatwo,
com.gsamena.gsaegypt.R.drawable.gsathree,
com.gsamena.gsaegypt.R.drawable.gsafour,
com.gsamena.gsaegypt.R.drawable.gsafive,
com.gsamena.gsaegypt.R.drawable.gsasix,
com.gsamena.gsaegypt.R.drawable.gsaseven,
com.gsamena.gsaegypt.R.drawable.gsaeight,
com.gsamena.gsaegypt.R.drawable.gsanine,
com.gsamena.gsaegypt.R.drawable.gsaten,
com.gsamena.gsaegypt.R.drawable.gsaeleven,
com.gsamena.gsaegypt.R.drawable.gsatwelve,
com.gsamena.gsaegypt.R.drawable.gsathirteen,
com.gsamena.gsaegypt.R.drawable.gsafourteen


};
ImageAdapter(Context context){
this.context=context;
}
@Override
public int getCount() {
return GalImages.length;
}
 
@Override
public boolean isViewFromObject(View view, Object object) {
return view == ((ImageView) object);
}
 
@Override
public Object instantiateItem(ViewGroup container, int position) {
ImageView imageView = new ImageView(context);
int padding = context.getResources().getDimensionPixelSize(com.gsamena.gsaegypt.R.dimen.padding_medium);
imageView.setPadding(padding, padding, padding, padding);
imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
imageView.setImageResource(GalImages[position]);
((ViewPager) container).addView(imageView, 0);
return imageView;
}
 
@Override
public void destroyItem(ViewGroup container, int position, Object object) {
((ViewPager) container).removeView((ImageView) object);
}
}
