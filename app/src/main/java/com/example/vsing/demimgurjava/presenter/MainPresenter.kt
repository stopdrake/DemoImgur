package com.example.vsing.demimgurjava.presenter

import com.example.vsing.demimgurjava.adapter.model.ImageAdapterModel

import javax.inject.Inject

import dagger.Module
import dagger.Provides

/**
 * MainPresenter for MainActivity
 */

interface MainPresenter {

    fun loadInitialData()

    /*
    Interface for presenter to communicate with view
     */
    interface IView {
        fun updateView()
    }
}
