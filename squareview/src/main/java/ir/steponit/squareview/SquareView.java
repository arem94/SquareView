package ir.steponit.squareview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by AmirReza on 12/6/2016.
 */
public class SquareView extends LinearLayout {
    TypedArray a;
    float ratio = 1;
    int type = 3;
    public SquareView(Context context) {
        super(context);
    }

    public SquareView(Context context, AttributeSet attrs) {
        super(context, attrs);
        a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.SquareView,
                0, 0);
        try {
            ratio = a.getFloat(R.styleable.SquareView_ratio,1);
            type = a.getInt(R.styleable.SquareView_according,3);
        } finally {
            a.recycle();
        }
    }

    public SquareView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = MeasureSpec.getSize(heightMeasureSpec);

        switch (type){
            case 1:
                super.onMeasure(
                        MeasureSpec.makeMeasureSpec(width, MeasureSpec.EXACTLY),
                        MeasureSpec.makeMeasureSpec((int) (width*ratio), MeasureSpec.EXACTLY)
                );
                break;
            case 2:
                super.onMeasure(
                        MeasureSpec.makeMeasureSpec((int) (height*ratio), MeasureSpec.EXACTLY),
                        MeasureSpec.makeMeasureSpec(height, MeasureSpec.EXACTLY)
                );
                break;
            case 3:
                if(width < height) {
                    super.onMeasure(
                            MeasureSpec.makeMeasureSpec(width, MeasureSpec.EXACTLY),
                            MeasureSpec.makeMeasureSpec((int) (width*ratio), MeasureSpec.EXACTLY)
                    );
                } else {
                    super.onMeasure(
                            MeasureSpec.makeMeasureSpec((int) (height*ratio), MeasureSpec.EXACTLY),
                            MeasureSpec.makeMeasureSpec(height, MeasureSpec.EXACTLY)
                    );
                }
                break;
            default:
                if(width < height) {
                    super.onMeasure(
                            MeasureSpec.makeMeasureSpec(width, MeasureSpec.EXACTLY),
                            MeasureSpec.makeMeasureSpec((int) (width*ratio), MeasureSpec.EXACTLY)
                    );
                } else {
                    super.onMeasure(
                            MeasureSpec.makeMeasureSpec((int) (height*ratio), MeasureSpec.EXACTLY),
                            MeasureSpec.makeMeasureSpec(height, MeasureSpec.EXACTLY)
                    );
                }
                break;
        }
    }
}
