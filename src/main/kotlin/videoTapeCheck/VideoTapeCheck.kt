package videoTapeCheck

fun main() {
    fun getHours(start : Int, end : Int) = end-start
    fun getMinutes(start : Int, end : Int, hours : Int) = end-start+(hours*60)
    fun getSpaceLeft(totalSpace : Int, usedSpace : Int) = totalSpace - usedSpace
    fun enoughSpace(space : Int, program : Int) = space > program

    val videoLength = 90
    val usedVideoTape = 55
    val startHour = 8
    val startMin = 50
    val endHour = 9
    val endMin = 30

    val programMinutes = getMinutes(startMin,endMin, getHours(startHour,endHour))
    val spaceInMinutes = getSpaceLeft(videoLength,usedVideoTape)

    println(enoughSpace(spaceInMinutes, programMinutes))
}