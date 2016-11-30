package com.mild.pc.mildsyunifang.fragment;

import android.view.View;
import android.widget.TextView;

import com.mild.pc.mildsyunifang.R;
import com.mild.pc.mildsyunifang.application.Myapplication;
import com.mild.pc.mildsyunifang.base.BaseFragment;
import com.mild.pc.mildsyunifang.okhttp.OkHttpUtils;
import com.mild.pc.mildsyunifang.view.ShowingPage;

/**
 * -- Chinese name: 张文博
 * -- English name: mild
 * -- date:2016/11/28
 * -- time:14:47分钟
 * -- DATADIR:com.mild.pc.mildsyunifang.fragment
 */
public class HomeFragment extends BaseFragment {

    private String s;

    @Override
    protected void onLoad() {
        new Thread(){
            @Override
            public void run() {
                super.run();
                HomeFragment.this.showCurrentPage(ShowingPage.StateType.STATE_LOAD_SUCCESS);
                s = OkHttpUtils.get("http://www.baidu.com");

            }
        }.start();

    }

    @Override
    public View createSuccessView() {
        View vie = View.inflate(Myapplication.getContext(), R.layout.homefragment,null);
        TextView textView = (TextView) vie.findViewById(R.id.home_tv);
        textView.setText(s+":::::");
        return vie;
    }
}
