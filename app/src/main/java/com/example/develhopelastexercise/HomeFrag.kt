package com.example.develhopelastexercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class HomeFrag : Fragment() {

    private lateinit var adapter: Adapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Phones>

    private lateinit var imageId: Array<Int>
    lateinit var header : Array<String>
    lateinit var phones: Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataInitialize()

        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recycle_view)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = Adapter(newArrayList)
        recyclerView.adapter = adapter
    }

    private fun dataInitialize (){
        newArrayList = arrayListOf()
        imageId = arrayOf(
            R.drawable.iphone,
            R.drawable.samsung,
            R.drawable.huawei,
            R.drawable.xiaomi,
            R.drawable.oppo
        )
        header = arrayOf(
            "Iphone","Samsung","Huawei","Xiaomi","Oppo")

        for (i in imageId.indices){
            val phones = Phones(imageId[i],header[i])
            newArrayList.add(phones)
        }
    }
}