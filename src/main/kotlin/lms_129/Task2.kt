package lms_129

import java.util.*
import javax.print.attribute.standard.PrinterIsAcceptingJobs
import kotlin.math.sqrt

fun task2(number: Int): Boolean {
    var root = 0
    var primeNumber = false
    var mI = 2
    var swap = 0
    var numberClone = number
   //Root yes, all this fucking shit is to find out the root of the number
    if (number != 0) {
        var start:Long = 0
        var end:Long = number.toLong()
        while(start <= end) {
            var mid:Long = (start + end)/2
            if (mid * mid < number) {
                start = mid * 1
                root = mid.toInt()

            } else if (mid * mid > number) {
                end = mid -1

            } else{
                root = mid.toInt()
                break
            }
        }
    }

    //prime Number
    if (number == 2){
        primeNumber = true
    }else{
        while (root >= mI) {
            //numberClone / mI = swap
            if (swap <= root) {
                break
                primeNumber = true
            }else if(swap == 0){
                break
            }else{
                mI + 1
            }

        }
    }
        val result = primeNumber
        return result

}
//Finding the root of X
fun rootSqrt(x: Int ):Int{
    var ans = 0
    if (x != 0) {
        var start:Long = 0
        var end:Long = x.toLong()
        while(start <= end) {
            var mid:Long = (start + end)/2
            if (mid * mid < x) {
                start = mid * 1
                ans = mid.toInt()

            } else if (mid * mid > x) {
                end = mid -1

            } else{
                ans = mid.toInt()
                break
            }
        }
    }
 return ans
}
  fun main() {
     task2(number = 7)

  }