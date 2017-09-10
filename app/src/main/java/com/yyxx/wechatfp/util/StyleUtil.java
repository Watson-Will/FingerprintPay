package com.yyxx.wechatfp.util;

import android.graphics.Color;
import android.widget.TextView;

/**
 * Created by Jason on 2017/9/9.
 */

public class StyleUtil {

    public static final float TEXT_SIZE_DEFAULT = 18.0f;
    public static final float TEXT_SIZE_BIG = 20.0f;
    public static final float TEXT_SIZE_SMALL = 16.0f;

    public static final int TEXT_COLOR_DEFAULT = Color.BLACK;
    public static final int TEXT_COLOR_SECONDARY = 0xFF8A9899;

    public static final int LINE_COLOR_DEFAULT = 0xFFE5E5E5;

    public static void apply(TextView textView) {
        textView.setTextSize(TEXT_SIZE_DEFAULT);
        textView.setTextColor(TEXT_COLOR_DEFAULT);
    }
}
