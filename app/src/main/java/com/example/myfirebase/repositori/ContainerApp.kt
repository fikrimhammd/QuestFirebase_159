package com.example.myfirebase.repositori

import FirebaseRepositorySiswa
import com.example.myfirebase.repositori.RepositorySiswa
import android.app.Application

interface ContainerApp {
    val repositorySiswa: RepositorySiswa
}

class DefaultContainerApp: ContainerApp{
    override val repositorySiswa: RepositorySiswa by lazy {
        FirebaseRepositorySiswa()
    }
}
class AplikasiDataSiswa: Application(){
    lateinit var container: ContainerApp
    override fun onCreate() {
        super.onCreate()
        this.container = DefaultContainerApp()
    }
}