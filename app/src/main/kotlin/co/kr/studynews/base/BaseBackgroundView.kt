package co.kr.studynews.base

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

abstract class BaseBackgroundView : FrameLayout {
    constructor(context: Context) : this(context, null)
    constructor(context: Context, attr: AttributeSet?) : this(context, attr, 0)
    constructor(context: Context, attr: AttributeSet?, defStyleAttr: Int) : super(context, attr, defStyleAttr)

    abstract fun init()
    abstract fun initView()
    abstract fun initViewModel()
    abstract fun bindView()
}