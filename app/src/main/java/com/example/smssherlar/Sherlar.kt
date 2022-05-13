package com.example.smssherlar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.contact_1.MyShare.MySharedPrefarance
import com.example.smssherlar.Adapters.SimpleAdapter
import com.example.smssherlar.Models.ListObject
import com.example.smssherlar.Models.Model1
import com.example.smssherlar.Models.SherRaqami
import kotlinx.android.synthetic.main.fragment_sherlar.view.*
import java.util.ArrayList

class Sherlar : Fragment() {
    lateinit var root:View
    lateinit var list: ArrayList<Model1>
    lateinit var list1: ArrayList<Model1>
    lateinit var simpleAdapter: SimpleAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        root= inflater.inflate(R.layout.fragment_sherlar, container, false)

        root.btn_back.setOnClickListener {
            root.findNavController().navigate(R.id.homeFragment)
        }
        list = ArrayList()
        when(SherRaqami.qaysiSher){
            0-> {
                root.type_of_poem.text="Sevgi Sherlari"
                loadDataSevgi()
                simpleAdapter= SimpleAdapter(0,root.context,list)

                root.rv_sherlar.adapter = simpleAdapter
            }
            1->{
                root.type_of_poem.text="Sog'inch Armon"
                loadDataSoginch()
                simpleAdapter= SimpleAdapter(0,root.context,list)
                root.rv_sherlar.adapter = simpleAdapter
            }
            2->{
                root.type_of_poem.text="Tabrik Sherlar"
                loadDataTabrik()
                simpleAdapter= SimpleAdapter(0,root.context,list)
                root.rv_sherlar.adapter = simpleAdapter
            }
            3->{
                root.type_of_poem.text="Ota Ona Haqida"
                loadDataOtaOna()
                simpleAdapter= SimpleAdapter(0,root.context,list)
                root.rv_sherlar.adapter = simpleAdapter
            }
            4->{
                root.type_of_poem.text="Do'stlik Haqida"
                loadDataDostlik()
                simpleAdapter= SimpleAdapter(0,root.context,list)
                root.rv_sherlar.adapter = simpleAdapter
            }
            5->{
                root.type_of_poem.text="Hazl She'rlar"
                loadDataHazil()
                simpleAdapter= SimpleAdapter(0,root.context,list)
                root.rv_sherlar.adapter = simpleAdapter
            }
            6->{
                MySharedPrefarance.init(root.context)
                list1 = ArrayList()
                list1=ListObject.arrayList
                MySharedPrefarance.contactList = list1
//                list1.addAll(MySharedPrefarance.contactList!!)
                root.type_of_poem.text="Saqlanganlar"
                simpleAdapter= SimpleAdapter(2,root.context,list1)
                root.rv_sherlar.adapter = simpleAdapter

            }
            7->{
                root.type_of_poem.text="Yangilar"
                loadDadaYangilar()
                simpleAdapter= SimpleAdapter(2,root.context,list)
                root.rv_sherlar.adapter = simpleAdapter
            }
        }

