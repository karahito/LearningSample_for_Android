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

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import com.japanmicrosystem.learningsample.R
import com.japanmicrosystem.learningsample.model.SampleValue
import timber.log.Timber
import javax.inject.Inject
import javax.inject.Named

class DiSampleActivity : BaseActivity() {

    override fun onActivityInject() {
        super.onActivityInject()
        activityComponent.inject(this)
    }

    // How to Inject to Named ProvideMethod
    @field:[Inject Named("1")] lateinit var value: SampleValue

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_disample)
        val text = findViewById<TextView>(R.id.text)
        text.text = value.toString()
    }

    companion object {
        fun getIntent(context: Context): Intent {
            Timber.d("call getIntent")
            return Intent(context, DiSampleActivity::class.java)
        }
    }
}