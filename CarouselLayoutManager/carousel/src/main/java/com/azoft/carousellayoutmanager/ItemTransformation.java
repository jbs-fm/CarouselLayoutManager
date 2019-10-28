package com.azoft.carousellayoutmanager;

public class ItemTransformation {

    final float mScaleX;
    final float mScaleY;
    final float mTranslationX;
    final float mTranslationY;
    final Float mPivotX;
    final Float mPivotY;

    public ItemTransformation(
            final float scaleX,
            final float scaleY,
            final float translationX,
            final float translationY,
            final Float pivotX,
            final Float pivotY) {
        mScaleX = scaleX;
        mScaleY = scaleY;
        mTranslationX = translationX;
        mTranslationY = translationY;
        mPivotX = pivotX;
        mPivotY = pivotY;
    }
}