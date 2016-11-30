package com.mild.pc.mildsyunifang.fragment;

import android.view.View;

import com.mild.pc.mildsyunifang.R;
import com.mild.pc.mildsyunifang.application.Myapplication;
import com.mild.pc.mildsyunifang.base.BaseFragment;
import com.mild.pc.mildsyunifang.utils.LogUtils;
import com.mild.pc.mildsyunifang.view.ShowingPage;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;
/**
 * -- Chinese name: 张文博
 * -- English name: mild
 * -- date:2016/11/28
 * -- time:14:46分钟
 * -- DATADIR:com.mild.pc.mildsyunifang.fragment
 */
public class CartFragment extends BaseFragment {
    private String s;
    @Override
    protected void onLoad() {
        RequestParams re=new RequestParams("http://www.baidu.com");
        //去加载
        x.http().get(re, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String s) {
                //先赋值---
                CartFragment.this.s=s;
                CartFragment.this.showCurrentPage(ShowingPage.StateType.STATE_LOAD_SUCCESS);
                LogUtils.e("AAAAA","success-------cart-"+s);
            }

            @Override
            public void onError(Throwable throwable, boolean b) {

            }
            @Override
            public void onCancelled(CancelledException e) {
            }
            @Override
            public void onFinished() {
            }
        });
    }

    @Override
    public View createSuccessView() {
        View view = View.inflate(Myapplication.getContext(),R.layout.cartfragment,null);
        return view;
    }
}
