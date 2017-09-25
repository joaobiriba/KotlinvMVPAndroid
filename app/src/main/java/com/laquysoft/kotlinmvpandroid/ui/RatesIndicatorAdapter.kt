package com.laquysoft.kotlinmvpandroid.ui

import android.app.Fragment
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import com.laquysoft.kotlinmvpandroid.R
import org.jetbrains.anko.AnkoLogger

/**
 * Created by joaobiriba on 24/09/2017.
 */

class RatesIndicatorAdapter(private val context: Context, private val currenciesList: MutableList<Float>, fragment: Fragment) : RecyclerView.Adapter<RatesIndicatorAdapter.CurrencyViewHolder>(), AnkoLogger {


    override fun onCreateViewHolder(viewGroup: ViewGroup?, viewType: Int): CurrencyViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.item_indicator_layout, viewGroup, false)
        return RatesIndicatorAdapter.CurrencyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CurrencyViewHolder?, position: Int) {
        var currency = currenciesList[position]
        holder!!.itemTitle!!.setText(currency.toString())
    }

    override fun getItemCount(): Int {
        return currenciesList.size
    }

    class CurrencyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        @BindView(R.id.itemTitle)
        @JvmField var itemTitle: TextView? = null
       init {
           ButterKnife.bind(this, itemView)
        }

    }

}