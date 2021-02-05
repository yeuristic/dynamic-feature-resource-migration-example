package com.yeuristic.example.dynamicfeature

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class DynamicDataBindingViewModel: BaseObservable() {
    var toggle: Boolean = false
        @Bindable get
        set(value) {
            field = value
            notifyPropertyChanged(BR.toggle)
        }
}