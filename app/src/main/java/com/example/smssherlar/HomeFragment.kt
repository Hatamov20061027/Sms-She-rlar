package com.example.smssherlar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.smssherlar.Models.ListObject
import com.example.smssherlar.Models.SherRaqami
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {
  lateinit var root:View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root=inflater.inflate(R.layout.fragment_home, container, false)

        root.saqlanganlar_count.text = (ListObject.arrayList.size).toString()
        root.btn_sevgi.setOnClickListener {
            SherRaqami.qaysiSher=0
            root.findNavController().navigate(R.id.sherlar)
        }
        root.btn_soginch.setOnClickListener {
            SherRaqami.qaysiSher=1
            root.findNavController().navigate(R.id.sherlar)
        }
        root.btn_tabrik.setOnClickListener {
            SherRaqami.qaysiSher=2
            root.findNavController().navigate(R.id.sherlar)
        }
        root.btn_otaona.setOnClickListener {
            SherRaqami.qaysiSher=3
            root.findNavController().navigate(R.id.sherlar)
        }
        root.btn_dostlik.setOnClickListener {
            SherRaqami.qaysiSher=4
            root.findNavController().navigate(R.id.sherlar)
        }
        root.btn_hazil.setOnClickListener {
            SherRaqami.qaysiSher=5
            root.findNavController().navigate(R.id.sherlar)
        }
        root.btn_yangilar.setOnClickListener {
            SherRaqami.qaysiSher=7
            root.findNavController().navigate(R.id.sherlar)
        }
        root.btn_saqlanganlar.setOnClickListener {
            SherRaqami.qaysiSher=6
            root.findNavController().navigate(R.id.sherlar)
        }
        return root
    }


}