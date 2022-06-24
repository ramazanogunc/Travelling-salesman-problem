package kotlinversion

fun main(){
    val node = Node(Data(7,3))
    node.appendToEnd(Data(1,10))
    node.appendToEnd(Data(1,4))
    node.appendToEnd(Data(2,1))
    node.appendToEnd(Data(5,2))
    node.appendToEnd(Data(6,5))
    node.appendToEnd(Data(8,4))
    node.appendToEnd(Data(9,2))
    node.appendToEnd(Data(8,9))

    node.printNodes()
    println("The shortest road= "+node.sumOfNodes())

}