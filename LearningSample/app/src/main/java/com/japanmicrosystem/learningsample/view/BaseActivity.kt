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

package com.japanmicrosystem.learningsample.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.japanmicrosystem.learningsample.application.MyApplication
import com.japanmicrosystem.learningsample.di.ActivityComponent
import com.japanmicrosystem.learningsample.di.ActivityModule

/**
 * BaseActivity
 * @author D.Noguchi
 * @since 23.Nov.2017
 */
open class BaseActivity:AppCompatActivity() {

    internal val activityComponent:ActivityComponent get() = (application as MyApplication).getComponent()
            .add(ActivityModule(this))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        onActivityInject()
    }

    open fun onActivityInject(){
        // nothing todo
    }
}