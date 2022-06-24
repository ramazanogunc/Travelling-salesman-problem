package kotlinversion

import kotlin.math.absoluteValue

class Node(var data: Data) {

    var nextNode: Node? = null
    var length : Int = 0
    fun appendToEnd(data: Data) {
        val end = Node(data)
        var n: Node? = this
        while (n!!.nextNode != null) {
            n = n.nextNode
        }
        n.nextNode = end
        length++
    }

    fun printNodes() {
        var result = ""
        var n = this
        while (n.nextNode != null){
            result += n.data.x.toString() +","+ n.data.y.toString()
            if(n.nextNode != null){
                result += " --> "
            }
            n = n.nextNode!!
        }
        result += n.data.x.toString() +","+ n.data.y.toString()
        println(result)
    }

    fun length(h: Node?): Int {
        return length
    }

    fun sumOfNodes(): Int {
        var result = 0
        val firstNode =  this
        val secondNode = firstNode.nextNode
        while (firstNode.nextNode != null){

            result += shortestPath(firstNode , firstNode.nextNode!!) * 2

            firstNode.nextNode = firstNode.nextNode!!.nextNode

        }

        firstNode.nextNode = secondNode

        return result
    }

    private fun shortestPath(firstNode: Node, nextNode: Node): Int {

        val x = (firstNode.data.x - nextNode.data.x).absoluteValue

        val y = (firstNode.data.y - nextNode.data.y).absoluteValue

        return x+y
    }

    fun deleteNode(head: Node, data: Data): Node? {
        val n: Node = head

        if(n.data == data) {
            return head.nextNode
        }

        var current = head
        while (current.nextNode != null){
            if(current.nextNode!!.data == data){
                current.nextNode = current.nextNode!!.nextNode
                return current
            }
            current = current.nextNode!!
        }

        return head
    }


}
data class Data(val x : Int, val y:Int)