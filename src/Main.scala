object Main extends App {

  println("Zadanie 1\n")

  def checkWeekDayName(day: String): String = day match  {
    case "poniedziałek" => "Praca"
    case "wtorek" => "Praca"
    case "sroda" => "Praca"
    case "czwartek" => "Praca"
    case "piątek" => "Praca"
    case "sobota" => "Weekend"
    case "niedziela" => "Weekend"
    case _ => "Nie ma takiego dnia"
  }
  println(checkWeekDayName("montag"))
  println(checkWeekDayName("poniedziałek"))
  println(checkWeekDayName("wtorek"))
  println(checkWeekDayName("niedziela"))
  println(checkWeekDayName("sobota"))

  println("\nZadanie 2\n")

  var k1: KontoBankowe = new KontoBankowe()
  var k2 = new KontoBankowe(11)

  k2.wplata(121)

  println(k1.stanKonta1)
  println(k2.stanKonta1)

  k2.wyplata(1)

  println(k2.stanKonta1)

  println("\nZadanie 3\n")



  var os1 = new Osoba("Paweł", "Walesiak")
  var os2 = new Osoba("Marzena", "Walesiak")
  var os3 = new Osoba("Dominika", "Bystrzycka")
  var os4 = new Osoba("Random", "X")
  var os5 = new Osoba("Kasia", "Y")


  def greetOsoba(osoba: Osoba): String = osoba.imie match {
    case "Paweł" => "Dzien dobry Panie Pawele"
    case "Dominika" => "Hello Dominika"
    case "Marzena" => "Welcome Marzena"
    case _ => "Guten Morgen: " + osoba.imie + " " + osoba.nazwisko
  }
  println(greetOsoba(os1))
  println(greetOsoba(os2))
  println(greetOsoba(os3))
  println(greetOsoba(os4))
  println(greetOsoba(os5))


  println("\nZadanie 4\n")

  def sqr(wrt: Int): Int = wrt * wrt

  def sqrThree(wrt: Int, func: Int => Int) = {
    func(func(func(wrt)))
  }

  println(sqrThree(6, sqr))


  println("\nZadanie 5\n")



  val p1 = new Osoba2("Conrado", "Moreno") with Pracownik
  val p2 = new Osoba2("Kamil", "Prus") with Nauczyciel
  val p3 = new Osoba2("Oliwier", "Janiak") with Student



}
