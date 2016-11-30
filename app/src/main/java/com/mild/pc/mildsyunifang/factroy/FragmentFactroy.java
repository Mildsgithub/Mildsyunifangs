package com.mild.pc.mildsyunifang.factroy;

import android.support.v4.app.Fragment;

import com.mild.pc.mildsyunifang.fragment.CartFragment;
import com.mild.pc.mildsyunifang.fragment.CategoryFragment;
import com.mild.pc.mildsyunifang.fragment.HomeFragment;
import com.mild.pc.mildsyunifang.fragment.MineFragment;

import java.util.HashMap;

/**
 * -- Chinese name: 张文博
 * -- English name: mild
 * -- date:2016/11/28
 * -- time:15:02分钟
 * -- DATADIR:com.mild.pc.mildsyunifang.factroy
 */
public class FragmentFactroy {
    public static HashMap<Integer,Fragment> fragmentHashMap = new HashMap<>();
    public static Fragment getFragment(int position) {
        Fragment fragment = fragmentHashMap.get(position);
        if (fragment != null) {
            return fragment;
        }
        switch (position) {
            case 0:
                fragment=new HomeFragment();
                break;
            case 1:
                fragment=new CategoryFragment();
                break;
            case 2:
                fragment=new CartFragment();
                break;
            case 3:
                fragment=new MineFragment();
                break;
        }
        //添加到集合中
        fragmentHashMap.put(position,fragment);
        return  fragment;
    }
}
