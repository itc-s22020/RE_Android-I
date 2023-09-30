package jp.ac.it_college.std.s22020.listviewreplacesample

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import jp.ac.it_college.std.s22020.listviewreplacesample.databinding.MenuRowBinding

class MenuListAdapter(
    private val data: List<String>
) : RecyclerView.Adapter<MenuListAdapter.ViewHolder>() {

    class ViewHolder(val binding: MenuRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = MenuRowBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvMenu.text = data[position]
        holder.binding.root.setOnClickListener {
            val msg = it.context.resources.getString(R.string.toast_msg, data[position])
            Toast.makeText(it.context, msg, Toast.LENGTH_LONG).show()
        }
    }
}