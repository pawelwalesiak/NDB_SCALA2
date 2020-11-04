class KontoBankowe( _pstanKonta: Int){

  var _stanKonta = _pstanKonta
  def stanKonta1: Int = _stanKonta

  def wplata(kwota: Int): Unit = {
    _stanKonta += kwota
  }

  def wyplata(kwota: Int): Unit = {
    _stanKonta -= kwota
  }
  def this(){
    this(0)
  }

}

//var kb1: KontoBankowe = new KontoBankowe()
//var kb2 = new KontoBankowe(33d)
//println(kb1.toString)
//println(kb2.toString)