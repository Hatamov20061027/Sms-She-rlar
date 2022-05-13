package com.example.smssherlar.Adapters

import android.app.AlertDialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.smssherlar.Models.ListObject
import com.example.smssherlar.Models.Model1
import com.example.smssherlar.R
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.item_dialog.*
import kotlinx.android.synthetic.main.item_simple_poem.view.*

class SimpleAdapter (var n:Int,var context1: Context,var list: List<Model1>): RecyclerView.Adapter<SimpleAdapter.VH>() {
    inner class VH(var itemRv: View): RecyclerView.ViewHolder(itemRv){
        fun onBind(model1: Model1,position: Int){
            when(n){
                0->itemRv.simple_item_yurek.visibility = View.INVISIBLE
                2->itemRv.simple_item_yurek.visibility = View.VISIBLE
            }
            itemRv.simple_item_yurek.visibility = View.INVISIBLE
            itemRv.item_poem_name.text = model1.sherNomi
            itemRv.item_poem_words.text = model1.sherIchi
            itemRv.setOnClickListener {
                creatDialog(context1,position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(LayoutInflater.from(parent.context).inflate(R.layout.item_simple_poem,parent,false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(list[position],position)
    }

    override fun getItemCount(): Int = list.size
    fun creatDialog(context: Context,position1: Int){
//        val alertDialog = AlertDialog.Builder(context)
//        val dialog = alertDialog.create()
//
//        dialog.setTitle("Title Custom dialog")
//        val dialogView = LayoutInflater.from(context).inflate(R.layout.item_dialog, null, false)
//        dialog.setView(dialogView)
//        dialog.show()

        val bottomSheetDialog = BottomSheetDialog(context)

        bottomSheetDialog.setContentView(LayoutInflater.from(context).inflate(R.layout.item_dialog, null, false))
        bottomSheetDialog.setCancelable(true)

        bottomSheetDialog.item_dialog_select.setOnClickListener {
            ListObject.arrayList.add(list[position1])
            bottomSheetDialog.dismiss()
        }

        bottomSheetDialog.show()
    }
}







