package com.example.prak9.repositori

interface ContainerApp {
    val repositoriSiswa: RepositorySiswa
}

class DefaultContainerApp : ContainerApp {
    override val repositoriSiswa: RepositorySiswa by lazy {
        FirebaseRepositorySiswa()
    }
}