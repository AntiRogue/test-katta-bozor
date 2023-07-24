package com.example.testkattabozor.di

import com.example.testkattabozor.data.api.OffersApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {

    @Singleton
    @Provides
    fun provideNewsApi(retrofit: Retrofit): OffersApi = retrofit.create(OffersApi::class.java)
}