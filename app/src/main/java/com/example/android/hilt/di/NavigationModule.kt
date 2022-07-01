package com.example.android.hilt.di

import com.example.android.hilt.navigator.AppNavigator
import com.example.android.hilt.navigator.AppNavigatorImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent


@InstallIn(ActivityComponent::class)
@Module
abstract class NavigationModule {

    @Binds
    abstract fun bindNavigator(impl: AppNavigatorImpl): AppNavigator
}
//Inside the new module, we can add the binding for AppNavigator.
// It's an abstract function that returns
// the interface we're informing Hilt about (i.e. AppNavigator)
// and the parameter is the implementation of that interface (i.e. AppNavigatorImpl).
