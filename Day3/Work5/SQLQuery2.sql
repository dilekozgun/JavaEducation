-- SQL case insensitivedir : Büyük küçük harf duyarsız.
-- Select : Seçmek,bir veri kaynağındaki datayı çekmek için kullanılır.
-- ANSII standartı ile kod yazdığımızdan şuan SQL Server da kod yazıyor olsak bile Oracle veya MySql'de de çalışır.

Select * from Customers
-- Selectten sonra gelen kısım kolonlardır. 
-- * : Tüm kolonlar demektir.
-- from : Nereden,hangi tablodan getireceğini söyler. 
-- Biz Customers tablosundan tüm kolonları getirmesini istedik bu satırla.
 
Select CompanyName,ContactName,City from Customers -- Bu bir tablodur,unutma
-- İstediğimiz kolonları selectten sonra yazarak getirebiliriz.
-- Yazdığımız kod bir tablo oluşturup onu bize getirir, yani bu şekilde select ile tablo oluşturup bunları birleştirebiliriz.

Select CompanyName SirketAdi,ContactName Adi,City Sehir from Customers
--Kolon isminin yanına yazdığımız isimler "bu kolonu bu isimde getir demektir."

Select * from Customers where City = 'London'
-- where : koşul demektir,tabloyu şarta göre getirir
-- Şehir bilgisi London olan müşterileri getir, tüm kolonları ile.

Select * from Products where CategoryID=1
-- CategoryID'si 1 olan ürünleri getir.
Select * from Products where CategoryID=1 or CategoryID=3
-- CategoryID'si 1 ya da 3 olan
Select * from Products where CategoryID=1 and UnitPrice >= 10
-- Operatörler burada da kullanılır
Select * from Products where CategoryID=1 and UnitPrice <> 10
-- <> : 10 dan farklı olanlar
Select * from Products order by ProductName
-- order by : Sırala demektir, belirtilen kolona göre sıralar.
Select * from Products order by CategoryID,ProductName
-- Önce CategoryID ye göre sıralar sonra bunda aynı olanları ProductName e göre sıralar.
-- Örneğin CategoryID si 1 olanlar kendi içinde alfabetik sıralanmış oldu.
Select * from Products order by UnitPrice asc
-- ascending : artan demektir,default olarak küçükten büyüğe artar şekilde listeler biz asc yazmasakta olur yani
Select * from Products order by UnitPrice desc 
-- descending :azalan demektir, büyükten küçüğe azalır.
Select * from Products where CategoryID=1 order by UnitPrice desc 
-- CategoryID 1 olanları filtrele Unitprice ı yüksekten düşüğe şeklinde sırala.
Select count(*) Adet from Products 
-- count : adet,sayı demektir. Tüm satırları say sayısını ver. Products tablosunda kaç data var onu gösterir.

Select count(*),CategoryID Adet from Products 
-- count isterken başka bir kolonu çağıramayız hata olur

Select * from Products group by CategoryID
-- Datayı CategoryID ye göre grupla. Burda yıldız kullanılmaz. Hatalı kod
-- Group by kullandığımız zaman select ettiğimiz kolon group by da yazdığımız alan olabilir. Ya da kümülatif data olabilir count(*) gibi

Select CategoryID from Products group by CategoryID
-- Bütün kategorileri tekrar etmicek şekilde bana listele demektir.

Select CategoryID,count(*) from Products group by CategoryID
-- kategori ıd leri tekrar etmeyecek şekilde ve onların sayıları verilir. Hangi kategoride kaç ürün var listeledik.
-- group by olduğu için count her bir kategori ıd için ayrı ayrı çalışır.
-- iki kolona birden group by yapabiliriz , yazıp diğer kolonu yapman yeterli

Select CategoryID,count(*) from Products group by CategoryID having count(*)<10
-- Ürün çeşidi 10 dan az olan kategorileri listele 
-- Group by larda kümülatif dataya(count(*)) yazılan where koşulu having tir.
-- having group by a konu olan kümülatif sorguya yazılır.

Select CategoryID,count(*) from Products where UnitPrice>20 group by CategoryID having count(*)<10
-- önce her zaman where çalışır

-- Veritabanı tasarımı yaparken kendimizi tekrar etmemek için tabloları ilişkilendiririz.
-- Örneğin bir ürün tablounda CategoryId yazılarak kategoriler tekrarlanmamış olur yalnızca Id ler yazılır böylece Category tablosuyla ilişkilendirilir.

-- join : tabloları birleştirmek
-- Kullanıcı ilişkilendirilmiş tabloların birleşimini görür. Ürün tablosunda Categoryıd olarak değil isim olarak görür. Bunu join ile yaparız.

Select * from Products inner join Categories on Products.CategoryID = Categories.CategoryID
-- Products ile Categories tabloların birleşimini getir.
-- on : durumunda,şartında yani tabloların neye göre join olacağını söyler.
-- join lerde koşulu on ile yazarız.
-- Select Products.ProductsID -> Products tablosundan ProductsID kolonunu getir.

Select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName 
from Products inner join Categories 
on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice>10
--Fiyatı 10 dan büyük olan ürünleri kategori isimleri ile getirir.

-- DTO : Data Tranformation Object (Join tabloları)
-- İNNER JOİN : İki tabloda eşleşenleri getirir.Eşleşmeyen data varsa onu getirmez.

Select * from Products p inner join [Order Details] od on p.ProductID = od.ProductID 
-- Order Details tablo ismi aralarında boşluk bırakılarak yazıldığı için [] içine aldık. Farklı tablo olarak algılanmaması için
-- SQL de isimlendirmede normalde boşluk bulunmaz.
-- iki tabloyu join edeceğimiz zaman ortak kolonu bulmamız gerekiyor çünkü o kolona göre birleştir diyeceğiz.

--left join : Solda olup sağda olmayanları da getir.
Select * from Products p left join [Order Details] od on p.ProductID = od.ProductID 

--Products tablosunda olup Order Details(Sipariş detay) tablosunda olmayan yani satışı yapılmamış ürünleri de listeye kat
--İnner joinde eşleşme olmadığı için satışı yapılmayanları getirmez ancak left join bu ürünleri de getirir ek olarak.

Select * from Customers c inner join Orders o 
on c.CustomerID = o.CustomerID

Select * from Customers c left join Orders o  -- hem inner join olan yani eşleşenleri hemde solda olup sağda olmayanları getirdi.
on c.CustomerID = o.CustomerID
where o.CustomerID is NULL --solda var sağda yoksa demekki bu özellik sağda null dır. Primary Key e uygulanır.
-- Sipariş vermeyen müşteriler

--Right Join : Left joinin tam tersi sağda olup solda olmayanlarıda getir.

-- 2 den fazla tablo birleştirme
Select * from Products p inner join [Order Details] od 
on p.ProductID = od.ProductID 
inner join Orders o 
on o.OrderID = od.OrderID

--Tablo eklemek için join ekleriz devamlı









