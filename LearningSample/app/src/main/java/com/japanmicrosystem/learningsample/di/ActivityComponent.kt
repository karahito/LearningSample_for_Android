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

import com.japanmicrosystem.learningsample.view.BaseActivity
import com.japanmicrosystem.learningsample.view.DiSampleActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [(ActivityModule::class)])
interface ActivityComponent {
    fun inject(activity:BaseActivity)
    fun inject(activity:DiSampleActivity)
}