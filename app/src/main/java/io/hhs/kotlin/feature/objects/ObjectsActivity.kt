package io.hhs.kotlin.feature.objects

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import io.hhs.kotlin.R
import kotlinx.android.synthetic.main.activty_objects.*

/**
 * @author hhs
 * Created on 2018/10/19
 */
class ObjectsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activty_objects)
        initToolBar()
        view_pager.pageMargin = resources.getDimensionPixelOffset(R.dimen.space_10)
        view_pager.adapter = ObjectsAdapter(supportFragmentManager)
        tab_layout.setupWithViewPager(view_pager)
    }

    private fun initToolBar() {
        val toolbar: Toolbar? = toolbar as Toolbar
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setTitle(R.string.activity_objects_title)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return when (item?.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else ->
                super.onOptionsItemSelected(item)
        }
    }
}