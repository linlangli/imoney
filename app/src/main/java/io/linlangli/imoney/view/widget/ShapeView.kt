package io.linlangli.imoney.view.widget

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.View
import io.linlangli.imoney.R

class ShapeView(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val style : TypedArray =
        context.obtainStyledAttributes(attrs, R.styleable.ShapeView)

    enum class Shape(){
        OVAL(),
        RECTANGLE()
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        if (style.getString(R.styleable.ShapeView_shape) == Shape.OVAL.name) {
            canvas?.let {
                drawOval(it)
            }
        } else {
            canvas?.let {
                drawRectangle(it)
            }
        }
    }

    private fun drawOval(canvas: Canvas) {
        val color = style.getColor(R.styleable.ShapeView_color,
            resources.getColor(R.color.theme_main_background, null))
        val width = style.getDimension(R.styleable.ShapeView_width, 0f)
        val height = style.getDimension(R.styleable.ShapeView_height, 0f)
    }

    private fun drawRectangle(canvas: Canvas) {

    }
}