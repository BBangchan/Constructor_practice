package com.example.constructor_practice

import android.util.Log

// 추가 생성자로 되어있는 클래스
// 추가 생성자이기때문에 ()를 통해서 기본 생성자가 있어야 추가 생성을 할 수 있기 때문에 사용해준다.
class MyFriendWithMoreParams() {

    val TAG : String ="로그"
    
    //멤버변수
    var name : String? =null
    var age : Int? =null
    var ismarried : Boolean? =null
    var nickname : String? =null

    // 기본 생성자
    init {
        Log.d(TAG, "MyFriendWithMoreParams - init() called()")
        this.name = ""
    }

    //추가 생성자
    constructor(name: String) : this() {
        Log.d(TAG, "MyFriendWithMoreParams - name 생성자() called()")
        this.name = name
    }



    //추가 생성자
    constructor(name : String, age: Int) : this() {
        Log.d(TAG, "MyFriendWithMoreParams - name, age 생성자() called()")
        this.name = name
        this.age = age
    }



}