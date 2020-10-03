package springboot.image.junseong.di

import springboot.image.junseong.Retrofit2.Retrofit_Factory
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Repository @Inject constructor(private val retrofitFactory: Retrofit_Factory) {
}