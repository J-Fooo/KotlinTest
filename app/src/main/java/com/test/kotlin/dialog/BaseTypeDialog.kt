package com.test.kotlin.dialog

import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class BaseTypeDialog : DialogFragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}