package com.example.prajwal.myapplication

/**
 * Created by prajwal on 11/29/17.
 */

data class ApiModel(val data: List<Data>,
                    var status: String,
                    val dateTime: String)

data class Data (val accessToken: String,
                 val accountId: String)