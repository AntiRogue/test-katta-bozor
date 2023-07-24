package com.example.testkattabozor.di

import com.example.testkattabozor.data.repository.OffersRepositoryImp
import com.example.testkattabozor.domain.repository.OffersRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindNewsRepository(offersRepositoryImp: OffersRepositoryImp): OffersRepository
}