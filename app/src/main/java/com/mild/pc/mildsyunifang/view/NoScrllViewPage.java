package com.mild.pc.mildsyunifang.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * -- Chinese name: 张文博
 * -- English name: mild
 * -- date:2016/11/28
 * -- time:14:15分钟
 * -- DATADIR:com.mild.pc.mildsyunifang.view
 */
public class NoScrllViewPage extends ViewPager {


    public NoScrllViewPage(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NoScrllViewPage(Context context) {
        super(context);
    }
    /**
     * 不消费
     * @param ev
     * @return
     */
    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return false;
    }

    /**
     * 不阻断
     * @param ev
     * @return
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return false;
    }
}
