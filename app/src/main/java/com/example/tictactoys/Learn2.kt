package com.example.tictactoys


private fun readInt() = readLine()!!.toInt()
private fun readLong() = readLine()!!.toLong()
private fun readIntList() = readLine()!!.split(" ").map { it.toInt() }
private fun readLongList() = readLine()!!.split(" ").map { it.toLong() }

fun main(){
    val n = readInt()
    val a = readIntList()
    val b = a.toMutableList()
    var cnt:Int = 0
    val mk = Array<Int>(1001,{0})
    for(x in 0 until n){
        if(mk[a[x]]==0)
            cnt ++
        mk[a[x]]++
    }
    println(cnt)
    for(i in 0 until n)
    {
        if(mk[a[i]] >= 2){
            mk[a[i]]--
            continue
        }
        print("${a[i]} ")
    }


}