package io.linlangli.imoney.view.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import io.linlangli.imoney.R

class TopBar
@JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr), View.OnClickListener {

    private var iBtnListOrChart: IBtnListOrChart? = null
    private var iBtnRobot: IBtnRobot? = null
    private var iBtnShare: IBtnShare? = null

    private var isChart = false

    companion object {
        @Volatile
        private var topBar : TopBar? = null

        fun instant(
            context: Context,
            attrs: AttributeSet? = null,
            defStyleAttr: Int = 0) : TopBar?
        {
            if (topBar == null) {
                synchronized(TopBar::class) {
                    return TopBar(context, attrs, defStyleAttr)
                }
            }
            return topBar
        }
    }

    fun initView(
        iBtnListOrChart: IBtnListOrChart,
        iBtnRobot: IBtnRobot,
        iBtnShare: IBtnShare
    ) {
        this.iBtnListOrChart = iBtnListOrChart
        this.iBtnRobot = iBtnRobot
        this.iBtnShare = iBtnShare
    }

    init {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.widget_topbar, this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.imgBtn_robot ->  iBtnRobot?.onClick()
            R.id.imgBtn_list_chart -> {
                iBtnListOrChart?.onClick(isChart)
                isChart = !isChart
            }
            R.id.imgBtn_share -> iBtnShare?.onClick()
        }
    }

    interface IBtnListOrChart {
        fun onClick(isChart : Boolean)
    }
    interface IBtnRobot {
        fun onClick()
    }
    interface IBtnShare {
        fun onClick()
    }
}