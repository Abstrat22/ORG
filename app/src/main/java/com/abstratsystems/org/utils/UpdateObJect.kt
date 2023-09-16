package com.abstratsystems.org.utils

import Member
import android.util.Log
import com.abstratsystems.org.models.Message
import com.abstratsystems.org.models.Organization
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object UpdateObJect{

    var isSuccessful = false
    fun member(id: String, member: Member,){
        // Make api call to save member data with retrofit request
        MyInstances.orgApiService.updateMember(id, member).enqueue(object: Callback<Member> {
            override fun onResponse(call: Call<Member>, response: Response<Member>) {
                if (response.isSuccessful) {
                    // Handle the successful response here
                    isSuccessful = true
                    val data = response.body()
                    if (data != null) {
                        Log.i("Response", data.toString())
                    } else {
                        // Handle the case where the response body is null
                        Log.i("Null:", "Got nothing")
                    }
                } else {
                    // Handle error cases here
                    isSuccessful = false
                    val errorCode = response.code()
                    val errorMessage = response.message()
                    // Handle the error code and message appropriately
                    println("ErrorCode $errorCode")
                    println("ErrorMessage $errorMessage")
                }
            }

            override fun onFailure(call: Call<Member>, t: Throwable) {
                // Handle network errors or request failure here
                // For example, you can log the error or show an error message to the user
                isSuccessful = false
                Log.i("FAILED TO CONNECT", t.toString())
            }
        })

    }

    fun organization(id: String, organization: Organization){
        // Make api call to save organization data with retrofit request
        MyInstances.orgApiService.updateOrganization(id, organization).enqueue(object: Callback<Organization> {
            override fun onResponse(call: Call<Organization>, response: Response<Organization>) {
                if (response.isSuccessful) {
                    // Handle the successful response here
                    isSuccessful = true
                    val data = response.body()
                    if (data != null) {
                        println("Response Data: ${data.toString()}")
                    } else {
                        // Handle the case where the response body is null
                        Log.i("Null:", "Got nothing")
                    }
                } else {
                    // Handle error cases here
                    isSuccessful = false
                    val errorCode = response.code()
                    val errorMessage = response.message()
                    // Handle the error code and message appropriately
                    println("ErrorCode $errorCode")
                    println("ErrorMessage $errorMessage")
                }
            }

            override fun onFailure(call: Call<Organization>, t: Throwable) {
                // Handle network errors or request failure here
                // For example, you can log the error or show an error message to the user
                isSuccessful = false
                Log.i("FAILED TO CONNECT", t.toString())
            }
        })

    }

    fun message(id: String, message: Message){
        // Make api call to save member data with retrofit request
        MyInstances.orgApiService.updateMessage(id, message).enqueue(object: Callback<Message> {
            override fun onResponse(call: Call<Message>, response: Response<Message>) {
                if (response.isSuccessful) {
                    // Handle the successful response here
                    isSuccessful = true
                    val data = response.body()
                    if (data != null) {
                        Log.i("Response", data.toString())
                    } else {
                        // Handle the case where the response body is null
                        Log.i("Null:", "Got nothing")
                    }
                } else {
                    // Handle error cases here
                    isSuccessful = false
                    val errorCode = response.code()
                    val errorMessage = response.message()
                    // Handle the error code and message appropriately
                    println("ErrorCode $errorCode")
                    println("ErrorMessage $errorMessage")
                }
            }

            override fun onFailure(call: Call<Message>, t: Throwable) {
                // Handle network errors or request failure here
                // For example, you can log the error or show an error message to the user
                isSuccessful = false
                Log.i("FAILED TO CONNECT", t.toString())
            }
        })

    }
}