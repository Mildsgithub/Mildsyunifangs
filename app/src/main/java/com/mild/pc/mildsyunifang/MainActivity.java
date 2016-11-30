package com.mild.pc.mildsyunifang;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.mild.pc.mildsyunifang.factroy.FragmentFactroy;
import com.mild.pc.mildsyunifang.view.NoScrllViewPage;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.vp_main)
    NoScrllViewPage vpMain;
    @InjectView(R.id.rb_home_page)
    RadioButton rbHomePage;
    @InjectView(R.id.rb_category)
    RadioButton rbCategory;
    @InjectView(R.id.rb_cart)
    RadioButton rbCart;
    @InjectView(R.id.rb_mine)
    RadioButton rbMine;
    @InjectView(R.id.rg_main)
    RadioGroup rgMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        //viewpager 适配器
        vpMain.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return FragmentFactroy.getFragment(position);
            }

            @Override
            public int getCount() {
                return 4;
            }
        });
        //对group设置监听
        rgMain.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.rb_home_page:
                        Drawable drawable = getResources().getDrawable(R.mipmap.bottom_tab_home_selected);
                        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                        rbHomePage.setCompoundDrawables(null, drawable, null, null);
                        Drawable drawable1 = getResources().getDrawable(R.mipmap.bottom_tab_classify_normal);
                        drawable1.setBounds(0, 0, drawable1.getMinimumWidth(), drawable1.getMinimumHeight());
                        rbCategory.setCompoundDrawables(null, drawable1, null, null);
                        Drawable drawable2 = getResources().getDrawable(R.mipmap.bottom_tab_shopping_normal);
                        drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
                        rbCart.setCompoundDrawables(null, drawable2, null, null);
                        Drawable drawable3 = getResources().getDrawable(R.mipmap.bottom_tab_user_normal);
                        drawable3.setBounds(0, 0, drawable3.getMinimumWidth(), drawable3.getMinimumHeight());
                        rbMine.setCompoundDrawables(null, drawable3, null, null);
                        rbHomePage.setTextColor(Color.rgb(252, 107, 135));
                        rbCategory.setTextColor(Color.rgb(1, 1, 1));
                        rbCart.setTextColor(Color.rgb(1, 1, 1));
                        rbMine.setTextColor(Color.rgb(1, 1, 1));
                        vpMain.setCurrentItem(0);
                        break;
                    case R.id.rb_category:
                        Drawable drawabl = getResources().getDrawable(R.mipmap.bottom_tab_home_normal);
                        drawabl.setBounds(0, 0, drawabl.getMinimumWidth(), drawabl.getMinimumHeight());
                        rbHomePage.setCompoundDrawables(null, drawabl, null, null);
                        Drawable drawab = getResources().getDrawable(R.mipmap.bottom_tab_classify_selected);
                        drawab.setBounds(0, 0, drawab.getMinimumWidth(), drawab.getMinimumHeight());
                        rbCategory.setCompoundDrawables(null, drawab, null, null);
                        Drawable drawa = getResources().getDrawable(R.mipmap.bottom_tab_shopping_normal);
                        drawa.setBounds(0, 0, drawa.getMinimumWidth(), drawa.getMinimumHeight());
                        rbCart.setCompoundDrawables(null, drawa, null, null);
                        Drawable draw = getResources().getDrawable(R.mipmap.bottom_tab_user_normal);
                        draw.setBounds(0, 0, draw.getMinimumWidth(), draw.getMinimumHeight());
                        rbMine.setCompoundDrawables(null, draw, null, null);
                        rbCategory.setTextColor(Color.rgb(252, 107, 135));
                        rbHomePage.setTextColor(Color.rgb(1, 1, 1));
                        rbCart.setTextColor(Color.rgb(1, 1, 1));
                        rbMine.setTextColor(Color.rgb(1, 1, 1));
                        vpMain.setCurrentItem(1);
                        break;
                    case R.id.rb_cart:

                        Drawable d = getResources().getDrawable(R.mipmap.bottom_tab_home_normal);
                        d.setBounds(0, 0, d.getMinimumWidth(), d.getMinimumHeight());
                        rbHomePage.setCompoundDrawables(null, d, null, null);
                        Drawable d1 = getResources().getDrawable(R.mipmap.bottom_tab_classify_normal);
                        d1.setBounds(0, 0, d1.getMinimumWidth(), d1.getMinimumHeight());
                        rbCategory.setCompoundDrawables(null, d1, null, null);
                        Drawable d2 = getResources().getDrawable(R.mipmap.bottom_tab_shopping_selected);
                        d2.setBounds(0, 0, d2.getMinimumWidth(), d2.getMinimumHeight());
                        rbCart.setCompoundDrawables(null, d2, null, null);
                        Drawable d3 = getResources().getDrawable(R.mipmap.bottom_tab_user_normal);
                        d3.setBounds(0, 0, d3.getMinimumWidth(), d3.getMinimumHeight());
                        rbMine.setCompoundDrawables(null, d3, null, null);

                        rbCart.setTextColor(Color.rgb(252, 107, 135));
                        rbMine.setTextColor(Color.rgb(1, 1, 1));
                        rbCategory.setTextColor(Color.rgb(1, 1, 1));
                        rbHomePage.setTextColor(Color.rgb(1, 1, 1));
                        vpMain.setCurrentItem(2);
                        break;
                    case R.id.rb_mine:

                        Drawable dd = getResources().getDrawable(R.mipmap.bottom_tab_home_normal);
                        dd.setBounds(0, 0, dd.getMinimumWidth(), dd.getMinimumHeight());
                        rbHomePage.setCompoundDrawables(null, dd, null, null);
                        Drawable dd1 = getResources().getDrawable(R.mipmap.bottom_tab_classify_normal);
                        dd1.setBounds(0, 0, dd1.getMinimumWidth(), dd1.getMinimumHeight());
                        rbCategory.setCompoundDrawables(null, dd1, null, null);
                        Drawable dd2 = getResources().getDrawable(R.mipmap.bottom_tab_shopping_normal);
                        dd2.setBounds(0, 0, dd2.getMinimumWidth(), dd2.getMinimumHeight());
                        rbCart.setCompoundDrawables(null, dd2, null, null);
                        Drawable dd3 = getResources().getDrawable(R.mipmap.bottom_tab_user_selected);
                        dd3.setBounds(0, 0, dd3.getMinimumWidth(), dd3.getMinimumHeight());
                        rbMine.setCompoundDrawables(null, dd3, null, null);

                        rbMine.setTextColor(Color.rgb(252, 107, 135));
                        rbCart.setTextColor(Color.rgb(1, 1, 1));
                        rbCategory.setTextColor(Color.rgb(1, 1, 1));
                        rbHomePage.setTextColor(Color.rgb(1, 1, 1));

                        vpMain.setCurrentItem(3);
                        break;
                }
            }
        });
    }
}
