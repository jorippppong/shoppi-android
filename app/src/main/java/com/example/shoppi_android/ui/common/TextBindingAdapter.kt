package com.example.shoppi_android.ui.common

import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.example.shoppi_android.R
import java.text.DecimalFormat
import kotlin.math.roundToInt

//TODO : item_home_banner 에서 둘 다 사용하던데 왜...?
@BindingAdapter("priceAmount")
fun applyPriceFormat(view: TextView, price:Int){
    val decimalFormat = DecimalFormat("#,###")
    view.text = view.context.getString(R.string.unit_discount_currency, decimalFormat.format(price))
}

@BindingAdapter("priceAmount", "discountRate")
fun applyPriceDiscountRate(view:TextView, price:Int, discountRate:Int){
    val discountPrice = (((100-discountRate)/100.0)*price).roundToInt()
    applyPriceFormat(view, discountPrice)
}