package com.timmeh.openhr.openholidays.model

import slick.driver.H2Driver.api._
import slick.lifted.{ProvenShape, ForeignKeyQuery}

// This file demonstrates how to map many columns into a nested case class using projections for each case class
class LargeTableExample1(tag: Tag)
  extends Table[LargeTableRow](tag, "LARGE_TABLE") {
  def idToD = (id, a, b, c, d)
  def id = column[Int]("ID", O.PrimaryKey)
  def a = column[String]("A")
  def b = column[String]("B")
  def c = column[String]("C")
  def d = column[String]("D")

  def eToI = (e, f, g, h, i)
  def e = column[String]("E")
  def f = column[String]("F")
  def g = column[String]("G")
  def h = column[String]("H")
  def i = column[String]("I")

  def jToN = (j, k, l, m, n)
  def j = column[String]("J")
  def k = column[String]("K")
  def l = column[String]("L")
  def m = column[String]("M")
  def n = column[String]("N")

  def oToS = (o, p, q, r, s)
  def o = column[String]("O")
  def p = column[String]("P")
  def q = column[String]("Q")
  def r = column[String]("R")
  def s = column[String]("S")

  def tToX = (t, u, v, w, x)
  def t = column[String]("T")
  def u = column[String]("U")
  def v = column[String]("V")
  def w = column[String]("W")
  def x = column[String]("X")

  def yToZ = (y, z)
  def y = column[String]("Y")
  def z = column[String]("Z")

// This is currently my favoured way of handling more than 22 columns...
  val idToDProjection = idToD <> (IdToD.tupled, IdToD.unapply)
  val eToIProjection = eToI <> (EToI.tupled, EToI.unapply)
  val jToNProjection = jToN <> (JToN.tupled, JToN.unapply)
  val oToSProjection = oToS <> (OToS.tupled, OToS.unapply)
  val tToXProjection = tToX <> (TToX.tupled, TToX.unapply)
  val yToZProjection = yToZ <> (YToZ.tupled, YToZ.unapply)

  def * = (idToDProjection, eToIProjection, jToNProjection, oToSProjection, tToXProjection, yToZProjection).shaped <> (
//      Map from tuple to case class
      {case (idToD, eToI, jToN, oToS, tToX, yToZ) => LargeTableRow(idToD, eToI, jToN, oToS, tToX, yToZ)},
//      Map from case class to tuple
      (lt: LargeTableRow) => Some(lt.idToD, lt.eToI, lt.jToN, lt.oToS, lt.tToX, lt.yToZ)
    )
}
