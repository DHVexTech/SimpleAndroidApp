package dev.dylanherve.mvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dev.dylanherve.mvvm.model.ProductFamily
import dev.dylanherve.mvvm.repository.DataRepository
import org.koin.standalone.KoinComponent

class ProductViewModel(private val dataRepository: DataRepository) : ViewModel(), KoinComponent {

    var listOfProducts = MutableLiveData<List<ProductFamily>>()

    init {
        listOfProducts.value = listOf()
    }

    fun getProducts() {
        dataRepository.getProducts(object : DataRepository.OnProductData {

            override fun onSuccess(data: List<ProductFamily>) {
                listOfProducts.value = data
            }

            override fun onFailure() {}
        })
    }

}
