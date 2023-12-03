fun main() {
    val invoice = Invoice()
    println(invoice.printInvoice(123))

    val invoiceAlphaNumeric = InvoiceAlphaNumeric()
    println(invoiceAlphaNumeric.printInvoice(456))
    println(invoiceAlphaNumeric.printInvoice("abc"))
}

//Example
//Suppose, we have a class name Invoice, which has invoiceNumber, which has an integer type
open class Invoice() {
    fun printInvoice(invoiceNumber: Int): Int {
        return invoiceNumber
    }
}

//in the future, if the requirement changes now, InvoiceNumber should be alphanumeric
//rather than only an integer. Hence, in this case, you should create a subclass
//Invoice with a same function but different datatype rather than modifying the previous one.
class InvoiceAlphaNumeric() : Invoice() {
    fun printInvoice(invoiceNumber: String): String {
        return invoiceNumber
    }
}