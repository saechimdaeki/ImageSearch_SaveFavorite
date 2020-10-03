package springboot.image.junseong.Gallery

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import springboot.image.junseong.di.Repository

class galleryViewModel @ViewModelInject constructor(private val repository: Repository) : ViewModel() {
}