package com.example.contact_1.MyShare

import android.content.Context
import android.content.SharedPreferences
import com.example.smssherlar.Models.Model1
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object MySharedPrefarance {
    private const val NAME = "KeshXotiraga"
    private const val MODE = Context.MODE_PRIVATE
    private lateinit var preferences: SharedPreferences

    fun init(context: Context) {
        preferences = context.getSharedPreferences(NAME, MODE)
    }

    private inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit) {
        val editor = edit()
        operation(editor)
        editor.apply()
    }


    var contactList:ArrayList<Model1>?
    get() = gsonStringToArray(preferences.getString("keyList" ,"[]")!!)
    set(value) = preferences.edit{
        it.putString("keyList", arrayToGsonString(value!!))
    }

    fun arrayToGsonString(arrayList: ArrayList<Model1>): String {
        return Gson().toJson(arrayList)
    }

    fun gsonStringToArray(gsonString: String): ArrayList<Model1> {
        val typeToken = object : TypeToken<List<Model1>>() {}.type
        return Gson().fromJson(gsonString, typeToken)
    }
}