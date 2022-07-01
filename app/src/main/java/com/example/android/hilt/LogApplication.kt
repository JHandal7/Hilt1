/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.hilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class LogApplication : Application() {

//    lateinit var serviceLocator: ServiceLocator
//
//    override fun onCreate() {
//        super.onCreate()
//        serviceLocator = ServiceLocator(applicationContext)
//    }
}
//@HiltAndroidApp triggers Hilt's code generation, including a base class for your application
// that can use dependency injection. The application container is the parent container for the app,
// which means that other containers can access the dependencies that it provides.


//The only usage remains in the LogApplication class where we kept an instance of it.
// Let's clean that class as we don't need it anymore.
//Open the LogApplication class and remove the ServiceLocator usage.
// The new code for the Application class is: