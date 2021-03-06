package io.mountx.wutai.feature.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.mountx.wutai.R
import io.mountx.wutai.feature.objects.ObjectsActivity

/**
 * @author Ha Sang
 * Created on 2018/10/22
 */

private const val KW_OBJECT = "object"

fun getActivityClassName(name: String?): String? {
    return when (name) {
        KW_OBJECT -> ObjectsActivity::class.java.name
        else -> null
    }
}

class EntryAdapter : RecyclerView.Adapter<EntryViewHolder>() {

    private val names = arrayOf(KW_OBJECT)

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): EntryViewHolder {
        return EntryViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.item_entry, p0, false))
    }

    override fun getItemCount(): Int {
        return names.size
    }

    override fun onBindViewHolder(p0: EntryViewHolder, p1: Int) {
        p0.updateView(names[p1])
    }

}