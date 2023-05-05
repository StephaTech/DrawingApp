package com.example.drawingapp

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import com.google.android.material.shape.ShapePath.PathQuadOperation


class DrawingView(context: Context, attrs: AttributeSet) : View(context, attrs){

    private var mDrawPath: CustomPath? = null
    private var mCanvasBitmap: Bitmap? = null
    private var mDrawPaint: Paint? = null
    private var mCanvasPaint: Paint?  = null
    private var mBrushSize: Float = 0.toFloat()
    private var color = Color.BLACK
    private var canvas: Canvas? = null

    init{
        setUpDrawing() //method
    }

    private fun setUpDrawing(){ //function
        mDrawPaint = Paint() //object
        mDrawPath = CustomPath(color,mBrushSize)
        mDrawPaint!!.color = color
        mDrawPaint!!.style = Paint.Style.STROKE
        mDrawPaint!!.strokeJoin = Paint.Join.ROUND
        mDrawPaint!!.strokeCap = Paint.Cap.ROUND
        mCanvasPaint = Paint(Paint.DITHER_FLAG)
        mBrushSize = 20.toFloat()
    }

    internal inner class CustomPath(var color: Int,
                                    var brushThickness: Float) : Path(){

    }






}