package com.example.paymentpawmedic.di

import android.app.Application
import com.example.paymentpawmedic.data.manager.LocalUserManagerImpl
import com.example.paymentpawmedic.domain.manager.LocalUserManager
import com.example.paymentpawmedic.domain.usecases.AppEntryUseCases
import com.example.paymentpawmedic.domain.usecases.ReadAppEntry
import com.example.paymentpawmedic.domain.usecases.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManager(
        application: Application
    ): LocalUserManager = LocalUserManagerImpl(application)

    @Provides
    @Singleton
    fun provideAppEntryCases(
        localUserManager: LocalUserManager
    )= AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager)
    )
}