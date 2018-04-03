/*
 * Copyright [2018] [JapanMicroSystem]
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.japanmicrosystem.learningsample.di

import android.app.Activity
import com.japanmicrosystem.learningsample.model.SampleValue
import dagger.Module
import dagger.Provides
import timber.log.Timber
import javax.inject.Named

/**
 * Activity Module
 * @author D.Noguchi
 * @since 23.Nov,2017
 */
@Module
class ActivityModule(private val activity: Activity) {
    @Provides
    fun provideActivity():Activity {
        Timber.d("call provideActivity")
        return activity
    }

    @Provides
    @Named(value = "1")
    fun provideSampleValue1():SampleValue {
        Timber.d("call provideSampleValue1")
        return SampleValue.Sample1
    }

    @Provides
    @Named(value = "2")
    fun provideSampleValue2():SampleValue {
        Timber.d("call provideSampleValue2")
        return SampleValue.Sample2
    }

}