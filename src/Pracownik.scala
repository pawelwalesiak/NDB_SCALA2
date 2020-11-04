trait Pracownik extends Osoba2 {
  private var _pensja: Double = 0
  override def podatek: Double = _pensja * 0.2

}
