trait Nauczyciel extends Pracownik {
   var _pensja: Double = 0
  override def podatek: Double = _pensja * 0.1
}