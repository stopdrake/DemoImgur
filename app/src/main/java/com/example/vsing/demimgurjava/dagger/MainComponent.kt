package com.example.vsing.demimgurjava.dagger

import com.example.vsing.demimgurjava.view.MainActivity

import javax.inject.Singleton

import dagger.Component

@Component(modules = arrayOf(MainModule::class))
@Singleton
interface MainComponent {
    fun inject(mainActivity: MainActivity)
}
