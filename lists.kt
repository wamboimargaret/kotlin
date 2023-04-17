fun main() {
//    val fruits = listOf("Apple", "banana", "Code","Mango")
//    println(fruits)
//
//    var rwanda = mutableListOf("Kagame", 12500, 66.7, "RHIF",false)
//    println(rwanda)
//
//
//
//
//    rwanda.add("EAC")
//    rwanda.remove(66.7)
//
//    println(rwanda)
//
//}

fun main(){
    val nums = mutableListOf(21,43,321,332,2,111,4,5,43,4892)

    val evenList = mutableListOf<Int>()
    for(x in nums){
        if(x%2 ==0){
            evenList.add(x)
            }
    }
    println(evenList)


    val evenLists = nums.filter {num-> num % 2==0}
    println(evenLists)

    println(nums.average())
    println(nums[5])
    println(nums.indexOf(43))
    println(nums.lastIndexOf(43))
    println(nums.lastIndex)

   val sortedNums = nums.sorted()
    println(sortedNums)

    val geisha = Product("Geisha",50.0)
    createProductList()
}
data class  Product(var name: String, var price: Double)

fun createProductList() {
    val kiwi = Product("Kiwi shoe polish",70.0)
    val prod2 = Product("Colgate",60.0)
    val ilara = Product("Ilara milk",30.0)
    val bread = Product("Sunblest",65.0)
    val biscuit = Product("Nuvita",5.0)




    var products = listOf(kiwi,prod2,ilara,bread,biscuit)
    val sortedProducts = products.sortedBy { product->product.price }
    println(sortedProducts)

    
}



//write a function that takes in a list of intergers and prints out the square of each element.
fun nums(num:List<Int>){
    for( x in num)
        println(x*x)

}