        return root
    }

    fun loadDadaYangilar(){
        list.add(Model1("Oshiq derlar meni","Sizni birinchi bor ko’rganimdayoq menga yoqib\n" +
                "qolgansiz, lekin bu tuyg’u sevgiga aylanadi deb\n" +
                "o’ylamagandim . . . ","Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                "Mayli xijron azobi qiynasin meni,\n" +
                "O’lsam ham baribir sevaman seni!"))
        list.add(Model1("SOG‘INISH","U uzoq joylarga qilmasdi safar,\n" +
                "To‘kmang derdi ko‘zdan jolalarimni.\n" +
                "Derdi: Bir kun...",
            "U uzoq joylarga qilmasdi safar,\n" +
                    "To‘kmang derdi ko‘zdan jolalarimni.\n" +
                    "Derdi: Bir kungina ko‘rmasam agar\n" +
                    "Sog‘inib qolaman bolalarimni"))
    }
    fun loadDataSevgi(){
        list.add(Model1("Oshiq derlar meni","Sizni birinchi bor ko’rganimdayoq menga yoqib\n" +
                "qolgansiz, lekin bu tuyg’u sevgiga aylanadi deb\n" +
                "o’ylamagandim . . . ","Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                "Mayli xijron azobi qiynasin meni,\n" +
                "O’lsam ham baribir sevaman seni!"))
        list.add(Model1("Oshiq derlar meni","Sizni birinchi bor ko’rganimdayoq menga yoqib\n" +
                "qolgansiz, lekin bu tuyg’u sevgiga aylanadi deb\n" +
                "o’ylamagandim . . . ","Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                "Mayli xijron azobi qiynasin meni,\n" +
                "O’lsam ham baribir sevaman seni!"))
        list.add(Model1("Oshiq derlar meni","Sizni birinchi bor ko’rganimdayoq menga yoqib\n" +
                "qolgansiz, lekin bu tuyg’u sevgiga aylanadi deb\n" +
                "o’ylamagandim . . . ","Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                "Mayli xijron azobi qiynasin meni,\n" +
                "O’lsam ham baribir sevaman seni!"))
        list.add(Model1("Oshiq derlar meni","Sizni birinchi bor ko’rganimdayoq menga yoqib\n" +
                "qolgansiz, lekin bu tuyg’u sevgiga aylanadi deb\n" +
                "o’ylamagandim . . . ","Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                "Mayli xijron azobi qiynasin meni,\n" +
                "O’lsam ham baribir sevaman seni!"))
        list.add(Model1("Oshiq derlar meni","Sizni birinchi bor ko’rganimdayoq menga yoqib\n" +
                "qolgansiz, lekin bu tuyg’u sevgiga aylanadi deb\n" +
                "o’ylamagandim . . . ","Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                "Mayli xijron azobi qiynasin meni,\n" +
                "O’lsam ham baribir sevaman seni!"))
        list.add(Model1("Oshiq derlar meni","Sizni birinchi bor ko’rganimdayoq menga yoqib\n" +
                "qolgansiz, lekin bu tuyg’u sevgiga aylanadi deb\n" +
                "o’ylamagandim . . . ","Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                "Mayli xijron azobi qiynasin meni,\n" +
                "O’lsam ham baribir sevaman seni!"))
        list.add(Model1("Oshiq derlar meni","Sizni birinchi bor ko’rganimdayoq menga yoqib\n" +
                "qolgansiz, lekin bu tuyg’u sevgiga aylanadi deb\n" +
                "o’ylamagandim . . . ","Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                "Mayli xijron azobi qiynasin meni,\n" +
                "O’lsam ham baribir sevaman seni!"))
    }
    fun loadDataSoginch(){
        list.add(Model1("SOG‘INISH","U uzoq joylarga qilmasdi safar,\n" +
                "To‘kmang derdi ko‘zdan jolalarimni.\n" +
                "Derdi: Bir kun...",
                "U uzoq joylarga qilmasdi safar,\n" +
                "To‘kmang derdi ko‘zdan jolalarimni.\n" +
                "Derdi: Bir kungina ko‘rmasam agar\n" +
                "Sog‘inib qolaman bolalarimni"))
        list.add(Model1("SOG‘INISH","U uzoq joylarga qilmasdi safar,\n" +
                "To‘kmang derdi ko‘zdan jolalarimni.\n" +
                "Derdi: Bir kun...",
            "U uzoq joylarga qilmasdi safar,\n" +
                    "To‘kmang derdi ko‘zdan jolalarimni.\n" +
                    "Derdi: Bir kungina ko‘rmasam agar\n" +
                    "Sog‘inib qolaman bolalarimni"))
        list.add(Model1("SOG‘INISH","U uzoq joylarga qilmasdi safar,\n" +
                "To‘kmang derdi ko‘zdan jolalarimni.\n" +
                "Derdi: Bir kun...",
            "U uzoq joylarga qilmasdi safar,\n" +
                    "To‘kmang derdi ko‘zdan jolalarimni.\n" +
                    "Derdi: Bir kungina ko‘rmasam agar\n" +
                    "Sog‘inib qolaman bolalarimni"))
        list.add(Model1("SOG‘INISH","U uzoq joylarga qilmasdi safar,\n" +
                "To‘kmang derdi ko‘zdan jolalarimni.\n" +
                "Derdi: Bir kun...",
            "U uzoq joylarga qilmasdi safar,\n" +
                    "To‘kmang derdi ko‘zdan jolalarimni.\n" +
                    "Derdi: Bir kungina ko‘rmasam agar\n" +
                    "Sog‘inib qolaman bolalarimni"))
        list.add(Model1("SOG‘INISH","U uzoq joylarga qilmasdi safar,\n" +
                "To‘kmang derdi ko‘zdan jolalarimni.\n" +
                "Derdi: Bir kun...",
            "U uzoq joylarga qilmasdi safar,\n" +
                    "To‘kmang derdi ko‘zdan jolalarimni.\n" +
                    "Derdi: Bir kungina ko‘rmasam agar\n" +
                    "Sog‘inib qolaman bolalarimni"))
        list.add(Model1("SOG‘INISH","U uzoq joylarga qilmasdi safar,\n" +
                "To‘kmang derdi ko‘zdan jolalarimni.\n" +
                "Derdi: Bir kun...",
            "U uzoq joylarga qilmasdi safar,\n" +
                    "To‘kmang derdi ko‘zdan jolalarimni.\n" +
                    "Derdi: Bir kungina ko‘rmasam agar\n" +
                    "Sog‘inib qolaman bolalarimni"))
    }
    fun loadDataTabrik(){
        list.add(
            Model1("Tug'ilgan kun muborak","Umringiz to'lsin bahtga\n" +
                    "Yeting orzu niyatga\n" +
                    "Tabrik aytdim ...","Umringiz to'lsin bahtga\n" +
                    "Yeting orzu niyatga\n" +
                    "Tabrik aytdim yurakdan\n" +
                    "Tug'ilgan kun muborak")
        )
        list.add(
            Model1("Tug'ilgan kun muborak","Umringiz to'lsin bahtga\n" +
                    "Yeting orzu niyatga\n" +
                    "Tabrik aytdim ...","Umringiz to'lsin bahtga\n" +
                    "Yeting orzu niyatga\n" +
                    "Tabrik aytdim yurakdan\n" +
                    "Tug'ilgan kun muborak")
        )
        list.add(
            Model1("Tug'ilgan kun muborak","Umringiz to'lsin bahtga\n" +
                    "Yeting orzu niyatga\n" +
                    "Tabrik aytdim ...","Umringiz to'lsin bahtga\n" +
                    "Yeting orzu niyatga\n" +
                    "Tabrik aytdim yurakdan\n" +
                    "Tug'ilgan kun muborak")
        )
        list.add(
            Model1("Tug'ilgan kun muborak","Umringiz to'lsin bahtga\n" +
                    "Yeting orzu niyatga\n" +
                    "Tabrik aytdim ...","Umringiz to'lsin bahtga\n" +
                    "Yeting orzu niyatga\n" +
                    "Tabrik aytdim yurakdan\n" +
                    "Tug'ilgan kun muborak")
        )
        list.add(
            Model1("Tug'ilgan kun muborak","Umringiz to'lsin bahtga\n" +
                    "Yeting orzu niyatga\n" +
                    "Tabrik aytdim ...","Umringiz to'lsin bahtga\n" +
                    "Yeting orzu niyatga\n" +
                    "Tabrik aytdim yurakdan\n" +
                    "Tug'ilgan kun muborak")
        )
        list.add(
            Model1("Tug'ilgan kun muborak","Umringiz to'lsin bahtga\n" +
                    "Yeting orzu niyatga\n" +
                    "Tabrik aytdim ...","Umringiz to'lsin bahtga\n" +
                    "Yeting orzu niyatga\n" +
                    "Tabrik aytdim yurakdan\n" +
                    "Tug'ilgan kun muborak")
        )
        list.add(
            Model1("Tug'ilgan kun muborak","Umringiz to'lsin bahtga\n" +
                    "Yeting orzu niyatga\n" +
                    "Tabrik aytdim ...","Umringiz to'lsin bahtga\n" +
                    "Yeting orzu niyatga\n" +
                    "Tabrik aytdim yurakdan\n" +
                    "Tug'ilgan kun muborak")
        )
        list.add(
            Model1("Tug'ilgan kun muborak","Umringiz to'lsin bahtga\n" +
                    "Yeting orzu niyatga\n" +
                    "Tabrik aytdim ...","Umringiz to'lsin bahtga\n" +
                    "Yeting orzu niyatga\n" +
                    "Tabrik aytdim yurakdan\n" +
                    "Tug'ilgan kun muborak")
        )
        list.add(
            Model1("Tug'ilgan kun muborak","Umringiz to'lsin bahtga\n" +
                    "Yeting orzu niyatga\n" +
                    "Tabrik aytdim ...","Umringiz to'lsin bahtga\n" +
                    "Yeting orzu niyatga\n" +
                    "Tabrik aytdim yurakdan\n" +
                    "Tug'ilgan kun muborak")
        )
        list.add(
            Model1("Tug'ilgan kun muborak","Umringiz to'lsin bahtga\n" +
                    "Yeting orzu niyatga\n" +
                    "Tabrik aytdim ...","Umringiz to'lsin bahtga\n" +
                    "Yeting orzu niyatga\n" +
                    "Tabrik aytdim yurakdan\n" +
                    "Tug'ilgan kun muborak")
        )
        list.add(
            Model1("Tug'ilgan kun muborak","Umringiz to'lsin bahtga\n" +
                    "Yeting orzu niyatga\n" +
                    "Tabrik aytdim ...","Umringiz to'lsin bahtga\n" +
                    "Yeting orzu niyatga\n" +
                    "Tabrik aytdim yurakdan\n" +
                    "Tug'ilgan kun muborak")
        )
    }
    fun loadDataOtaOna(){
        list.add(
            Model1("Ota rozi","Omad senga qo’lllarini tutaverar,\n" +
                    "Yaxshi kunlar yo’llaringni kutaverar,\n" +
                    "O’taverar hayot go’zal o’taverar,\n" +
                    "Onajoning rozi bo’...","Omad senga qo’lllarini tutaverar,\n" +
                    "Yaxshi kunlar yo’llaringni kutaverar,\n" +
                    "O’taverar hayot go’zal o’taverar,\n" +
                    "Onajoning rozi bo’lsa agar sendan,\n" +
                    "Otajoning rozi bo’lsa agar sendan")
        )

        list.add(
            Model1("Ota rozi","Omad senga qo’lllarini tutaverar,\n" +
                    "Yaxshi kunlar yo’llaringni kutaverar,\n" +
                    "O’taverar hayot go’zal o’taverar,\n" +
                    "Onajoning rozi bo’...","Omad senga qo’lllarini tutaverar,\n" +
                    "Yaxshi kunlar yo’llaringni kutaverar,\n" +
                    "O’taverar hayot go’zal o’taverar,\n" +
                    "Onajoning rozi bo’lsa agar sendan,\n" +
                    "Otajoning rozi bo’lsa agar sendan")
        )
        list.add(
            Model1("Ota rozi","Omad senga qo’lllarini tutaverar,\n" +
                    "Yaxshi kunlar yo’llaringni kutaverar,\n" +
                    "O’taverar hayot go’zal o’taverar,\n" +
                    "Onajoning rozi bo’...","Omad senga qo’lllarini tutaverar,\n" +
                    "Yaxshi kunlar yo’llaringni kutaverar,\n" +
                    "O’taverar hayot go’zal o’taverar,\n" +
                    "Onajoning rozi bo’lsa agar sendan,\n" +
                    "Otajoning rozi bo’lsa agar sendan")
        )
        list.add(
            Model1("Ota rozi","Omad senga qo’lllarini tutaverar,\n" +
                    "Yaxshi kunlar yo’llaringni kutaverar,\n" +
                    "O’taverar hayot go’zal o’taverar,\n" +
                    "Onajoning rozi bo’...","Omad senga qo’lllarini tutaverar,\n" +
                    "Yaxshi kunlar yo’llaringni kutaverar,\n" +
                    "O’taverar hayot go’zal o’taverar,\n" +
                    "Onajoning rozi bo’lsa agar sendan,\n" +
                    "Otajoning rozi bo’lsa agar sendan")
        )
        list.add(
            Model1("Ota rozi","Omad senga qo’lllarini tutaverar,\n" +
                    "Yaxshi kunlar yo’llaringni kutaverar,\n" +
                    "O’taverar hayot go’zal o’taverar,\n" +
                    "Onajoning rozi bo’...","Omad senga qo’lllarini tutaverar,\n" +
                    "Yaxshi kunlar yo’llaringni kutaverar,\n" +
                    "O’taverar hayot go’zal o’taverar,\n" +
                    "Onajoning rozi bo’lsa agar sendan,\n" +
                    "Otajoning rozi bo’lsa agar sendan")
        )
        list.add(
            Model1("Ota rozi","Omad senga qo’lllarini tutaverar,\n" +
                    "Yaxshi kunlar yo’llaringni kutaverar,\n" +
                    "O’taverar hayot go’zal o’taverar,\n" +
                    "Onajoning rozi bo’...","Omad senga qo’lllarini tutaverar,\n" +
                    "Yaxshi kunlar yo’llaringni kutaverar,\n" +
                    "O’taverar hayot go’zal o’taverar,\n" +
                    "Onajoning rozi bo’lsa agar sendan,\n" +
                    "Otajoning rozi bo’lsa agar sendan")
        )
        list.add(
            Model1("Ota rozi","Omad senga qo’lllarini tutaverar,\n" +
                    "Yaxshi kunlar yo’llaringni kutaverar,\n" +
                    "O’taverar hayot go’zal o’taverar,\n" +
                    "Onajoning rozi bo’...","Omad senga qo’lllarini tutaverar,\n" +
                    "Yaxshi kunlar yo’llaringni kutaverar,\n" +
                    "O’taverar hayot go’zal o’taverar,\n" +
                    "Onajoning rozi bo’lsa agar sendan,\n" +
                    "Otajoning rozi bo’lsa agar sendan")
        )
        list.add(
            Model1("Ota rozi","Omad senga qo’lllarini tutaverar,\n" +
                    "Yaxshi kunlar yo’llaringni kutaverar,\n" +
                    "O’taverar hayot go’zal o’taverar,\n" +
                    "Onajoning rozi bo’...","Omad senga qo’lllarini tutaverar,\n" +
                    "Yaxshi kunlar yo’llaringni kutaverar,\n" +
                    "O’taverar hayot go’zal o’taverar,\n" +
                    "Onajoning rozi bo’lsa agar sendan,\n" +
                    "Otajoning rozi bo’lsa agar sendan")
        )
        list.add(
            Model1("Ota rozi","Omad senga qo’lllarini tutaverar,\n" +
                    "Yaxshi kunlar yo’llaringni kutaverar,\n" +
                    "O’taverar hayot go’zal o’taverar,\n" +
                    "Onajoning rozi bo’...","Omad senga qo’lllarini tutaverar,\n" +
                    "Yaxshi kunlar yo’llaringni kutaverar,\n" +
                    "O’taverar hayot go’zal o’taverar,\n" +
                    "Onajoning rozi bo’lsa agar sendan,\n" +
                    "Otajoning rozi bo’lsa agar sendan")
        )
        list.add(
            Model1("Ota rozi","Omad senga qo’lllarini tutaverar,\n" +
                    "Yaxshi kunlar yo’llaringni kutaverar,\n" +
                    "O’taverar hayot go’zal o’taverar,\n" +
                    "Onajoning rozi bo’...","Omad senga qo’lllarini tutaverar,\n" +
                    "Yaxshi kunlar yo’llaringni kutaverar,\n" +
                    "O’taverar hayot go’zal o’taverar,\n" +
                    "Onajoning rozi bo’lsa agar sendan,\n" +
                    "Otajoning rozi bo’lsa agar sendan")
        )
    }
    fun loadDataHazil(){
        list.add(
            Model1("TursunBoy","Ish axtarib Turg‘unboy\n" +
                    "Necha kunki sarsondir.\n" +
                    "Omadining ..","Ish axtarib Turg‘unboy\n" +
                    "Necha kunki sarsondir.\n" +
                    "Omadining teskari\n" +
                    "Yurishidan hayrondir")
        )

        list.add(
            Model1("TursunBoy","Ish axtarib Turg‘unboy\n" +
                    "Necha kunki sarsondir.\n" +
                    "Omadining ..","Ish axtarib Turg‘unboy\n" +
                    "Necha kunki sarsondir.\n" +
                    "Omadining teskari\n" +
                    "Yurishidan hayrondir")
        )
        list.add(
            Model1("TursunBoy","Ish axtarib Turg‘unboy\n" +
                    "Necha kunki sarsondir.\n" +
                    "Omadining ..","Ish axtarib Turg‘unboy\n" +
                    "Necha kunki sarsondir.\n" +
                    "Omadining teskari\n" +
                    "Yurishidan hayrondir")
        )
        list.add(
            Model1("TursunBoy","Ish axtarib Turg‘unboy\n" +
                    "Necha kunki sarsondir.\n" +
                    "Omadining ..","Ish axtarib Turg‘unboy\n" +
                    "Necha kunki sarsondir.\n" +
                    "Omadining teskari\n" +
                    "Yurishidan hayrondir")
        )
        list.add(
            Model1("TursunBoy","Ish axtarib Turg‘unboy\n" +
                    "Necha kunki sarsondir.\n" +
                    "Omadining ..","Ish axtarib Turg‘unboy\n" +
                    "Necha kunki sarsondir.\n" +
                    "Omadining teskari\n" +
                    "Yurishidan hayrondir")
        )
        list.add(
            Model1("TursunBoy","Ish axtarib Turg‘unboy\n" +
                    "Necha kunki sarsondir.\n" +
                    "Omadining ..","Ish axtarib Turg‘unboy\n" +
                    "Necha kunki sarsondir.\n" +
                    "Omadining teskari\n" +
                    "Yurishidan hayrondir")
        )
        list.add(
            Model1("TursunBoy","Ish axtarib Turg‘unboy\n" +
                    "Necha kunki sarsondir.\n" +
                    "Omadining ..","Ish axtarib Turg‘unboy\n" +
                    "Necha kunki sarsondir.\n" +
                    "Omadining teskari\n" +
                    "Yurishidan hayrondir")
        )
        list.add(
            Model1("TursunBoy","Ish axtarib Turg‘unboy\n" +
                    "Necha kunki sarsondir.\n" +
                    "Omadining ..","Ish axtarib Turg‘unboy\n" +
                    "Necha kunki sarsondir.\n" +
                    "Omadining teskari\n" +
                    "Yurishidan hayrondir")
        )
        list.add(
            Model1("TursunBoy","Ish axtarib Turg‘unboy\n" +
                    "Necha kunki sarsondir.\n" +
                    "Omadining ..","Ish axtarib Turg‘unboy\n" +
                    "Necha kunki sarsondir.\n" +
                    "Omadining teskari\n" +
                    "Yurishidan hayrondir")
        )
    }
    fun loadDataDostlik(){
        list.add(
            Model1("Sinifdoshlarim","Uxlab qolib darsga kechikkanlarim\n" +
                    "Kechikib ustozdan gap eshitganlarim\n" +
                    "Uy vazifani bajarmay ...","Uxlab qolib darsga kechikkanlarim\n" +
                    "Kechikib ustozdan gap eshitganlarim\n" +
                    "Uy vazifani bajarmay ko'chirganlarim\n" +
                    "Hech sizni unutmayman SINFDOSHLARIM")
        )
        list.add(
            Model1("Sinifdoshlarim","Uxlab qolib darsga kechikkanlarim\n" +
                    "Kechikib ustozdan gap eshitganlarim\n" +
                    "Uy vazifani bajarmay ...","Uxlab qolib darsga kechikkanlarim\n" +
                    "Kechikib ustozdan gap eshitganlarim\n" +
                    "Uy vazifani bajarmay ko'chirganlarim\n" +
                    "Hech sizni unutmayman SINFDOSHLARIM")
        )
        list.add(
            Model1("Sinifdoshlarim","Uxlab qolib darsga kechikkanlarim\n" +
                    "Kechikib ustozdan gap eshitganlarim\n" +
                    "Uy vazifani bajarmay ...","Uxlab qolib darsga kechikkanlarim\n" +
                    "Kechikib ustozdan gap eshitganlarim\n" +
                    "Uy vazifani bajarmay ko'chirganlarim\n" +
                    "Hech sizni unutmayman SINFDOSHLARIM")
        )
        list.add(
            Model1("Sinifdoshlarim","Uxlab qolib darsga kechikkanlarim\n" +
                    "Kechikib ustozdan gap eshitganlarim\n" +
                    "Uy vazifani bajarmay ...","Uxlab qolib darsga kechikkanlarim\n" +
                    "Kechikib ustozdan gap eshitganlarim\n" +
                    "Uy vazifani bajarmay ko'chirganlarim\n" +
                    "Hech sizni unutmayman SINFDOSHLARIM")
        )
        list.add(
            Model1("Sinifdoshlarim","Uxlab qolib darsga kechikkanlarim\n" +
                    "Kechikib ustozdan gap eshitganlarim\n" +
                    "Uy vazifani bajarmay ...","Uxlab qolib darsga kechikkanlarim\n" +
                    "Kechikib ustozdan gap eshitganlarim\n" +
                    "Uy vazifani bajarmay ko'chirganlarim\n" +
                    "Hech sizni unutmayman SINFDOSHLARIM")
        )
        list.add(
            Model1("Sinifdoshlarim","Uxlab qolib darsga kechikkanlarim\n" +
                    "Kechikib ustozdan gap eshitganlarim\n" +
                    "Uy vazifani bajarmay ...","Uxlab qolib darsga kechikkanlarim\n" +
                    "Kechikib ustozdan gap eshitganlarim\n" +
                    "Uy vazifani bajarmay ko'chirganlarim\n" +
                    "Hech sizni unutmayman SINFDOSHLARIM")
        )
        list.add(
            Model1("Sinifdoshlarim","Uxlab qolib darsga kechikkanlarim\n" +
                    "Kechikib ustozdan gap eshitganlarim\n" +
                    "Uy vazifani bajarmay ...","Uxlab qolib darsga kechikkanlarim\n" +
                    "Kechikib ustozdan gap eshitganlarim\n" +
                    "Uy vazifani bajarmay ko'chirganlarim\n" +
                    "Hech sizni unutmayman SINFDOSHLARIM")
        )
        list.add(
            Model1("Sinifdoshlarim","Uxlab qolib darsga kechikkanlarim\n" +
                    "Kechikib ustozdan gap eshitganlarim\n" +
                    "Uy vazifani bajarmay ...","Uxlab qolib darsga kechikkanlarim\n" +
                    "Kechikib ustozdan gap eshitganlarim\n" +
                    "Uy vazifani bajarmay ko'chirganlarim\n" +
                    "Hech sizni unutmayman SINFDOSHLARIM")
        )
        list.add(
            Model1("Sinifdoshlarim","Uxlab qolib darsga kechikkanlarim\n" +
                    "Kechikib ustozdan gap eshitganlarim\n" +
                    "Uy vazifani bajarmay ...","Uxlab qolib darsga kechikkanlarim\n" +
                    "Kechikib ustozdan gap eshitganlarim\n" +
                    "Uy vazifani bajarmay ko'chirganlarim\n" +
                    "Hech sizni unutmayman SINFDOSHLARIM")
        )



    }
}