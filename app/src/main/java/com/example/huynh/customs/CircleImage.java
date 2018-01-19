package com.example.huynh.customs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PixelFormat;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import com.bumptech.glide.Glide;
import com.example.huynh.mxh.R;

import static android.graphics.Color.BLACK;


/**
 * Created by huynh on 1/19/2018.
 */

public class CircleImage extends AppCompatImageView
{
    private int mBorderColor;
    private int mImageResource;
    private int mImageSize;
    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Paint mBorderPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private static final float STROKE_WIDTH = 5f;
    private Drawable mDrawable;
    private RectF mRect = new RectF();
    private Path mClipPath = new Path();

    public CircleImage(Context context) {
        super(context);
        khoiTao();
    }

    public CircleImage(Context context, AttributeSet attrs) {
        super(context, attrs);
        layThuocTinh(attrs);
        khoiTao();
    }

    public CircleImage(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        layThuocTinh(attrs);
        khoiTao();
    }

    private void layThuocTinh(AttributeSet attr){
        TypedArray typedArray = getContext()
                .getTheme()
                .obtainStyledAttributes(attr, R.styleable.circleImage,0,0);

        try {
            mBorderColor = typedArray.getColor(R.styleable.circleImage_border_color,getResources().getColor(R.color.colorAccent));
            mImageResource = typedArray.getInteger(R.styleable.circleImage_src,R.drawable.neko1);
        }finally {
            typedArray.recycle();
        }
    }

    private void khoiTao(){
        /**
         * Below Jelly Bean, clipPath on canvas would not work because lack of hardware acceleration
         * support. Hence, we should explicitly say to use software acceleration.
         **/
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.ICE_CREAM_SANDWICH
                && Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            setLayerType(LAYER_TYPE_SOFTWARE, null);
        }

        mImageSize = getContext().getResources().getDimensionPixelSize(R.dimen.dp_60);
        setBorderColor(mBorderColor);
    }

    /**
     * create placeholder drawable
     */
    private void createDrawable(){
        mDrawable = new Drawable() {
            @Override
            public void draw(@NonNull Canvas canvas) {
                int centerX = Math.round(canvas.getWidth()*0.5f);
                int centerY = Math.round(canvas.getHeight()*0.5f);

                /**
                 * draw a circle shape for placeholder image
                 */
                canvas.drawCircle(centerX,centerY,canvas.getHeight()/2,mPaint);
                canvas.drawCircle(centerX,centerY,canvas.getHeight()/2,mBorderPaint);
            }

            @Override
            public void setAlpha(@IntRange(from = 0, to = 255) int i) {

            }

            @Override
            public void setColorFilter(@Nullable ColorFilter colorFilter) {

            }

            @Override
            public int getOpacity() {
                return PixelFormat.UNKNOWN;
            }
        };
    }

    private void fillImages(){
        mPaint.setColor(BLACK);
        createDrawable();
        Glide.with(getContext())
                .load(mImageResource)
                .placeholder(mDrawable)
                .centerCrop()
                .override(mImageSize,mImageSize)
                .into(this);
    }

    /**
     * Set the canvas bounds here
     **/
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int screenWidth = MeasureSpec.getSize(widthMeasureSpec);
        int screenHeight = MeasureSpec.getSize(heightMeasureSpec);
        mRect.set(0,0,screenWidth,screenHeight);
        showImage();
    }

    @Override
    protected void onDraw(Canvas canvas) {

        float borderWidth = 1f;
        canvas.drawCircle(mRect.centerX(), mRect.centerY(),(mRect.height() / 2)-borderWidth, mPaint);
        canvas.drawCircle(mRect.centerX(), mRect.centerY(), (mRect.height() / 2) - borderWidth, mBorderPaint);
        mClipPath.addCircle(mRect.centerX(), mRect.centerY(), (mRect.height() / 2), Path.Direction.CW);
        canvas.clipPath(mClipPath);
        super.onDraw(canvas);
        showImage();
    }

    public void showImage() {
        fillImages();
    }

    private void setBorderColor(int color){
        mBorderPaint.setColor(color);
        mBorderPaint.setStyle(Paint.Style.STROKE);
        mBorderPaint.setAntiAlias(true);
        mBorderPaint.setStrokeWidth(STROKE_WIDTH);
        invalidate();
    }
}
