package org.example
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

   val doc: Document = Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/").get()
    val quotes: Elements = doc.select(".sc-2aegk7-2")
    println(quotes)

}