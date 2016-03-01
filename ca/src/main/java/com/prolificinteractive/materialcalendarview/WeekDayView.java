package com.prolificinteractive.materialcalendarview;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Locale;

import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.SHORT;

/**
 * Display a day of the week
 */
public class WeekDayView extends TextView {

    public WeekDayView(Context context) {
        this(context, null);
    }

    public WeekDayView(Context context, AttributeSet attrs) {
        super(context, attrs);

        setGravity(Gravity.CENTER);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            setTextAlignment(TEXT_ALIGNMENT_CENTER);
        }

        if (isInEditMode()) {
            setText("Mon");
        }
    }

    public void setDayOfWeek(boolean flag, Calendar calendar) {
        if (flag) {
            setText("周数");
        } else {
            String name = calendar.getDisplayName(DAY_OF_WEEK, SHORT,
                    Locale.getDefault());
            setText(name);
        }
    }
}
