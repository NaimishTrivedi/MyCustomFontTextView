package freebird.robototextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by mypc on 6/14/2016.
 */
public class RobotoTextView extends TextView {
    public RobotoTextView(Context context) {
        super(context);
        init(null);
    }

    public RobotoTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public RobotoTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        if (attrs!=null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.RobotoTextView);
            String fontName = a.getString(R.styleable.RobotoTextView_fontName);
            if (fontName!=null) {
                Typeface myTypeface = Typeface.createFromAsset(getContext().getAssets(), fontName);
                setTypeface(myTypeface);
            }
            a.recycle();
        }
    }
}
