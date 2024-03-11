package fulguris.adapter

import android.content.Context
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class infintelayoutmananger : LinearLayoutManager {

        constructor(context: Context) : super(context, HORIZONTAL, false)

        constructor(context: Context, orientation: Int, reverseLayout: Boolean) : super(context, orientation, reverseLayout)

        override fun scrollHorizontallyBy(dx: Int, recycler: RecyclerView.Recycler?, state: RecyclerView.State?): Int {
            val scrolled = super.scrollHorizontallyBy(dx, recycler, state)

            if (scrolled != 0) {
                val child = getChildAt(0) ?: return scrolled

                if (dx < 0 && getPosition(child) == 0) {
                    // Scrolling left and reached the start, loop to the end
                    scrollToPositionWithOffset(itemCount, 0)
                } else if (dx > 0 && getPosition(child) == itemCount - 1) {
                    // Scrolling right and reached the end, loop to the start
                    scrollToPositionWithOffset(0, 0)
                }
            }

            return scrolled
        }
    }
