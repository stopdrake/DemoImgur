package com.example.vsing.demimgurjava.dagger

import com.example.vsing.demimgurjava.adapter.ImageAdapter
import com.example.vsing.demimgurjava.adapter.model.ImageAdapterModel
import com.example.vsing.demimgurjava.adapter.view.ImageAdapterView
import com.example.vsing.demimgurjava.presenter.MainPresenter
import com.example.vsing.demimgurjava.presenter.MainPresenterImpl

import dagger.Module
import dagger.Provides

/**
 * Created by vsing on 1/29/2018.
 */

@Module
class MainModule(private val mView: MainPresenter.IView, private val mImageAdapter: ImageAdapter) {

    @Provides
    fun provideAdapterView(): ImageAdapterView {
        return mImageAdapter
    }

    @Provides
    fun provideAdapterModel(): ImageAdapterModel {
        return mImageAdapter
    }

    @Provides
    fun provideMainView(): MainPresenter.IView {
        return mView
    }

    @Provides
    fun provideMainPresenter(mainPresenter: MainPresenterImpl): MainPresenter {
        return mainPresenter
    }
}
