package com.example.vsing.demimgurjava.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

import com.example.vsing.demimgurjava.R
import com.example.vsing.demimgurjava.adapter.ImageAdapter
import com.example.vsing.demimgurjava.adapter.view.ImageAdapterView
import com.example.vsing.demimgurjava.dagger.DaggerMainComponent
import com.example.vsing.demimgurjava.dagger.MainModule
import com.example.vsing.demimgurjava.presenter.MainPresenter

import javax.inject.Inject

/* Main view that inflates when app
   is opened
 */
class MainActivity : AppCompatActivity(), MainPresenter.IView {

    lateinit var mRecyclerView: RecyclerView

    @Inject
    lateinit var mImageAdapterView: ImageAdapterView
    @Inject
    lateinit var mMainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageAdapter = ImageAdapter(application)
        DaggerMainComponent.builder()
                .mainModule(MainModule(this, imageAdapter))
                .build()
                .inject(this)

        mRecyclerView = findViewById(R.id.recycler_view)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mRecyclerView.adapter = imageAdapter

        mMainPresenter.loadInitialData()
    }


    override fun updateView() {
        mImageAdapterView.refreshView()
    }
}
