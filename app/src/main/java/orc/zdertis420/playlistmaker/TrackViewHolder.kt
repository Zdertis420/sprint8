package orc.zdertis420.playlistmaker

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import java.text.SimpleDateFormat
import java.util.Locale

class TrackViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val trackNameView: TextView = itemView.findViewById(R.id.track_name)
    private val artistNameView: TextView = itemView.findViewById(R.id.author)
    private val trackTimeView: TextView = itemView.findViewById(R.id.track_time)
    private val trackImageView: ShapeableImageView = itemView.findViewById(R.id.track_image)

//    val scroller = Scroller(trackNameView.context)
//    private val scrollRunnable = object : Runnable {
//        override fun run() {
//            if (scroller.computeScrollOffset()) {
//                trackNameView.scrollTo(scroller.currX, scroller.currY)
//                trackNameView.post(this) // Continue scrolling
//            }
//        }
//    }

    fun bind(model: Track) {
//        trackNameView.post {
//            trackNameView.requestFocus()
//
//            if (trackNameView.layout.getEllipsisCount(trackNameView.lineCount - 1) > 0) {
//                val scrollAmount =
//                    trackNameView.layout.getLineWidth(trackNameView.lineCount - 1) - trackNameView.width
//
//                scroller.startScroll(0, 0, scrollAmount.toInt(), 0, 2500)
//
//                trackNameView.post(scrollRunnable)
//            }
//        }

        trackNameView.text = model.trackName
        artistNameView.text = model.artistName
        trackTimeView.text = SimpleDateFormat("mm:ss", Locale.getDefault())
            .format(model.trackTimeMillis)
        Glide.with(itemView.context)
            .load(model.artworkUrl100)
            .timeout(2500)
            .placeholder(R.drawable.placeholder)
            .error(R.drawable.placeholder)
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .skipMemoryCache(true)
            .into(trackImageView)


    }
}
