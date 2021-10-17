package com.example.constructor_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG : String ="로그"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "MainActivity - onCreate() called()")

        var myFriend = MyFriend()

        // 매개변수가 들어가는 생성자

        Log.d(TAG, "MainActivity - myFriend.name : ${myFriend.name}")
        Log.d(TAG, "MainActivity - myFriend.age : ${myFriend.age}")
        Log.d(TAG, "MainActivity - myFriend.ismarried : ${myFriend.isMarried}")
        Log.d(TAG, "MainActivity - myFriend.nickname : ${myFriend.nickname}")

        var myFriendChulsoo = MyFriendWithParams(name = "철수",
                                                age = 17,
                                                isMarried = false,
                                                nickname = "짱구친구")

        Log.d(TAG, "MainActivity - Chulsoo.name : ${myFriendChulsoo.name}")
        Log.d(TAG, "MainActivity - Chulsoo.age : ${myFriendChulsoo.age}")
        Log.d(TAG, "MainActivity - Chulsoo.isMarried : ${myFriendChulsoo.isMarried}")
        Log.d(TAG, "MainActivity - Chulsoo.nickname : ${myFriendChulsoo.nickname}")
//
//        var myFriendYoungsoo = MyFriendWithParams(name = "영수",
//                                                age = 16,
//                                                isMarried = false,
//                                                nickname = "국영수",
//                                                address ="대한민국"
//        )
//
//        var myFriendDongsoo = MyFriendWithParams(name = "동수",
//                                                age = 18,
//                                                isMarried = false,
//                                                nickname = "국수"
//        )

        // 추가 생성자로 되어있는 친구 객체
        var myFriendJames = MyFriendWithMoreParams(name = "James")
        Log.d(TAG, "MainActivity - myFriendJames.name = ${myFriendJames.name}")

        var myFriendhello = MyFriendWithMoreParams(name = "hello", age = 20)
        Log.d(TAG, "MainActivity - myFriendhello.name = ${myFriendhello.name}")
        Log.d(TAG, "MainActivity - myFriendhello.age = ${myFriendhello.age}")

        //
    }
}