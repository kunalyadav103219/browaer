package fulguris.adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import fulguris.R
import fulguris.data.LinkItem

class ImageAdapter(private val context: Context, private var links: List<LinkItem>) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {
    interface OnItemClickListener {
        fun onItemClick(link: LinkItem)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val link = links[position]
        Glide.with(context)
            .load(link.imageUrl)
            .into(holder.imageView)

        holder.itemView.setOnClickListener {
            (context as? OnItemClickListener)?.onItemClick(link)
        }
    }


    override fun getItemCount(): Int {
        return links.size
    }

    fun updateData(newLinks: List<LinkItem>) {
        links = newLinks
        notifyDataSetChanged()
    }
    fun getListSize(): List<LinkItem> {
        return links.toList()
    }
    class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)


    }
}
